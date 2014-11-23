#include <iostream>

using namespace std;

int main() {
    size_t cases;
    cin >> cases;

    string s;
    for (size_t i = 0; i < cases; i++) {
        cin >> s;

        size_t len = s.length();
        size_t total = 0;

        for (size_t j = 1; j < len; j++) {
            if (s[j - 1] == s[j]) {
                total++;
            }
        }

        cout << total << endl;
    }

    return 0;
}
