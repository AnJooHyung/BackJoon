from collections import deque
import sys

input = sys.stdin.readline

n = int(input())
dq = deque()

for i in range(n):
  cmd = input().strip()

  if cmd.split()[0] == "push" :
    x = cmd.split()[1]
    dq.append(int(x))

  elif cmd.split()[0] == "pop" :
    if dq:
      print(dq.popleft())
    else:
      print(-1)

  elif cmd.split()[0] == "size" :
    print(len(dq))

  elif cmd.split()[0] == "empty" :
    if dq:
      print(0)
    else :
      print(1)

  elif cmd.split()[0] == "front" :
    if dq:
      print(dq[0])
    else:
      print(-1)
  elif cmd.split()[0] == "back" :
    if dq:
      print(dq[-1])
    else:
      print(-1)






    