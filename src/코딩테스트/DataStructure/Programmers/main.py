import sys

input = sys.stdin.readline

stack = []

a = input().split()

for i in range(0, len(a)) :
  if len(stack) == 0 :
    stack.append(int(a[i]))
  else :
    if stack[-1] != int(a[i]) :
      stack.append(int(a[i]))
    else:
      continue

print(stack)