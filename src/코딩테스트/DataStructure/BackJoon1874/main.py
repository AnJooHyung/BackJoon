import sys

input = sys.stdin.readline

n = int(input())
stack = []
result = []
s = False

cnt = 1
for i in range(n) :
  a = int(input())
  while cnt <= a :
    stack.append(cnt)
    result.append("+")
    cnt += 1
  if stack[-1] == a :
    stack.pop()
    result.append("-")
  else :
    find = True

    

if s == True :
  print("NO")
else :
  for i in range(0, len(result)) :
    print(result[i])