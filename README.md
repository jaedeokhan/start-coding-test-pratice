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

```python
x = 1
eval('x + 1')

# 결과 : 2
```

#### join
* str.join(iterable)
* https://docs.python.org/3/library/stdtypes.html#str.join


