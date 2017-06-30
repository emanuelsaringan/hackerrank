#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

namespace {

struct Edge {
  int u, v, wt;
  bool operator<(const Edge& other) {
    if (wt == other.wt) {
      return u + v < other.u + other.v;
    }
    return wt < other.wt;
  }
};

class UnionFind {
 public:
  UnionFind(size_t n) {
    root_.resize(n + 1);
    for (size_t i = 0; i < root_.size(); i++) {
      root_[i] = i;
    }
  }
  
  bool insert(size_t i, size_t j) {
    size_t root_i = root_[i];
    size_t root_j = root_[j];
    if (root_i != root_j) {
      for (size_t m = 0; m < root_.size(); m++) {
        if (root_[m] == root_i) root_[m] = root_j;
      }
      return true;
    }
    return false;
  }

 private:
  std::vector<size_t> root_;
};
  
}  // namespace

int main() {
  size_t N, M;
  cin >> N >> M;
  std::vector<Edge> edges(M);
  for (size_t i = 0; i < M; i++) {
    Edge e;
    cin >> e.u >> e.v >> e.wt;
    edges.push_back(e);
  }
  std::sort(edges.begin(), edges.end());
  long total = 0L;
  UnionFind uf(N);
  for (const Edge& edge : edges) {
    if (uf.insert(edge.u, edge.v)) {
      total += edge.wt;
    }
  }
  cout << total << endl;
  return 0;
}
