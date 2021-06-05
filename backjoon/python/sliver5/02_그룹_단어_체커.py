# 1316번

def check_group_word(word):
    if len(word) == 1:
        return 1

    for i in range(len(word)-1):
        # happy => h a p p y
        if word[i] == word[i+1]:
            continue
        elif word[i] in word[i+1:]:
            return 0
    return 1                                
    
import sys

n = int(sys.stdin.readline())
words = [sys.stdin.readline().strip() for i in range(n)]
cnt = 0

# word에 for문을 돌면서 각각의 count가 1이고, 옆의 값이랑 같은지?

for word in words:
    cnt += check_group_word(word)

print(cnt)

