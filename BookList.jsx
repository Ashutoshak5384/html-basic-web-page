import React, { useState, useEffect } from 'react';
import axios from 'axios';
import Header from './Header';

const BookList = ({ user, onLogout }) => {
  const [books, setBooks] = useState([]);
  const [loading, setLoading] = useState(true);
  const [message, setMessage] = useState('');
  const [requestMessage, setRequestMessage] = useState('');

  useEffect(() => {
    fetchBooks();
  }, []);

  const fetchBooks = async () => {
    try {
      const response = await axios.get('/api/books');
      setBooks(response.data);
    } catch (error) {
      setMessage('Error fetching books');
    } finally {
      setLoading(false);
    }
  };

  const requestBook = async (bookId) => {
    try {
      const message = prompt('Enter a message for the book owner:');
      if (!message) return;

      await axios.post('/api/requests', {
        bookId,
        message
      });
      setRequestMessage('Book request sent successfully!');
      setTimeout(() => setRequestMessage(''), 3000);
    } catch (error) {
      setRequestMessage(error.response?.data?.message || 'Error sending request');
      setTimeout(() => setRequestMessage(''), 3000);
    }
  };

  if (loading) return <div className="loading">Loading books...</div>;

  return (
    <div>
      <Header user={user} onLogout={onLogout} />
      <div className="container">
        <h1>Available Books</h1>
        {message && <div className="alert alert-error">{message}</div>}
        {requestMessage && (
          <div className="alert alert-success">{requestMessage}</div>
        )}
        
        <div className="books-grid">
          {books.map(book => (
            <div key={book._id} className="book-card">
              {book.image && (
                <img
                  src={`https://bookswap-marketplace-5ly6.onrender.com/uploads/${book.image}`}
                  alt={book.title}
                  className="book-image"
                />
              )}
              <h3 className="book-title">{book.title}</h3>
              <p className="book-author">by {book.author}</p>
              <span className="book-condition">Condition: {book.condition}</span>
              <p className="book-owner">Posted by: {book.owner.username}</p>
              {book.owner._id !== user.id && (
                <button 
                  onClick={() => requestBook(book._id)}
                  className="btn btn-primary"
                  style={{ marginTop: '10px' }}
                >
                  Request Book
                </button>
              )}
            </div>
          ))}
        </div>
        
        {books.length === 0 && (
          <div style={{ textAlign: 'center', padding: '40px' }}>
            <h3>No books available at the moment</h3>
            <p>Be the first to add a book to the marketplace!</p>
          </div>
        )}
      </div>
    </div>
  );
};

export default BookList;