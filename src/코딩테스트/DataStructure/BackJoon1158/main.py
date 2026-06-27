import sys

# 직접 손으로 과정을 그리면서 하면 규칙이 보임!

input = sys.stdin.readline

def Josephus(queue, k) :
  result = []
  index = k - 1
  while queue :
    if index >= len(queue) :
      index = index % len(queue)
      result.append(queue.pop(index))
    else :
      result.append(queue.pop(index))
    index += k - 1
  return result 


if __name__ == "__main__" :
  queue = []
  n, k = map(int, input().split())

  for i in range(1, n + 1) :
    queue.append(i)

  result = Josephus(queue, k)

  print("<", end = "")
  for i in range(0, len(result)) :
    if i == len(result) - 1 :
      print(result[i], end = ">")
    else :
      print(result[i], end = ", ")
