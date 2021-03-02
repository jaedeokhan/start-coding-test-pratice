# 동빈나님 선택 정렬
# 시간 복잡도 O(N^2) 
number = [1, 10, 5, 8, 7, 6, 4, 3, 2, 9]
index = 0
temp = 0 

for i in range(len(number)):
    min = 9999
    for j in range(i, len(number)):
        if(min > number[j]):
            min = number[j]
            index = j
    temp = number[i]
    number[i] = number[index]
    number[index] = temp;
            
print(number)
            
            
            
            
