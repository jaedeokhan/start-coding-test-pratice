import sys
sys.stdin = open("input/08_input.txt", "r")

n = int(input())
note = [input() for _ in range(n)]
poem = [input() for _ in range(n-1)]

answer = list(set(note) - set(poem))

print(''.join(answer))
