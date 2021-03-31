# 버블정렬
# 앞 숫자와, 뒷 숫자 모두 바꾸면서 정렬하는 방법
# 옆에 있는 값과 비교하여 더 작은 값을 반복적으로 앞으로 보내는 정렬 방법
# 시간 복잡도 O(N * N)

data = [10, 1, 3, 5, 7, 8, 4, 9, 2, 6]

for i in range(len(data)): # 0~9
    for j in range(len(data) - i - 1):
        # 10 - 0 - 1 => 9 => 0~8
        # 10 - 1 - 1 => 8 => 0~7
        if data[j] > data[j+1]:
            temp = data[j]
            data[j] = data[j+1]
            data[j+1] = temp

print(data)
            
        
