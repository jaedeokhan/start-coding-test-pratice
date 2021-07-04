# 버블정렬
# 앞 숫자와, 뒷 숫자 모두 바꾸면서 정렬하는 방법
# 옆에 있는 값과 비교하여 더 작은 값을 반복적으로 앞으로 보내는 정렬 방법
# 시간 복잡도 O(N * N)

data = list(map(int, input().split()))

for i in range(len(data)): # 10 => 0 ~ 9
    for j in range(len(data) - i - 1):
    # 10 - 0 - 1 => 9 => 0 ~ 8
    # 10 - 1 - 1 => 8 => 0 ~ 7
    # 10 - 2 - 1 => 7 => 0 ~ 6
    # ...
    # 10 - 9 - 1 => 0 => 0
        if(data[j] > data[j+1]):
            data[j], data[j+1] = data[j+1], data[j]
        
for i in range(len(data)):
	print(data[i], end=' ')
