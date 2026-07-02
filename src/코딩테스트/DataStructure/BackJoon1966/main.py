import sys
from collections import deque
input = sys.stdin.readline

n = int(input())

for i in range(n) :
  a, b = map(int, input().split())
  L = list(map(int, input().split()))
  q = deque(L)

  result = 1
  while q :
    if q[0] < max(q) :
      q.append(q.popleft())
    else :
      if b == 0 :
        break

      q.popleft()
      result += 1

    b = b - 1 if b > 0 else len(q) - 1
  print(result)