-- 상위 n개 레코드
-- 동물 보호소에 가장 먼저 들어온 동물의 이름을 조회하는 SQL 문을 작성해주세요.
SELECT name
FROM ANIMAL_INS
ORDER BY datetime
LIMIT 1
