import sys
from collections import deque

input = sys.stdin.readline

def push_front(deque, x) :
  deque.insert(0, x)

def push_back(deque, x) :
  deque.append(x)

def pop_front(deque) :
  if deque :
    print(deque.popleft())
  else :
    print(-1)

def pop_back(deque) :
  if deque :
    print(deque.pop())
  else :
    print(-1)
    
def size(deque) :
  print(len(deque))

def empty(deque) :
  if deque :
    print(0)
  else :
    print(1)

def front(deque) :
  if deque :
    print(deque[0])
  else :
    print(-1)

def back(deque) :
  if deque :
    print(deque[-1])
  else :
    print(-1)
  
if __name__ == "__main__" :
  n = int(input())
  dq = deque()

  for i in range(n) :
    cmd = input().strip().split()

    if cmd[0] == "push_back" :
      push_back(dq, cmd[1])
    elif cmd[0] == "push_front" :
      push_front(dq, cmd[1])
    elif cmd[0] == "pop_front" :
      pop_front(dq)
    elif cmd[0] == "pop_back" :
      pop_back(dq)
    elif cmd[0] == "size" :
      size(dq)
    elif cmd[0] == "empty" :
      empty(dq)
    elif cmd[0] == "front" :
      front(dq)
    elif cmd[0] == "back" :
      back(dq)