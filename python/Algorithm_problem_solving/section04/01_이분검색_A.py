import sys
sys.stdin = open("input/01_input.txt", "r")

n,m = map(int, input().split())
a = list(map(int, input().split()))

# 이분검색을 하기 위해서는 정렬이 되어 있어야 한다.
a.sort()
print(a)

lt = 0
rt = n - 1

while lt <= rt:

    mid = (lt + rt) // 2
    
    if a[mid] == m:
        print(mid+1)
        break
    
    elif a[mid] > m:
        rt = mid - 1

    else:
        lt = mid + 1


