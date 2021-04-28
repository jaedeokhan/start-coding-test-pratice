# 2752번, 세수정렬
# 문제 : 숫자 세 개를 생각한 뒤에, 이를 오름차순으로 정렬하고 싶어 졌다.
# 숫자 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램을 작성하시오.
# 입력 : 숫자 세 개가 주어진다. 이 숫자는 1보다 크거나 같고, 1,000,000보다 작거나 같다. 이 숫자는 모두 다르다.
# 출력 : 제일 작은 수, 그 다음 수, 제일 큰 수를 차례대로 출력한다.

data = sorted(list(map(int, input().split())))

for d in data:
    print(d, end=' ')

# unpacking으로 출력하는 방법
print(*sorted(list(map(int, input().split()))))

# 선택정렬로 푸는 방법
index = 0

for i in range(len(data)): 
    min = 9999 
    for j in range(i ,len(data)):
        if min > data[j]:
            min = data[j]
            index = j
    data[i], data[index] = data[index], data[i] 

print(*data)


