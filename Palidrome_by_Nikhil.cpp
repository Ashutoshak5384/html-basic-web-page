#include <iostream>
using namespace std;

int main() {
    int n, r = 0, t;

    cout << "Enter the number: ";
    cin >> n;

    t = n;
    while (n != 0) {
        r = (r * 10) + (n % 10);
        n = n / 10;
    }

    if (t == r)
        cout << "The number is a palindrome." << endl;
    else
        cout << "The number is not a palindrome." << endl;

    return 0;
}
