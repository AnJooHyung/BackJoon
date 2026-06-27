import sys

input = sys.stdin.readline

T = int(input())

for i in range(T) :
  stack = []
  cmd = input().strip()
  for j in range(0, len(cmd)) :
    if cmd[j] == '(' :
      stack.append(cmd[j])
    else :
      if len(stack) == 0 :
        stack.append(cmd[j])
        break
      else :
        stack.pop()
  if stack :
    print("NO")
  else :
    print("YES")