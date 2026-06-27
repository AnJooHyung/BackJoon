import sys

input = sys.stdin.readline

n = int(input())

stack = []

for i in range(n) :
  cmd = input().strip()

  if cmd.split()[0] == "push" :
    stack.append(int(cmd.split()[1]))
  elif cmd.split()[0] == "pop" :
    if stack :
      print(stack.pop())
    else:
      print(-1)
  elif cmd.split()[0] == "size" :
    print(len(stack))
  elif cmd.split()[0] == "empty" :
    if stack :
      print(0)
    else :
      print(1)
  elif cmd.split()[0] == "top" :
    if stack :
      print(stack[-1])
    else:
      print(-1)
