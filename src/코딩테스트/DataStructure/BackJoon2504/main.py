import sys

input = sys.stdin.readline

cmd = input().strip()

sum = 0
tmp = 1
stack = []

for i in range(len(cmd)) :
  if cmd[i] == '(' :
    tmp *= 2
    stack.append(cmd[i])

  elif cmd[i] == '[' :
    tmp *= 3
    stack.append(cmd[i])

  elif cmd[i] == ')' :
    if not stack or stack[-1] == '[' :
      sum = 0
      break
    if cmd[i-1] == '(' :
      sum += tmp
    tmp //= 2
    stack.pop(-1)

  elif cmd[i] == ']' :
    if not stack or stack[-1] == '(' :
      sum = 0
      break
    if cmd[i-1] == '[' :
      sum += tmp
    tmp //= 3
    stack.pop(-1)

print(sum)  

