import sys
# sys.stdin = open("input/02_input.txt")
sys.stdin = open("input/02_input_02.txt")

string = input()
stack = []
total = 0

for s in range(len(string)):
    print(string[s])

    if string[s] == '(':
        stack.append('(')
    else:
        if string[s-1] == '(':
            stack.pop()
            total += len(stack)
        else:
            stack.pop()
            total += 1

print(total)
