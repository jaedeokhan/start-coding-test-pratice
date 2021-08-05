[33mcommit 661589da849620bdc5c7fa3de5f4f0a0be0b9080[m[33m ([m[1;36mHEAD -> [m[1;32mmain[m[33m)[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sun Jul 11 23:20:14 2021 +0900

    add [java] Level01 28_로또의 최고 순위와 최저 순위
    -   HashMap<Integer, Integer>에 <로또 번호 일치횟수, 등수>를 저장해서
    해결

[33mcommit 9b87cee0c2125c99de6dcfc2bc27912e5367167e[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sun Jul 11 00:09:24 2021 +0900

    add [java] Level01 27_문자열 내 마음대로 정렬하기
    - Comparator()를 사용해서 String s에 n번째 인덱스를 기준으로 정렬을 해서
    해결
       - 그러나, int n = 2이고, "abcd", "abce" 와 같이 동일한 'c' 값이
       있으면 o1.compareTo(o2) 사전식으로 정렬해서 해결

[33mcommit a92c038f2a45b2a60772123ed81b7798eececd74[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sun Jul 11 00:08:06 2021 +0900

    add [java] Level01 26_문자열 내림차순으로 배치하기
    - String s를 toCharArray()로 char[] 배열로 만들어주고, Arrays.sort()후
    StringBuilder().reverse()로 해결

[33mcommit 2fcfa11c6ac368100432b12edfcf2d7e896b68ad[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jul 10 17:57:40 2021 +0900

    add [java] Level01 25_서울에서 김서방 찾기
    1. for문을 돌면서 seoul[i].equals("Kim")이 일치하면 찾아서 break
    2. Arrays.asList()를 통해서 indexOf("kim")의 인덱스 값을 찾아서 해결
       - ArrayList로 공간을 만들어 줘야 해서 성능상의 이점을 고려해서
       사용해야 한다.

[33mcommit a2edde357172108a231f671fd0032f05a3dab99b[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jul 10 17:41:42 2021 +0900

    add [java] Level01 24_소수의 개수
    1. n이 1,000,000인 줄 모르고 O(n ^ 2) 방식으로 접근하려다 timeout
    2. 에라토스테네스 체 방식으로 해결!
       - n + 1만큼의 int[] visit를 만들어주고, 0이면 소수이기에 answer++하고
       해당하는 수의 배수를 1로 변경!

[33mcommit 8d029197f893f8e1232c3f5a38e697483ced7c59[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jul 10 17:16:44 2021 +0900

    add [java] Level01 23_수박수박수박수박수박수
    1. 짝수, 홀수를 구분해서 삼항 연산자로 해결
    2. char[]배열과 String.replace().substring()을 통한 해결

[33mcommit 4b8cb1f059679ee05c4bc77dd5628f0d2b97c6b3[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jul 10 16:27:58 2021 +0900

    add [java] Level01 22_시저 암호
    1. 아스키 코드의 A-Z, a-z 대소문자를 구분하고, x + n(거리)가 대소문자 z,
    Z를 넘어서면 분기 구분
    2. WOw... 이 방법에서는
       - (x - 'A' + n) % 26 + 'A'
       - Ex) ('Z' - 'A' + 1) % 26 + 'A'
       -     (90 - 65 + 1) % 26 + 'A'
       -     26 % 26 + 'A'
       -     0 + 'A' => A가 나온다...

[33mcommit 56686296c879f173c19a567e8142abcfb5e71eb5[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jul 10 15:38:00 2021 +0900

    add [java] Level01 21_약수의 합
    1. 정수n의 모든 약수의 더한 값을 리턴하는 것이 문제였다.
       - 처음에는 i = 1를 i <= n 이하를 모두 돌면서 해결을 했는데, n의 자기
       자신의 숫자는 약수이기에 n / 2만큼 돌면서 약수를 찾고, 마지막에
       자신의 수를 더해주는 방법으로 해결

[33mcommit 31f54d49175ae70ae510af4d968e543727594e87[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jul 10 00:04:15 2021 +0900

    add [java] Level01 20_문자열 다루기 기본
    1. String.chars()
       .filter(x - > Character.isDidgit(x))
       .count()를 s.length()비교해 해결
    2. 정규 표현식 사용 -  ^\\d{4}|{6}}$ 으로 숫자만 4,6개

[33mcommit 6f60f96060f6875efc7d637e25f37f2002494509[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri Jul 9 23:43:00 2021 +0900

    add [java] Level01 19_문자열 내 p와 y의 개수
    1. 일반 for문과 삼항 연산자 구현
    2. String.chars()
       .filter(e -> 'P' == e)
       .count()와 'Y'의 스트림으로 필터의 카운터 수를 삼항 연산 와우..

[33mcommit e00d3ebfcd0e0aa43fee43beaa4357302293a06a[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri Jul 9 23:35:02 2021 +0900

    add [java] Level01 18_문자열을 정수로 바꾸기

[33mcommit 99285ec4edc6c8283f1a5b7e435a74bf5f8ee044[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri Jul 9 23:33:27 2021 +0900

    add [java] Level01 17_이상한 문자 만들기

[33mcommit 53e5277a23fdd23e61c1562d71ad8c080959511b[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri Jul 9 19:14:08 2021 +0900

    add [java] Level01 16_자릿수 더하기
    1. num이 0이 아닐때 까지 나머지와 몫을 이용해서 해결
    2. int num을 String.valueOf(num)를 이용해서 String으로 변환 후
    split("")해서 타입 변환으로 덧셈 복합 연산해줘서 해결
    3. int num을 String.valueOf(num)으로 변환 후 toCharArray()를 사용해서
    char[] 배열로 변환 후 향상된 for문으로 char number를 아스키 코드
    연산으로 해결

[33mcommit 7083af396380a907149f140b87d6a8b4db599cfb[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri Jul 9 18:54:41 2021 +0900

    add [java] Section05 07_교육과정 설계
    - 문제의 핵심은 필수 과목이 "CBA"라면 선택한 과목에서 "CBA" 순서를
    유지하는지 판단하는 것!
    
    1. 필수과목의 char x를 이용해서 선택 과목.indexOf(x) 로 찾아서
    indexArray에 넣어주고 나서, for문을 indexArray.length - 1 만큼 돌고 앞의
    값(문자 인덱스 번호)이 뒤에 값보다 크다면 return "NO"
    2. Queue로 풀어보려 했는데, O(N ^ 2) 방식으로 풀어서 비효율적쓰...
       - 필수과목 큐를 만들어서 먼저 다 넣어주고, 1차 for문은
       필수과목.length만큼 돌고 2차 for문은 선택 과목.length만큼 돌아서
       필수과목.charAt(i) == 선택과목.charAt(j) 일치하면 targetQueue에 해당
       문자 추가 후 종료
    3. 필수과목 큐를 만들고 필수과목들을 넣어주고, for문을 선택과목만큼
    향상된 for문 돌고 if (queue.contains(x))처럼 큐에 필수 과목의 값이
    있으면  if(x != queue.poll()) 값을 꺼내고 x와 queue의 앞의 값이 일치하지
    않으면 필수과목을 순서대로 신청한게 아니니 return "NO"를 한다.
    return "NO"와 같이

[33mcommit 4d5bf0e90e70227cb5870806207e78ba2907fb37[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri Jul 9 17:29:44 2021 +0900

    add [java] Section05 06_공주 구하기
    - Queue<Integer> queue = new LinkedList<>();
       - Queue 사용
    - queue.offer() == insert, queue.poll() == 꺼내기
    - 문제를 접근할 때 인덱스를 이용해서 풀어야하는 줄 알고 계속 해봤는데
    실패를 함. for문으로 k-1만큼 반복해서 poll()하는 것을 바로 offer()해서
     queue에 넣는 방법을 해보니 성공!

[33mcommit d312f13ebd90e4fbf2f17f357641cce12155bf9b[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri Jul 9 02:13:07 2021 +0900

    add [java] Level02 01_가장 큰 수 - Comparable(), Comparator() 예제
    따라해보며 연습

[33mcommit 78c4d1f82b92fbcbd2c0c06ff196dd9e4ce7d1bb[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri Jul 9 02:11:15 2021 +0900

    add [java] Section05 05_쇠막대기
    1. Stack을 사용해서 쇠막대기인지, 레이저인지 잘 체크해서 풀기

[33mcommit 8c49b5c76b466b5406601503de34d30c999d7414[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jul 8 21:20:45 2021 +0900

    add [java] Level01 15_자연수 뒤집어 배열로 만들기
    1. Answer01_int_array.java
       - String.valueOf(num).length()으로 길이 판단
       - num %= 10, num /= 10으로 해결
    2. Answer02_StringBuilder_reverse.java
       - StringBuilder.reverse() 이용
       - split("")로 해결

[33mcommit d7138a2770ffa410b12d75d0b1b5b6dcfe1b6c22[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jul 8 20:48:31 2021 +0900

    add [java] Level01 14_정수 내림차순으로 배치하기
    1.
       - String[] stringArray = String.valueOf(num).split("") // long 타입인 num 변수를 String화
       해서 split("")
       - StringBuilder answer에 forEach를 해서 각각의 항목 append()
       - return 시에 Long.parseLong(문자열)
     2.
       - Inttream으로 .chars() // char 배열로
       - .sorted() // 정렬 진행
       - .forEach(c -> answer = Chacter.valueOf((char)c) + answer) 더해서
       해결

[33mcommit 2d33101e30a064091ffff99835eb7ad95c89a170[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jul 8 20:29:48 2021 +0900

    add [java] Level01 13_정수 제곱근 판별
    1. for문을 통한 해결 방식
    2. Math.pow()와 Math.sqrt()를 사용한 해결 방법

[33mcommit 5fe2a198b29d6ef56ff69633bd8dc4ee9dbc85d4[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jul 8 20:08:49 2021 +0900

    add [java] Level01 11_짝수와 홀수, 12_제일 작은 수 제거하기
    - 11_짝수와 홀수
    1. 짝수와 홀수는 삼항 연산자 처리
    
    - 12_제일 작은 수 제거하기
    1. ArrayList와 stream().mapToInt(Integer::intValue).toArray() 사용
    2. 가장 작은 인덱스를 찾아서 뒤의 숫자들을 앞으로 하나씩 댕겨서 해결
    3. stream(arr).min().getAsInt()로 최솟값 찾고, filter(i -> i !=
    min).toArray()를 사용해서 해결
    4. Collections.min(numbers)을 찾고, remove()를 사용

[33mcommit 4b072afbd27ba195da7a43d7df2035f792e131d4[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jul 8 17:03:11 2021 +0900

    add [java] Level01 11_짝수와 홀수

[33mcommit 739d01d1b42128ce0d339c1db0eb4e23056ca083[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jul 8 16:57:55 2021 +0900

    add [java] Level01 10_최대공약수와 최소공배수
    1. for문 1부터 n이하까지 돌면서 int n,m을 i로 나눠서 둘 다 0으로 나눠
    떨어지면 최대공약수, for문을 돌면서 n * m 부터 0보다 클때까지 i를
    n,m으로 나눠 0으로 나눠 떨어지면 최소공배수
    2. 유클리드 호제법을 통한 해결법

[33mcommit 95c6ede41663fd94436ffa81e3923d8a976a8fb3[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jul 8 15:56:47 2021 +0900

    add [java] Level01 09_콜라츠 추축
    1. 626331의 값을 콜라츠 추측을할 때 int로 해결하려고 하니 오버플로가
    발생해서 원하는 값이 제대로 나오지 않아서 long으로 처리를 해준다.

[33mcommit 4c51aa9aba06d1b1f3f164e5832a0e4cc0fbfc32[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jul 8 15:10:49 2021 +0900

    add [java] Level01 08_평균 구하기
    1. 일반 배열 접근 방법
    2. Arrays.stream(arr).average() 이용해서 구하기
    3. IntStream.of(arr).sum() / arr.length 를 이용해서 구하기

[33mcommit 683da79b77785e2557cdf191f1aaea180be1792b[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jul 8 14:55:31 2021 +0900

    add [java] Level01 07_하샤드 수
    1. 각 자릿수의 합을 구하기 위해서 int x를 % 10, / 10으로 구하기
    2. int x를 Integer.toString()으로 변경하고 toCharArray()로 char[] 배열에
    담아주고 아스키 코드를 연산해서 해결
    3. int x를 String.valueOf(x).split("")로 문자열로 변경 후 띄어씌기 없이
    하나씩 split() 후 연산해서 해결

[33mcommit 2ada22080236da6445c3e44f3fd9b7d2533fe58d[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jul 8 14:19:58 2021 +0900

    add [java] Level01 06_핸드폰 번호 가리기
    1. StringBuilder 사용
    2. toCharArray(), valueOf() 사용
    3. replaceAll(".(?=.{4})", "*") 뒤에 4자리 빼고 모두 *으로 변경해서 해결

[33mcommit 7163ad6c20e098a64a42f5dc08534315a5fbd326[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jul 8 13:31:31 2021 +0900

    add [java] Level01 행렬의 덧셈
    -  각 행과 열의 길이를 구해서 배열을 만들어주고 두 배열을 덧셈해줘서
    해당 하는 인덱스에 값 할당

[33mcommit d1f59ef085ff1c3a9c542819cd5e97f39197d06f[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jul 8 12:09:34 2021 +0900

    add [java] Level01 04_x만큼 간격이 있는 n개의 숫자
    1. sum 에 복합 연산해가며 배열에 인덱스로 넣어주기
    2. array의 앞의 값에 x를 더해서 넣어주기

[33mcommit 89ef16d3dd18632a5fe91e9fac2013509c972c2f[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jul 8 11:44:31 2021 +0900

    add [java] Level01 03_직사각형_별찍기
    1. 이중 for문 구현
    2. StringBuilder()사용, IntStream사용

[33mcommit d548ad99c009f9d44913c362d8f482e25d10fd93[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jul 8 11:37:57 2021 +0900

    add [java] Level01 02_K번째 수
    1. copyOfRange(array, start, end)와 Arrays.sort() 오름차순 정렬을
    이용해서 해결
    2. while-for문으로 구현, quickSort() 구현 해결

[33mcommit 60dc3ab2976af033e39075799470b6d9ef172e74[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jul 8 01:01:12 2021 +0900

    add Programmers Level01 01_음양 더하기
    - Answer02_삼항_연산자_사용 : signs[i] 가 boolean 배열이니 if true이면
    1, else false이면 -1로 연산하도록!

[33mcommit 822782cb15c6608aed46ce05182e404aafbaeb50[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Jul 7 16:10:29 2021 +0900

    add Section05 04_후위식 연산(postfix)
    1. Main.java : char x 를 Stack<Integer>에 넣기 위해서
    Character.getNumericValue(x)를 통해서 char -> int로 변환해서 넣어서 해결
    2. Main_A.java : char x를 Stack<Integer>에 넣기 위해서 x - 48을 빼서
    정수를 넣어줘서 해결

[33mcommit 8ac707e07583f15107bdb1a29d672577e876abbb[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Jul 7 14:48:19 2021 +0900

    add Section05 03_크레인 인형 뽑기
    Main.java, Main_A.java : stack.peek()를 통해 같은 값이이면 stack.pop()하고, answer
    += 2로 수행

[33mcommit 542bda2c73608010deca59c4dcba42d29a8b7cba[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Jul 7 00:35:40 2021 +0900

    add Section05 02_괄호문자제거
    1. Main_1_stack_string.java : '(' , ')' 문자인지 체크해서 StringBuffer에
    괄호에 둘러싸이지 않은 문자 추가해서 해결
    2. Main_2_stack.java : Stack에 '(', 문자는 모두 추가하고, ')'는
    while문으로 '(' 여는 문자를 만날때 까지 모두 pop()하면서 해결
    3. Main_A1.java : if문에 ')' 닫는 괄호를 체크해서 else로 라인수를 더
    줄이며 해결

[33mcommit 80b837620a106160a1c29f74c3eeb11cefd9e8e4[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Jul 6 23:29:10 2021 +0900

    modify project

[33mcommit 4efb6824f5b291eff74780cec0a04bee53650baf[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Jul 6 23:22:48 2021 +0900

    modify project

[33mcommit d355e1f58f23f8b4d2395cc0195ed87623c35e66[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Jul 6 23:20:25 2021 +0900

    add Section05 01_올바른 괄호
    1. Stack이 비어있으면 try-catch 문으로 해결
    2. Stack이 비어있으면 isEmpty()로 해결

[33mcommit 13e8621215aa715c8304fd590f13d6f07c28a16e[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Jul 5 21:36:50 2021 +0900

    [java] Section04 05_K번째 큰 수 1> TreeSet 사용 방법 - 중복제거 가능, 정렬 가능

[33mcommit f34f489ebbc5783e1430c334a195d930ed7dc8d6[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Jul 5 17:05:47 2021 +0900

    modify folder

[33mcommit 4962273b9e809199db4c3c02660b30c9e1e6e2c9[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Jul 5 17:03:53 2021 +0900

    modify folder

[33mcommit 81128ce41500ee6d5e503c73f5f93466687d020a[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Jul 5 16:59:31 2021 +0900

    modify folder

[33mcommit dd830f256f436660c20d1c53f149d3f91b2af651[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sun Jul 4 13:54:29 2021 +0900

    폴더 수정

[33mcommit 4d0828ea490d052c3b0ff964a76e4b6a245d89cb[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jul 3 17:25:49 2021 +0900

    [java] Section04 02_아나그램 1> 리스트 해결방법 2> 해쉬 해결
