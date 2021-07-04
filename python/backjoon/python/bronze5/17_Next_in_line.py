# 문제 : Given the ages of the youngest and middle children, what is the age of the oldest child?
# 입력 : The input consists of two integers, each on a seperate line
# The first line is the age Y of the youngest child.
# The second line is the age M of the middle child.
# 출력 : The output will be the age of the oldest child.

# 나의 코드

young = int(input())
middle = int(input())

diff = middle - young
old = middle + diff

print(old)

# 다른 사람의 코드

a,b=map(int, input().split())
print(2*b-a)
