[33mcommit 9b87cee0c2125c99de6dcfc2bc27912e5367167e[m[33m ([m[1;36mHEAD -> [m[1;32mmain[m[33m)[m
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

[33mcommit 2e904db1608862cb98c3ac8062a3b6118241926f[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Jun 30 17:48:54 2021 +0900

    [java] Section04 01_학급 회장 1> containsKey(Object key) 2> getOrDefault(Object key, V defaultValue)

[33mcommit 5200d488319e2272e5ba297d90f68e8b4cf174a2[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Jun 30 15:52:22 2021 +0900

    [java] Section03 06_최대 길이 연속부분수열

[33mcommit b30ac6050628dd950ff90af5211445ff2e71bcca[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Jun 30 08:47:34 2021 +0900

    [java] Section05 05_연속된 자연수의 합 1> 투포인터 슬라이딩 2> 나머지와 몫으로 해결방법

[33mcommit 1d8f8eab90afe1b334b46fdeecd4f7615ebbbc90[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Jun 28 12:03:22 2021 +0900

    [java] Section03 04_연속 부분수열 1> O(n ^ 2) 시간 복잡도 방법 2> O(n) 방법

[33mcommit 8a57d1e91eca8c4dc2adff1972aafa49a6c2a226[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sun Jun 27 02:40:22 2021 +0900

    [java] Section03 03_최대 매출 1> 0(n ^ 2) 방식은 시간초과 2> Sliding Window 방식 사용

[33mcommit 6405c311d329d4ce72513180ce0494797c999fc6[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jun 26 17:47:06 2021 +0900

    [java] Section03 02_공통원소 구하기 Main_F1 -> 오답, Main_F2 -> 시간초과, 정답 -> 오름차순 후 투 포인터 알고리즘 해결

[33mcommit 5729f255e5f31bdfb30b8b9967c0455f162fb1a3[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jun 26 16:40:24 2021 +0900

    [java] Section03 01_두 배열 합치기 - 폴더 수정

[33mcommit 5e9aac3d84fcebb9f9275737e6b0747b16dd39e3[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jun 26 01:30:14 2021 +0900

    [java] Section03 01_두 배열 합치기 1> 일반 배열 사용 2> ArrayList<Integer> 리턴 사용, Two pointers algorithm 사용

[33mcommit 06d9bca5f2a7bbaedb3f23e8a5f9be391e93a6c8[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jun 26 00:29:23 2021 +0900

    [java] Section02 12_멘토링

[33mcommit f901e7f5a38de35ec8ed8cd186abeccb2521e6c0[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri Jun 25 19:37:15 2021 +0900

    [java] Section02 11_임시반장 정하기 1> 학급별로 찾아서 카운트 - 실패

[33mcommit 85bf96375a130c64766c76f562683cf1fff04061[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri Jun 25 00:49:28 2021 +0900

    [java] Section02 10_봉우리 1> 모든 배열 순회 2> 현재의 값이 오른, 왼, 아래, 위쪽보다 작으면 break

[33mcommit 8f2b9558d1c3795a7b30a8fc50cf903a4d57bcec[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Jun 23 23:28:38 2021 +0900

    [java] Section02 09_격자판 최대합

[33mcommit 0e9e6db2c5068e4179ed4d9379407862814db8c7[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Jun 22 17:23:17 2021 +0900

    [java] Section02 08_등수구하기 1> ArrayList<Integer>, Arrays.sort() 사용 2> 배열 사용

[33mcommit 731b996d1ba5a6a7325d3c5943f51cc438865928[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Jun 22 16:36:22 2021 +0900

    [java] Section02 07_점수계산

[33mcommit 5e855bb4262ae79ddce706b2643a2571cdf79537[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Jun 22 16:12:32 2021 +0900

    [java] Section02 06_뒤집은 소수 1> isPrime() 에라토스테네스 체 사용 2> 자기 자신이 아닌 다른 약수 체크로 소수 판단

[33mcommit 1c85d57ef476d0a87f261187ab51c027d0894fd3[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Jun 22 13:09:59 2021 +0900

    [java] Seciton02 05_소수(에라토스테네스 체) 1> 일반 구현(시간 초과) 2> 에라토스테네스 체 구현

[33mcommit e19a44476ce8c975740a3b5de9f3ab2035855f60[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Jun 22 01:44:09 2021 +0900

    [java] Section02 04_피보나치 수열 1> 배열 사용방법 2> 직접 구현

[33mcommit 276e20cefdba2da12f82ae0f06d4a900cf3588e2[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Jun 22 00:44:02 2021 +0900

    [java] Section02 03_가위바위보

[33mcommit f95fdb3756b62e718fbbf65961fc0eab95e8e915[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Jun 22 00:20:43 2021 +0900

    [java] Section02 02_보이는 학생

[33mcommit 240923b7451c544a9528df8e94275d0f71fcf0f0[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Jun 22 00:01:53 2021 +0900

    [java] Section01 01_큰 수 출력하기 1> String 반환 2> ArrayList<Integer> 사용

[33mcommit f83a2e5778b97f5d55d555c53c73a974fd74214b[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Jun 21 18:20:22 2021 +0900

    [java] Section01 12_암호 1> replaceAll(정규표현식, 문자열) 사용, Integer.parseInt(String, radix) 2> replace(regex, replacement)

[33mcommit ae9918f36b45fdcf9ddb3e7d461346c8322f0895[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Jun 21 17:11:48 2021 +0900

    [java] 수정 Section01 11_문자열 압축 13행 for문 조건문 수정

[33mcommit 4df5578079fd2d3f3055dfeb81ee52aed2a3d3cd[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Jun 21 17:04:40 2021 +0900

    [java] Section01 11_문자열 압축 1> count의 갯수로 마지막 문자 처리 2> StringBuilder를 사용, inputString에 공백(' ') 추가해서 처리

[33mcommit d8506fe777de3e816f7fdf540a7cddc6af78e3ec[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Jun 21 15:40:19 2021 +0900

    [java] Section01 10_가장 짧은 문자거리

[33mcommit 29f1d6257d13170f74f7c2fc5b96c1718081cf22[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Jun 21 01:49:18 2021 +0900

    [java] Section01 08_숫자만 추출 1> replaceAll() 정규표현식 사용 2> 아스키 코드 48~57 사용 3> Character.isDigit()와 Integer.parseInt()사용

[33mcommit f2d5ee88be5d88166c62161bae66c622bc9252e8[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sun Jun 20 01:55:47 2021 +0900

    [java] Section01 08_유효한 팰린드롬 1> pickAlpha() : 알파벳만 뽑는 메소드 구현해서 해결 2> replaceAll([^A-Z], ) 대문자말고 나머지 제외 정규 표현식과 StringBuilder의 reverse() 사용 해결방법

[33mcommit 6b62d23b6aebcdd76856c5ccbbe636cc8617299c[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sun Jun 20 01:24:13 2021 +0900

    [java] Section01 07_회문문자열 1> lt, rt를 이용한 방식 2> string.length() / 2로 charAt(i) 인덱싱 접근 방법 3> StringBuilder.reverse().toString()과 equalsIngnoreCase()를 사용한 방법

[33mcommit 1337fbb6124d999f39afbc8abe99a31e54a79da7[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sun Jun 20 00:58:20 2021 +0900

    [java] Section01 06_중복문자제거 1> indexOf() 사용 2> string.indexOf(string.charAt(i)) 사용

[33mcommit abd6094c51520ec714249c4e7b442819f3d0515c[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sun Jun 20 00:38:44 2021 +0900

    [java] Section01 05_특정 문자 뒤집기 1> Character.isAlphabetic(char변수) 사용법 2> 아스키 코드 값 사용

[33mcommit 22996b41c46bd698442332113fe9ffbe54e58a4f[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jun 19 21:45:41 2021 +0900

    [java] Section01 05_특정 문자 뒤집기

[33mcommit bb586c9a22871bbd9a27ef3d32809bb5e885512a[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jun 19 02:14:53 2021 +0900

    [java] Section04 4_단어 뒤집기 1>인덱싱 접근 2> StringBuilder의 reverse() 3> lt, rt 이용 직접구현 방법

[33mcommit f99a1476ef47ec60a977949a8c87ffa222fa8957[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jun 19 01:26:25 2021 +0900

    [java] Section01 03_문장 속 단어 1> max값을 이용한 일반 해결방법 2>indexOf(), substring()을 해결한 방법

[33mcommit 0919685020c258a283a48596acfd1a257dd8fb81[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jun 19 00:02:39 2021 +0900

    [java] Section01 02_대소문자 변환 1> isLowerCase(), toLowerCase() 사용 2> 아스키 코드 A~Z(65~90), a~z(90~122) 사용

[33mcommit 18de439de4983b8b87fe4fce5e2c813c2ba27853[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri Jun 18 23:39:32 2021 +0900

    [java] Section01 1_문자 찾기

[33mcommit 4b11c4e276fc79230ca81974b3a6865020d2a754[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri Jun 18 16:52:34 2021 +0900

    [java] Section5 04_후위식 연산

[33mcommit 78bf9719e2c32eafb05f580eae6a41ab32b73bcf[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jun 17 17:22:46 2021 +0900

    Section05 04_후위식_연산

[33mcommit 32cb04ac078a40ac7551d61dc45375775eac091a[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jun 17 01:09:37 2021 +0900

    add Section5 03_후위_표기식_만들기

[33mcommit d43b12a267fac880e2f2ad145bfa635b13b9ec2e[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Jun 9 23:37:29 2021 +0900

    add Seciton05 2.쇠막대기

[33mcommit cdf67047c4eded10700d4955393f483980f4b7c2[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Jun 9 16:34:52 2021 +0900

    add [python][sliver4][1978번] 소수 찾기 -> 에라토스테네스 체 구현

[33mcommit 5f73e54d76dc3de0e3f23d83b960c1cb194f285c[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Jun 9 16:34:07 2021 +0900

    add [python][sliver5][2581번] 소수 -> 에라토스테네스 체 구현

[33mcommit 8c50809835bdbc642f607ce633dfe12e59a6c2b0[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Jun 9 15:21:21 2021 +0900

    add [python][sliver5][2581번] 소수 -> 1>소수 이중포문 구현 2> 소수 리스트 내포식 구현

[33mcommit 326b4e169968b97c50e145c8ee48474a083c7f2e[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Jun 9 02:04:50 2021 +0900

    add [python][sliver5][1292번] 쉽게 푸는 문제 -> 1>end 변수의 // 2 + 1 for문 반복해서 리스트 내포식으로 값 부여 2> 리스트 곱셈으로 값 넣고, 슬라이싱 후 sum()

[33mcommit cffb493b4698f948f65bfeb54a2dadb8c50f510f[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Jun 9 01:52:30 2021 +0900

    add [python][sliver5][2609번] 최대공약수와 최소공배수 -> GCD, LCD 함수 구현

[33mcommit 579b61de3ffeeddbcea2758767249c0e688a2ef3[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Jun 9 00:01:17 2021 +0900

    add [python][sliver5][2693번] N번째 큰 수 -> [-3] 슬라이싱 사용

[33mcommit efd4feb2c5d32e187af2c02d499cfd9d08dc663f[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Jun 8 23:58:04 2021 +0900

    add [python][sliver5][2693번] N번째 큰수

[33mcommit d812f7a3c33e9a8b0340ec01d8206a9e5a3eccdf[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Jun 8 00:42:46 2021 +0900

    add [python][bronze2][2309번] 일곱 난쟁이 -> 1> 조합 for문 접근 2> itertools의 combinations(list, num) 사용

[33mcommit 3def24c09ea56adcd9da043e453b43c89395aca0[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Jun 7 23:47:22 2021 +0900

    add [java][bronze2][10870번] 피보나치 수5 -> 1> 재귀 방법 2>다이나믹

[33mcommit 6d1346c4a9eaab59d517d519242880fe37c06682[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Jun 7 23:46:35 2021 +0900

    add [python][bronze2][10870번] 피보나치 수5 -> 1> 일반 방법 2> 재귀 방법 3> 다이나믹 프로그래밍

[33mcommit 29ed7aea343362c3701a479df482b5466ed1779b[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Jun 7 19:16:41 2021 +0900

    add [python][recursion] 재귀연습 -> 팩토리얼, 피보나치

[33mcommit 17310acbe0774ba30f5233d59c63218ffd055ec5[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Jun 7 14:49:15 2021 +0900

    add [java][bronze3][2460번] 지능형 기차2 -> Math.max(a, b)를 사용해 최댓값을 구한 방법

[33mcommit d8ddbdcd566078a2e16f5b917ef5cca69b709957[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Jun 7 14:48:08 2021 +0900

    add [python][bronze3] [2460번] 지능형 기차2 -> 1>반복문을 통해서 최댓값을 찾는 방법, 2>max() 함수를 통한 최댓값을 찾는 방법

[33mcommit f3795c5fbecd2c7fd986acedbf8e87b98bb8c388[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Jun 7 14:39:34 2021 +0900

    add [python][bronze3][2460번] 지능형 기차2

[33mcommit 4b225baa2e62dc232c3c989609b9f9afdafad12b[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Jun 7 12:53:14 2021 +0900

    add [python][bronze3][최소,최대

[33mcommit 43f593851e58d2df346cbc0c3253837c557cc24e[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Jun 7 11:53:14 2021 +0900

    add [java][bronze3][10818번] 최소,최대

[33mcommit ffba4729336ed7b30df90e895949d67fabb1bab5[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sun Jun 6 17:52:41 2021 +0900

    add [bronze3][3460번] 이진수 -> bin()해결, 정수를 이진수로 만드는 함수 구현해서 해결

[33mcommit 4a3aa7abfc288b9c766bfe93e445228ea8dd0b8c[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sun Jun 6 17:08:23 2021 +0900

    add [bronze3][2501번] 약수 구하기

[33mcommit 8e389eca34cfdd168841c40e6356fbbb25bbaf71[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jun 5 16:09:32 2021 +0900

    add [java][bronze2][2908번] 상수

[33mcommit 9d9049b1abdfd7298102a0fae8f09604595f819f[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jun 5 14:55:50 2021 +0900

    add [java][bronze2][2675번] 문자열 반복

[33mcommit dbfa8ba1bdbb1974ed9cef2f34e2dad60216f221[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jun 5 14:48:26 2021 +0900

    add java

[33mcommit 16981012be8ca7aa72ebb777b6e6365d742bdd11[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jun 5 11:45:05 2021 +0900

    add [bronze2][2562번] 최댓값

[33mcommit f03ae22a3974aba181670a20ee29ec834e71290b[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jun 5 11:28:06 2021 +0900

    add [bronze1][2562번] 최댓값

[33mcommit 4276659618267333e56eb7d42532789f5a6133ac[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Jun 5 01:21:41 2021 +0900

    add [bronze1][1157번]  단어 공뷰

[33mcommit 4c2e146e39aef930b44f8aab8eedefe42675aded[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri Jun 4 23:49:17 2021 +0900

    add bronze2 숫자의 개수

[33mcommit 8949abfffef1d8c7b9bc70f16f893a0f4e3cd3fc[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jun 3 21:39:14 2021 +0900

    add Section05 09_아나그램_딕셔너리 풀이, 리스트 해쉬(ord)

[33mcommit 7aaef0270234bf5a1c4e9f35cb84195657f28e60[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Jun 3 16:54:10 2021 +0900

    add Section05 1.가장 큰 수, 8.단어 찾기

[33mcommit 3b5615324416d18cfced0d408b610328b0552efa[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Tue Jun 1 19:26:40 2021 +0900

    add 최대공약수(GCD), 최소공약수(LCD)

[33mcommit d1ed112088ee60578e00cdc64a859dcb3eb05a2e[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon May 31 20:46:19 2021 +0900

    add Section04 10_역수열(그리디)_P2

[33mcommit 9440175dc22bdb72348a07824840cc789852fef2[m
Merge: fb67332 ae9cca8
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon May 31 02:14:56 2021 +0900

    Merge branch 'main' of https://github.com/jaedeokhan/start-coding-test-pratice into main

[33mcommit fb67332232836d166003884dd60fde147728279a[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon May 31 02:14:37 2021 +0900

    add Section04 10_역수열(그리디)

[33mcommit ae9cca8a1ec9c5b4967f3edb7ef25aa3c413cad3[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Sat May 29 11:16:55 2021 +0900

    modify[2] JadenCase 문자열 만들기

[33mcommit b35f8c00663e8bea3bd2aba1d6b2abe91707cf54[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Sat May 29 11:14:36 2021 +0900

    add Level02 JadenCase 문자열 만들기

[33mcommit f5be84802f39caa31ec0e6d1b83298c8b7c8eb5a[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Sat May 29 10:26:58 2021 +0900

    add Level02 03_오픈채팅방

[33mcommit 54d7a619ec9cd8d6b551a86d3df0edd832b716b7[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Sat May 29 10:16:34 2021 +0900

    add Level02 02_기능개발

[33mcommit 726c7cf3d30b0a019e574438605aab3ad96659e5[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Fri May 28 23:50:12 2021 +0900

    add Level02 01_더 맵게

[33mcommit 625274ecdc50eed9080e274b12e1283db0ea2d0e[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu May 27 02:33:37 2021 +0900

    add Section04 08_침몰하는 타이타닉, 09_증가수열 만들기

[33mcommit a2b7a675c3dea259173deda177f35f82a0bbe57e[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed May 26 16:51:03 2021 +0900

    add Section04 08_침몰하는_타이타닉 1. 리스트를 사용한 방식 2. deque를 사용한 방식

[33mcommit c2aaef0c75f9b57a0f301a161a706d3a23601ff7[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed May 26 11:56:29 2021 +0900

    add Section4 07_창고 정리 1. list.index()를 통해서 box의 최댓값과 최솟값을 구하기, 2. 매번 sort()를 이용해서 제일 좌측은 최솟값 맨 우측은 최댓값을 이용해서 구하기

[33mcommit c0f8c4343516b19cd7d3d4d5a2b70e12eb547cd7[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed May 26 10:43:08 2021 +0900

    add Section04 06_씨름 선수 이중 포문 구현, 키를 내림차순 기준으로 정렬 후 1차 포문 해결

[33mcommit 0e97c71420af5b4b540d4308e7aa858ca9f1e1d2[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed May 26 02:24:57 2021 +0900

    add Section04 05_회의실 배정

[33mcommit ae68c3446c6498cf54626a3659bada8da4ad8ac3[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed May 26 01:58:38 2021 +0900

    add Section04 마구간 정하기

[33mcommit 813b9b17053561abdae27eb2171c1125a7838892[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue May 25 02:05:20 2021 +0900

    add Section04 03_뮤직비디오_결정알고리즘

[33mcommit 911f574a44d5a67c3a25cb2423c7bea74b7bbd2d[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue May 25 00:05:11 2021 +0900

    modify README.md

[33mcommit 42114ef2af33a9381f4de8ec3f2570d36802fa07[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sun May 23 00:41:40 2021 +0900

    add Section04 02_랜선 자르기(결정알고리즘)

[33mcommit dc63cb5c79fc23b417e2b3d9ff7ac7e51ad19329[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat May 22 20:53:12 2021 +0900

    add Section04 01_이분 탐색

[33mcommit e0991c7899c24d654adae4c11a19bd8541b932ad[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri May 21 22:02:31 2021 +0900

    add Section03 11_격자판 회문수

[33mcommit 1ec776a6db4b902fbb00007fadadb1a10d574caa[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri May 21 02:41:48 2021 +0900

    add Section03 10_ 스토쿠 검사 정답 코드

[33mcommit 9e614928135b561a84bcbc8be69276c374d9cc90[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu May 20 20:38:08 2021 +0900

    add Section03 10_스토쿠_검사

[33mcommit fe835686c1a61643f488149b151bd104aaea7362[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu May 20 16:33:39 2021 +0900

    add Section03 08_곶감(모래시계), 09_봉우리

[33mcommit ec465dfbe92a8d5b7aa66af2ba6cd6ba3c505e43[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed May 19 21:08:51 2021 +0900

    add Section03 08_곶감_모래시계

[33mcommit 8cfdcdb54e35ece65d5bc7c173a1533c9637f4a6[m
Merge: e498315 690610e
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed May 19 17:12:28 2021 +0900

    Merge branch 'main' of https://github.com/jaedeokhan/start-coding-test-pratice into main

[33mcommit e4983151b6769d9cfde8330872bf905fcef58449[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed May 19 17:12:16 2021 +0900

    add Section03 06_격자판 최대합, 07_사과나무

[33mcommit 690610e2a34a0a19debe5be15303309b9dd4b6be[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Wed May 19 14:38:10 2021 +0900

    add Section03 06_격자판 최대합

[33mcommit efcf0866740fe04e69af63103f5d0955ed297770[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed May 19 02:38:17 2021 +0900

    add Section03 04_두 리스트 합치기, 05_수의 합

[33mcommit bb0a480f658eb2adf7e198d314f397beef07e38e[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon May 17 16:23:05 2021 +0900

    add Section03 03_카드 역배치

[33mcommit a5b3dd76c4cd936fb7b2d2dee8337ae8c4d1e6c3[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon May 17 15:16:46 2021 +0900

    add Section03 02_숫자만 추출

[33mcommit f21debd80afb9ec69c9518ee69879a4cd390c226[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon May 17 14:50:49 2021 +0900

    add Section03 01_회문_문자열_검사

[33mcommit 48db9cbad52eb76cf578128110747a307eefed82[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon May 17 14:09:07 2021 +0900

    add Section02 10_점수계산

[33mcommit e24d12531fe25fd3198070451dbdfc399b7fd5bb[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon May 17 13:40:27 2021 +0900

    add Section02 08_뒤집은 소수, 09_주사위_게임

[33mcommit 82160467ef08acbd4baa7bdd078f0b743490df1b[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sun May 16 23:41:08 2021 +0900

    add Section02 07_소수의 개수(에라토스테네스 체)

[33mcommit c94285327b98f4bab9b9a8ba1e920f45a9448015[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri May 14 17:36:02 2021 +0900

    add Section02 03~06 자릿수의 합

[33mcommit 3c7803ba7083d1d64b692655f5b5498affa40c9b[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu May 13 02:23:59 2021 +0900

    add Section02 02_K번째 작은수

[33mcommit 5838a2218c5405fb941cc4480562721cfadf04ce[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu May 13 02:04:08 2021 +0900

    add Section02 01_K번째 약수 answer

[33mcommit 418021e7b0aa723ec3229de60e20bd113b288722[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu May 13 01:54:15 2021 +0900

    add Section02 01_K번째 약수

[33mcommit ffbd3a25c77692cae9182a137ae444898cedcb66[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Wed May 12 16:05:53 2021 +0900

    modify 구현 p325 자물쇠와 열쇠

[33mcommit e460d63140d402dcae1fb93482b60672f30ab220[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Wed May 12 15:54:32 2021 +0900

    add 구현 p325 자물쇠와 열쇠

[33mcommit ec7827f2a4b0fd38455371cf75e19682bc0563d8[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Wed May 12 14:54:10 2021 +0900

    Delete python/colab/implement/Quize directory

[33mcommit 033d55414cc4c9e6662ef6f4dceaf1d49f99ba32[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Tue May 11 11:19:16 2021 +0900

    Delete java directory

[33mcommit cc1a18ce042875266b1ccaf78f654fc062382dd4[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Tue May 11 11:06:04 2021 +0900

    add 구현 p324 문자열 압축

[33mcommit 07680aecf64c49000e26804787f9fe40c50af2a3[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Tue May 11 09:55:41 2021 +0900

    add 구현 p321 럭키 스트레이트

[33mcommit 55c80634298295dc69982298e2473b248535a03e[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Tue May 11 09:55:10 2021 +0900

    add 구현 p322 문자열 재정렬

[33mcommit d79123c3e8edc8d49786afba7a8d1f38698e9856[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Mon May 10 17:23:02 2021 +0900

    add  구현 Quiz p321 럭키 스트레이트

[33mcommit 88e98c9fbd09013d9ab49c2e2fe8775d1fc9288a[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Mon May 10 11:20:50 2021 +0900

    add 구현 p115 왕실의 나이트

[33mcommit f9e161ba2802bc95e554ee4d6a91961f99050c2e[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Fri May 7 21:32:31 2021 +0900

    add 구현 p113 시각

[33mcommit f1b4231fcb49b124d85c21d8f9a2829402d0d803[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Tue May 4 21:19:19 2021 +0900

    add 구현 p111 상하좌우

[33mcommit f57dcac9ad3c35185bbb54208566c96ea3e006f8[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Tue May 4 17:01:07 2021 +0900

    add 그리디 p314 만들 수 없는 금액

[33mcommit b97f0b71e7a22a8ea9690e45d76aa3b90cdb5faa[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Tue May 4 11:57:28 2021 +0900

    add 그리디 Quiz p313 문자열 뒤집기

[33mcommit c0e79b01433c5ba89938ad0e7416626cb5d8920a[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Tue May 4 02:08:49 2021 +0900

    add 그리디 Quiz p312 곱하기 혹은 더하기

[33mcommit 0bfc7270f42c29f57b661653d58eaee715a01e9b[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Tue May 4 01:23:02 2021 +0900

    add 그리디 Quiz p311 - 모험가 길드

[33mcommit e18fa19a1cc464476c53a6832fd0878d64556078[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Mon May 3 20:57:59 2021 +0900

    add 그리디 - 1이 될 때까지

[33mcommit 11a6b40eb6455b541c5e2a0beab7636d8a56226f[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Mon May 3 20:02:48 2021 +0900

    add 그리디 - 숫자 카드 게임

[33mcommit a146fbe3e18faf1b2846bc3f59b520eea0877dcb[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Mon May 3 16:48:11 2021 +0900

    add 그리디 큰 수의 법칙

[33mcommit 68f9caa97e2575818cb1f6fb2d75390f377eeadd[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Mon May 3 14:22:50 2021 +0900

    add 그리디 거스름돈

[33mcommit 1c1076bba3eff9395517ba926ed5a72facbbc200[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Mon May 3 14:22:27 2021 +0900

    Delete colab/Greedy directory

[33mcommit 7db8d3345b6b595c95e56b4d4a6c16fd3ff9961c[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Mon May 3 14:22:06 2021 +0900

    add 그리디 거스름돈

[33mcommit 31a794bee311e2560935be9888c1b2b29e5753f3[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Sun May 2 23:57:36 2021 +0900

    add 프로그래머스 Level01 문자열 내 마음대로 정렬하기

[33mcommit 3d13700e0a453aa026928341395dad50a0441f5d[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Sun May 2 23:49:03 2021 +0900

    add 프로그래머스 Level01 폰켓몬

[33mcommit 8edca87e68aff804c21a2e486626269db9b4f138[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Sat May 1 15:52:57 2021 +0900

    add 백준 실버5 크로아티아 알파벳

[33mcommit fcefc004a7c61ea273d9eb56b6c5baae59f5e3d2[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Sat May 1 15:52:16 2021 +0900

    Delete 13_두_정수_사이의_합.ipynb

[33mcommit c305a5c0c3bc703b5759f51ba6b0f129843661a3[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Sat May 1 15:51:38 2021 +0900

    add 백준 실버5 두 정수 사이의 합

[33mcommit a2fbd4051c3504e67cc3bb1ebfbcb5cb102db38f[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Thu Apr 29 17:26:50 2021 +0900

    add 프로그래머스 Level01 13, 두 정수 사이의 합

[33mcommit 7b3423bfeff78be742b3accb87e97eb405834854[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Thu Apr 29 17:19:26 2021 +0900

    add 프로그래머스 Level01 나누어 떨어지는 숫자 배영ㄹ

[33mcommit 46ca0888cb92a522e297155e771a39a4670b7fd2[m
Merge: da4ef6d 40cc9e2
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Apr 28 09:32:29 2021 +0900

    Merge branch 'main' of https://github.com/jaedeokhan/start-coding-test-pratice into main

[33mcommit da4ef6dfc6edaf7c1d0273d1b499f86142bacf02[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Apr 28 09:32:25 2021 +0900

    add backjoon sliver5 1316번 그룹 단어 체커

[33mcommit 40cc9e2152bf5f14dda38aaf3fb24cd96836c1a7[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Tue Apr 27 00:25:36 2021 +0900

    add 프로그래머스 Level01 소수 만들기

[33mcommit 4126c53f05250b0616723d933ef6c69df88c816a[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Mon Apr 26 11:01:17 2021 +0900

    add 프로그래머스 Level01 2018 카카오 블라인드 [1차] 다트게임

[33mcommit ff96709ac6ae93f8149dc92ce387e62e827298ab[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Sun Apr 25 22:33:21 2021 +0900

    update 프로그래머스 Level01 1차 비밀지도

[33mcommit aebb624f24f85b5e7263cf875b09381ece3455bd[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Sun Apr 25 22:19:31 2021 +0900

    add 프로그래머스 Level01 1차 비밀지도 문제

[33mcommit 815c24cc67d7d00160d5d518f74fdee5814e3f14[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Thu Apr 22 23:56:20 2021 +0900

    Colaboratory를 통해 생성됨

[33mcommit db3a69a8a9c2c834ed7f7f8e402d9783dd63d2d3[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Wed Apr 21 23:56:12 2021 +0900

    add 10_3진법 뒤집기

[33mcommit ef7dace6412ad071b9931bf119bd3694690932e5[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Tue Apr 20 19:23:08 2021 +0900

    Colaboratory를 통해 생성됨

[33mcommit 450baa994f9b7c2ba505956dc7b923200f142ae2[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Tue Apr 20 00:02:21 2021 +0900

    Rename 8_가운데_글자_가져오기.ipynb to 08_가운데_글자_가져오기.ipynb

[33mcommit 2fb9b2f765aa5fc18bbfa70fe52804cf3a78fffe[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Tue Apr 20 00:02:07 2021 +0900

    Rename 7_K번째수.ipynb to 07_K번째수.ipynb

[33mcommit ce890e1a3816ee6615a624ef46033573572d3780[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Tue Apr 20 00:01:24 2021 +0900

    add 08_가운데 글자 가져오기

[33mcommit a9d58ce229983db0e4a39fe0174798c73a8cfed2[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Mon Apr 19 23:45:35 2021 +0900

    Colaboratory를 통해 생성됨

[33mcommit 5b11ae741af234c8c759a3dd7e543d5ca420dc17[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Sun Apr 18 01:35:29 2021 +0900

    Colaboratory를 통해 생성됨

[33mcommit cd8fdc485681c8cba1e59ace078ff65d8782af52[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Sun Apr 18 01:30:41 2021 +0900

    Colaboratory를 통해 생성됨

[33mcommit f00b59054dc250a1e2deacb0883f17856e04dac2[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Sat Apr 17 19:43:44 2021 +0900

    Colaboratory를 통해 생성됨

[33mcommit a8285468f75b1ecfe15f040e52181e573943f3e3[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Thu Apr 15 23:29:26 2021 +0900

    Colaboratory를 통해 생성됨

[33mcommit 13f22b631d15ab445e80beb2155c1376321b3407[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Thu Apr 15 11:17:36 2021 +0900

    Colaboratory를 통해 생성됨

[33mcommit 3e9075b52352c60ce6693e5f148f1455785a622c[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Thu Apr 15 00:47:57 2021 +0900

    Colaboratory를 통해 생성됨

[33mcommit a14dc4e4ed96bda4e7e3620211eb266de5e8b6f7[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Wed Apr 14 13:27:47 2021 +0900

    Colaboratory를 통해 생성됨

[33mcommit 21b22663c0aa94883ae1c79c1926b884c73e52fe[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Wed Apr 14 00:37:10 2021 +0900

    Colaboratory를 통해 생성됨

[33mcommit 5caca9e9dfb8dd675df7fd85d6ac28365de5baef[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Tue Apr 13 23:24:23 2021 +0900

    Colaboratory를 통해 생성됨

[33mcommit c85ed2804d74ccf0a7d4b1a4ca7f5261f64f63bb[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Apr 12 23:44:17 2021 +0900

    add backjoon bronze4 9~11

[33mcommit 43151045a79253c61d7f3ae62eb87f72399c0605[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Apr 12 09:46:12 2021 +0900

    add backjoon bronze4 3~8

[33mcommit a87bf81ad8825c302e6fbb001ca792b86feaefd2[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sun Apr 11 02:37:21 2021 +0900

    add backjoon bronze4 1~2

[33mcommit d2b33f53960ee83a12c3b53300d6ef9cb82e6edc[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Apr 10 20:14:12 2021 +0900

    add backjoon bronze5 53~60

[33mcommit 1455040600800d8a74b81728dc40da2b3c81379d[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Apr 10 18:08:36 2021 +0900

    add backjoon bronze 49~52

[33mcommit 1afb19e5351d9b7163e62ed8b9110d7f9999b53b[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri Apr 9 21:58:09 2021 +0900

    add backjoon bronze 40~48

[33mcommit bf12b327ebaf11cf8cdba73a4d65d40f7b6c3bfd[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri Apr 9 17:38:40 2021 +0900

    add backjoon bronze 37~40

[33mcommit 638212d74170acd807d3d195c34e76165094649e[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri Apr 9 15:38:09 2021 +0900

    add backjon bronze 22~36

[33mcommit 56c8d05dc60f1a84bbfb7858eb8d62e6a7d708d2[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Apr 8 22:04:48 2021 +0900

    add backjon bronze5 210408

[33mcommit 1556bcae972ced6f1ec3d2c3c02c0216fb67e87a[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Apr 7 22:18:49 2021 +0900

    SQL JOIN -> 보호소에서 중성화한 동물

[33mcommit ae63f6eb8b9326c4f5a451f50cac7c96ed964fd9[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sun Apr 4 21:08:52 2021 +0900

    SQL JOIN -> 오랜 기간 보호한 동물(1)

[33mcommit 9fa03b0d62cff6264361efae7f758e5066b8102e[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Apr 3 22:24:13 2021 +0900

    sql JOIN 있었는데요 없었습니다.sql

[33mcommit 5db28de93dff5c372faf9fb191caa8e3e3c84103[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Fri Apr 2 02:22:35 2021 +0900

    add backjoon 14~18

[33mcommit cc5be89144af16f8bf000e99b6a5d52235cae74d[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Apr 1 02:09:52 2021 +0900

    add backjoon bronze 5 10~13

[33mcommit 7ac6faec8c824655a7ca09d66216c419780c1546[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Apr 1 00:38:06 2021 +0900

    add 0331

[33mcommit 0cc4a39b612fbff2e6e1de1bf470b89ed08cffc5[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Mar 31 11:23:30 2021 +0900

    add 버블정렬

[33mcommit a14ffa3b3329e0f0536e013b11499066ef978196[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Mar 30 23:52:35 2021 +0900

    add 백준 단계별

[33mcommit 59f501f35b9f08802c1c105a8047377f480ab313[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Mar 30 17:54:24 2021 +0900

    codeup if

[33mcommit 179ef213878eb6a1aff7b89d338271fbb786983e[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Mar 30 10:36:46 2021 +0900

    add 없어진 기록 찾기[join]

[33mcommit 390fffcd0323ab15c526065bc5ce73d2804d07f2[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Mar 30 01:51:49 2021 +0900

    add ¼ö¿­ÀÇ °ª ±¸Çϱâ, 1ÀÇ °³¼ö´Â

[33mcommit 06aea684b4b2ab5e836fe84301166976945f2f03[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Mar 29 17:23:20 2021 +0900

    add 프로그래머스 IS NULL

[33mcommit 9b52d74cc3b87dd2494fe6a914ca3502f4e158cd[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Mar 29 01:07:20 2021 +0900

    modify README.md

[33mcommit fd84b6db298684c77b64e9bbedcc7fba4f26e75d[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Mar 29 00:56:20 2021 +0900

    add 입양 시각 구하기(2)

[33mcommit 89eea3bd0226b5bfab90e5a0cd093a07248a40ca[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sun Mar 28 23:59:47 2021 +0900

    add 입양 시각 구하기(1)

[33mcommit 151165315def03f40e3c8fba31bef0ccf6268d7f[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Mar 25 18:29:11 2021 +0900

    add 99~100

[33mcommit fe4291ad503d4d76dee713c5ee7685c0d65f5cbd[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Thu Mar 25 11:59:52 2021 +0900

    add 96~99

[33mcommit 6f27b6eaea01d3d32c9a443d5116a5b3ba1aa255[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Mar 24 20:13:12 2021 +0900

    add 90~96

[33mcommit 03e7e7550cad28e0d74e24479b51b194eac97c16[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Mar 23 20:57:07 2021 +0900

    add 87~89.py

[33mcommit c8feb91a3481fc3390cfed9a89ff9859d36cb3eb[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Mar 22 12:09:48 2021 +0900

    add 02.sql 동명 동물 수 찾기

[33mcommit a5b70383dda59c781f1702abec80baa64e599c73[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Mar 22 11:53:21 2021 +0900

    add 01.sql 동명 동물 수 찾기

[33mcommit 72522ae56fecdcb32d874f71d72cf6cc189832df[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Mar 22 11:46:38 2021 +0900

    add 04.sql 중복 제거하기

[33mcommit a9b391d89bab392e6bb9bf59707627efe7339168[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Mar 22 11:44:35 2021 +0900

    add 03.sql 동물 수 구하기

[33mcommit a0f87f44e9ed37de48a3802afc183e46bab7d5f8[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sun Mar 21 22:34:30 2021 +0900

    add min_동물 수 구하기

[33mcommit 7eaf334d31a7747a8799e2e3eac59d5d03283582[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Mar 20 17:13:50 2021 +0900

    add 두 수를 더해서 정렬, sql SELECT~MAX~MIN

[33mcommit 0afc17a87e5d536b546939bd3ef4bddeba4badf5[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Mar 17 12:08:21 2021 +0900

    add 84~85

[33mcommit d5e16b34a57633a8518f4d6b33ddaca770ea2241[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Mar 15 00:47:52 2021 +0900

    add 83

[33mcommit b9e8949ba18e3a94984b6da44b1e9d1f23358f3c[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Mar 13 23:29:34 2021 +0900

    add 77~82

[33mcommit aebe64d2c8f56249daf9500004e917d81e74521c[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Sat Mar 13 00:29:11 2021 +0900

    add 65~75

[33mcommit 106d180fa91c2fb50f5c24d22e17d7519ac807f0[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Wed Mar 3 01:59:20 2021 +0900

    Update README.md

[33mcommit 8c62c8e291d84a45695d3875bbb097c7a6e9800e[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Wed Mar 3 01:58:40 2021 +0900

    add selection_sort, codeup 57~65

[33mcommit 36cc1b5e7ce07e58fec1cbc5ca6a764f38694b9c[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Tue Mar 2 00:47:10 2021 +0900

    add 49~57.py

[33mcommit 5501cb8ddfed1fa65319c8b300fcd9f2b86d2eb9[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Tue Mar 2 00:00:13 2021 +0900

    Update README.md

[33mcommit 58ed5ba7c1e05ccf92e1f779ddda4579f214df6c[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Mar 1 23:59:49 2021 +0900

    remove codeit folder

[33mcommit c48745757186699d76a9aa44e89a0d0888f2f97c[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Mar 1 23:58:04 2021 +0900

    codeup 21~47

[33mcommit 29433c32203ba99bf1c2f6cee880c2918d629508[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Mon Mar 1 02:02:06 2021 +0900

    Update README.md

[33mcommit 37880df32f2dbac8addeada9ddfe87b6e509ae33[m
Author: jaedeokhan <dgd03023@cu.ac.kr>
Date:   Mon Mar 1 01:42:53 2021 +0900

    start Day1

[33mcommit fa9a209de1fb7266b87591eaa4359fbb4ad36950[m
Author: JaeDeok Han <45028904+jaedeokhan@users.noreply.github.com>
Date:   Mon Mar 1 01:40:53 2021 +0900

    Initial commit
