import sys
from collections import deque

# 원으로 나타내는 queue 형태일 때 rotate 함수 사용
# deque를 사용할 때 index와 value를 동시에 저장할 수 있는 enumerate 함수 사용


input = sys.stdin.readline

n = int(input())
dq = deque(enumerate(map(int, input().split())))

stack = []

while dq :
  idx, val = dq.popleft()
  stack.append(idx + 1)

  if val > 0 :
    dq.rotate(-(val-1))
  else :
    dq.rotate(-val)

for i in range(0, len(stack)) :
  print(stack[i], end= ' ')



