import sys

input = sys.stdin.readline

n = int(input())
stack = list(map(int, input().split()))
answer = [0] * n # 정답지
tmp = [] # 위치정보 저장

for i in range(n) :
  t = stack[i]
  while tmp and stack[tmp[-1]] < t :
    tmp.pop()
  if tmp :
    answer[i] = tmp[-1] + 1
  tmp.append(i)

print(*answer)