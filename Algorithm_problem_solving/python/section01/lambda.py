'''
def plus_one(x):
    return x + 1

print(plus_one(1))


plus_two = lambda x : x + 2
print(plus_two(1))
'''

# 일반적인 방식 1
def plus_one(x):
    return x + 1

a = [1,2,3]
print(list(map(plus_one, a)))

# lambda 사용 방식 2
# 내장 함수의 인자로 사용이 유용
print(list(map(lambda x : x + 1, a)))
