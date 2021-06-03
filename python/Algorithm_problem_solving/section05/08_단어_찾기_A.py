import sys
sys.stdin = open("input/08_input.txt", "r")

# dictionary를 사용해서 해결하는 방식
n = int(input())
poem = dict()

for i in range(n):
    word = input()
    poem[word] = 1

for i in range(n-1):
    word = input()
    poem[word] = 0

for key,value in poem.items():
    if value == 1:
        print(key)
        break
