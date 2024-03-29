-- 동명 동물 수 찾기
-- 동물 보호소에 들어온 동물 이름 중 두 번 이상 쓰인 이름과 해당 이름이 쓰인 횟수를 조회하는 SQL문을 작성
-- 이름이 없는 동물은 집계에서 제외하며, 결과는 이름 순으로 조회해주세요
SELECT name, count(name) as 'count'
FROM ANIMAL_INS
GROUP BY name
HAVING count(name)  > 1
ORDER BY name

