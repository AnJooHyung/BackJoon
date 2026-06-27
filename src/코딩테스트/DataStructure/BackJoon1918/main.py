import sys

input = sys.stdin.readline

stack = []
stack2 = []
cmd = input().strip()

count = 0 # 전체 문자열의 길이를 세기 위한 변수
count2 = 0 # '('와 ')'의 개수를 세기 위한 변수 

while count < len(cmd) :
  if cmd[count] == '(' :
    count2 += 1
    count += 1
    while count2 > 0 :
      if cmd[count] == ')' :
        for i in range(len(stack2)) :
          print(stack2.pop(), end='')
        count2 -= 1
        count += 1
      else :
        if cmd[count] == '(' :
          count2 += 1
          count += 1
        elif cmd[count] >= 'A' and cmd[count] <= 'Z' :
          print(cmd[count], end='')
          count += 1
        else :
          stack2.append(cmd[count])
          count += 1
  else :
    if cmd[count] >= 'A' and cmd[count] <= 'Z' :
      print(cmd[count], end='')
      count += 1
    else :
      stack2.append(cmd[count])
      count += 1