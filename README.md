# start-coding-test-pratice
2021.03.01 코딩 테스트 연습 시작 ~ 

## Programmers

### Level01


### SQL
* [01_select](https://github.com/jaedeokhan/start-coding-test-pratice/tree/main/programmers/sql/01_select)
* [02_sum_max_min](https://github.com/jaedeokhan/start-coding-test-pratice/tree/main/programmers/sql/02_sum_max_min)
* [03_group_by](https://github.com/jaedeokhan/start-coding-test-pratice/tree/main/programmers/sql/03_group_by)


## Algorithm_programming_tutorial


## Codeup-100
* [1 ~ 100.py](https://github.com/jaedeokhan/start-coding-test-pratice/tree/main/codeup-100)

## Python 함수

#### zip 
* zip()은 동일한 개수로 이루어진 자료형을 묶어주는 역할을 하는 함수이다.
* https://docs.python.org/ko/3/library/functions.html#zip
   * zip(*iterablesa)


```python
number = [1, 2, 3, 4]
name = ['han', 'kim', 'lee', 'hong']

number_name = list(zip (number, name))
print(number_name)

# 결과 : [ (1, 'han'), (2, 'kim'), (3, 'lee'), (4, 'hong') ] 
```

#### eval
* 매개변수로 받은 식을 문자열로 받아서  파이썬 코드로 실행할 때 사용합니다.
* https://docs.python.org/ko/3/library/functions.html#eval
   * eval(expression)

```python
x = 1
eval('x + 1')

# 결과 : 2
```

#### join
* 매개변수로 들어온 리스트에 있는 요소 하나하나를 합쳐서 하나의 문자열로 바꾸는 함수이다.
* https://docs.python.org/3/library/stdtypes.html#str.join
   * str.join(iterable)

```python
a = ['a','b','c','d','e','1','2','3']

print("".join(a))
# 결과 : abcde123

print("+".join(a))
# 결과 : a+b+c+d+e+1+2+3

```

#### replace
* 첫 번째 매개변수인 검색 문자를 두 번째 매개변수 치환 문자로 치환해주는 함수이다.
* https://docs.python.org/3/library/stdtypes.html#str.replace
   * str.replace(old, new[, count])

```python

fruit = "orange banana"

fruit_mod = fruit.replace("banana", "apple")

print(fruit)
print(fruit_mod)

# 결과 : orange banana
#        orange apple

```

#### open
* open(file, mode='r', buffering=-1, encoding=None, errors=None, newline=None, closefd=True, opener=None)
* file을 열고 해당 파일 객체를 돌려줍니다.
* https://docs.python.org/ko/3/library/functions.html#open
* open() 함수를 보통 파일에 접근할 때 주로 사용했는데 backjoon의 간단 연산 문제에서 입력을 받을때도 사용하는 것을 볼 수 있습니다.
   * https://www.acmicpc.net/source/24003061

```python

# 기본 사용
f = open("새파일.txt", "w")
f.close()

# 4개의 입력 시간을 받아서 분과 초를 출력하는 연산에서 open()활용
# 입력 
# 31
# 34
# 7
# 151
print(*divmod(sum(map(int, open(0)), 60)))


# 결과
# 3
# 43

```

#### divmod
* divmod(a, b)
* 몫과 나머지를 구하는 함수
* https://docs.python.org/ko/3/library/functions.html#divmod
* packing & unpacking
   * https://duwjdtn11.tistory.com/251

```python

a = 7
b = 5
print(*divmod(a, b))

# 결과=> unpacking
# 1 2

print(divmod(a, b))

# 결과=> packing
# (1, 2)

```
