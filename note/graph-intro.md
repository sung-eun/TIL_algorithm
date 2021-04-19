## Graph 간단 정리

- 유한개의 vertex(node)
- 유한개의 (u, v) edge
  - vertex 'u'와 vertex 'v'가 이어짐을 의미
  - edge는 weight/value/cost를 가질 수 있음
  - 방향성이 있는 경우 (u, v) ≠ (v, u)

> Graph 사용 예시) <br>
> 도시 또는 네트워크 등의 경로 표시<br>
> 링크드인, 페이스북에서 각 사용자를 vertex로 나타낼 수 있다.<br>

### Graph 표현 방법

1. Adjacency Matrix

2차원 배열로 표현, adj[i][j] = 0 or 1 or weigth
   - 장점
      - 구현하기 쉽다.
      - edge 삭제, vertex간 연결 확인이 효율적 -> 시간 복잡도 O(1)
   - 단점
      - 공간 복잡도 O(V²), edge가 적더라도 동일한 공간을 쓰게 됨
      - vertex 추가 시 시간 복잡도 O(V²)

2. Adjacency List
 
 List의 배열로 표현, 배열 크기 == vertex 개수
 array[i]는 i vertex가 이어진 vertex의 List를 나타냄
   - 장점
      - 공간 절약 가능 O(|V|+|E|), 최악의 경우 O(V²)
      - vertex 추가 용이
   - 단점
      - vertex간 연결 확인이 비효율적 -> O(V)

### DFS / BFS 
정리 잘 된 글: https://devuna.tistory.com/32
