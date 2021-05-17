import sys
sys.stdin = open("input/01_input.txt", "rt")

def check_palindrome(x):

    result = ''

    for i in x:
        result = i + result

    return True if x == result else False

n = int(input())

for i in range(n):
    string = input()
    string = string.lower()

    if check_palindrome(string):
        print(f'#{i+1} YES')
    else:
        print(f'#{i+1} NO')
