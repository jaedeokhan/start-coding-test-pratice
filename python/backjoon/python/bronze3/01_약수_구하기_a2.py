# 다른 사람의 풀이2
# k번째 약수를 출력해야 하니 k를 가감시키면서 k가 0이 될때의 i를 출력 후 break한다. break에 걸리지 않으면 k번째 약수가 존재하지 않기에 for-else 구문으로 출력해준다.
n,k = map(int, input().split())

for i in range(1, n+1):
    if n % i == 0:
        k -=1
    if k == 0:
        print(i)
        break
else:
    print(0)
