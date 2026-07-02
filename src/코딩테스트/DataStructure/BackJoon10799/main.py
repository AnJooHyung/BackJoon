import sys

input = sys.stdin.readline

cmd = input().strip()

sum = 0
cnt = 0

for i in range(len(cmd)) :
  if cmd[i] == '(' :
    cnt += 1
  elif cmd[i] == ')' :
    cnt -= 1
    if cmd[i-1] == '(' :
      sum += cnt
    elif cmd[i-1] == ')' :
      sum += 1

print(sum)