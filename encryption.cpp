#include<iostream>
#include<fstream>
#include<stdio.h>
using namespace std;

int main()
{
    char fileName[100], ch;
    fstream fps, fpt;

    cout << "Enter the Name of File: ";
    cin.getline(fileName, 100); // SAFER alternative to gets()

    fps.open(fileName, fstream::in);
    if (!fps)
    {
        cout << "\nError Occurred, Opening the Source File (to Read)!";
        return 0;
    }

    fpt.open("tmp.txt", fstream::out);
    if (!fpt)
    {
        cout << "\nError Occurred, Opening/Creating the tmp File!";
        return 0;
    }

    while (fps >> noskipws >> ch)
    {
        ch = ch + 100; // basic encryption
        fpt << ch;
    }

    fps.close();
    fpt.close();

    fps.open(fileName, fstream::out);
    if (!fps)
    {
        cout << "\nError Occurred, Opening the Source File (to write)!";
        return 0;
    }

    fpt.open("tmp.txt", fstream::in);
    if (!fpt)
    {
        cout << "\nError Occurred, Opening the tmp File!";
        return 0;
    }

    while (fpt >> noskipws >> ch)
        fps << ch;

    fps.close();
    fpt.close();

    cout << "\nFile '" << fileName << "' Encrypted Successfully!\n";
    return 0;
}
