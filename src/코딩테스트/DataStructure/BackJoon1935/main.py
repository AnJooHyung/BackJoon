import sys

input = sys.stdin.readline

n = int(input())
queue = list(input())
num = [int(input()) for i in range(n)]

stack = []

for i in queue :
  if i.isalpha() :
    stack.append(num[ord(i) - 65])
  else :
    a = stack.pop()
    if stack :
      result = stack.pop()

    if i == '+' :
      result += a
    elif i == '-' :
      result -= a
    elif i == '/' :
      result /= a
    elif i == '*' :
      result *= a
    
    stack.append(result)

print("%.2f" %stack[-1])


# import sys

# input = sys.stdin.readline

# n = int(input())
# queue = list(input())
# num = [int(input()) for i in range(n)]

# stack = []

# for i in queue :
#   if i.isalpha() : # isalpha는 알파벳인지 아닌지 확인하는 함수
#     stack.append(num[ord(i) - 65]) # ord 함수: char형 자료형을 int형으로 바꿔줌
#   else :
#     a = stack.pop()
#     if stack :
#       result = stack.pop()

#     if i == '+' :
#       result += a
#     elif i == '-' :
#       result -= a
#     elif i == '*' :
#       result *= a
#     elif i == '/' :
#       result /= a
    
#     stack.append(result)
  
# print("%.2f" %stack[-1])




