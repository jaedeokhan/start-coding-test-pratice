from itertools import permutations

l,c = map(int, input().split())
char = list(map(str, input().split()))
char.sort()

print(char)

test = list(permutations(char, l))


for i, j, k, w in test:
    if i < j  and j < k and k < w:
        print(i, j, k, w)

print(l,c)
print(char)
print(test)
