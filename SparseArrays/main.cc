#include <iostream>
#include <string>
#include <unordered_map>

using namespace std;

int main() {
  size_t N, Q;
  cin >> N;
  std::unordered_map<string, int> tally(N);
  string str;
  for (size_t i = 0; i < N; i++) {
    cin >> str;
    tally[str]++;
  }
  cin >> Q;
  string query;
  for (size_t i = 0; i < Q; i++) {
    cin >> query;
    cout << tally[query] << endl;
  }
  return 0;
}
