-- 이름이 없는 동물의 아이디
-- 동물 보호소에 들어온 동물 중, 이름이 없는 채로 들어온 동물의 ID를 조회하는 SQL 작성
-- 단, ID는 오름차순 정렬되어야 합니다.
SELECT
    ANIMAL_ID
FROM
    ANIMAL_INS
WHERE
    NAME IS NULL
