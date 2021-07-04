# 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
# 배열에 오름차순으로 담아
# return 하도록 solution 함수를 완성해주세요.
# 입력 : 1 => [2,1,3,4,1]   2 => [5,0,2,7]
# 출력 :   => [2,3,4,5,6,7]   => [2,5,7,9,12]

# 1. 중복 제거와 오름차순 정렬 과정을 하단과 같이 처리하지 않은 첫 번째 코드
def solution(numbers):

    answer = []
    
    for i in range(len(numbers) - 1):
        for j in range(i+1 ,len(numbers)):
            
            answer.append(numbers[i] + numbers[j])


    answer = list(set(answer))
    answer = answer.sort()
            
    return answer


# 2. 중복 제거와 오름차순 정렬을 sorted를 사용해서 정렬 후 return
def solution(numbers):

    answer = []
    
    for i in range(len(numbers) - 1):
        for j in range(i+1 ,len(numbers)):
            
            answer.append(numbers[i] + numbers[j])
            
    return sorted(list(set(answer)))

# 3. 조합(combination) 사용해서 해결
# nCr =  nPr/r!
# 리스트 =>[1, 2, 3]
# [(1,2), (1,3), (2,1), (2,3), (3,1), (3,2)]
# [(1,2), (1,3), (2,3)]
from itertools combinations

def solution(numbers):

    answer = []
    l = list(combination(numbers, 2))

    for i in l:
        answer.append(i[0] + i[1])
        
   return sorted(list(set(answer)))
