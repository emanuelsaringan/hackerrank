#include <iostream>
#include <string.h>

using namespace std;

const size_t ALPHABET_SIZE = 26;

int main() {
  string a;
  string b;

  cin >> a;
  cin >> b;

  size_t aTally[ALPHABET_SIZE];
  size_t bTally[ALPHABET_SIZE];

  int num_bytes = ALPHABET_SIZE * sizeof(size_t);
  memset(aTally, 0, num_bytes);
  memset(bTally, 0, num_bytes);

  size_t aLen = a.length();
  size_t bLen = b.length();

  for (size_t i = 0; i < aLen; i++) {
    aTally[a[i] - 'a']++;
  }

  for (size_t i = 0; i < bLen; i++) {
    bTally[b[i] - 'a']++;
  }

  size_t diff = 0;
  for (size_t i = 0; i < ALPHABET_SIZE; i++) {
    diff += abs((long) (aTally[i] - bTally[i]));
  }

  cout << diff << endl;

  return 0;
}
