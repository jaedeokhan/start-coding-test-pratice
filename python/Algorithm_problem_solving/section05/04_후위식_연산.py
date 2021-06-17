import sys
sys.stdin = open("input/04_input.txt")

def calculate(x, y, oper):

    if oper == '+':
        return y + x
    elif oper == '-':
        return y - x
    elif oper == '*':
        return y * x
    else: # /
        return y // x

a = input()
stack = []

for x in a:
    if x.isdecimal():
        stack.append(x)
    else:
        stack.append(calculate(int(stack.pop()), int(stack.pop()), x))

print(stack)
