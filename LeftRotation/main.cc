#include <vector>
#include <iostream>

using namespace std;

int main() {
  int n, d;
  cin >> n >> d;
  std::vector<int> a(n);
  for (size_t i = 0; i < n; i++) {
    cin >> a[i];
  }
  for (size_t i = 0; i < n; i++) {
    cout << a[(i + d) % n] << " ";
  }
  cout << endl;
  return 0;
}
