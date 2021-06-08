import sys
sys.stdin = open("input/05_input.txt", "r")

def gcd(x, y):
    while y:
        x, y = y, x % y
    return x

def lcd(x, y):
    
    return (x * y) // gcd(x,y)

n,m = map(int, input().split())

print(gcd(n,m))
print(lcd(n,m))
