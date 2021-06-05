# 1. 문자열을 word에 입력받는다.
# 2. 대소문자를 구별하지 않기에 모두 소문자화한다.
# 3. word를 for문을 돌려서 딕셔너리에 값을 추가한다.
# 4. 값이 들어있는 딕셔너리를 정렬해준다.
# 5. 가장 많이 사용된 알파벳을 체그하고 브레이크
# 6. 가장 많이 사용된 단어 출력
word = input()
word = word.lower()
word_check = {}

for w in word:
    word_check[w] = word_check.get(w, 0) + 1

word_check = sorted(word_check.items(), reverse=True, key = lambda item : item[1])

for i in range(len(word_check)):

    if len(word) == 1:
        print(word.upper())
        break

    if word_check[i][1] == word_check[i+1][1]:
        print('?')
        break
    else:
        print(word_check[i][0].upper())
        break
