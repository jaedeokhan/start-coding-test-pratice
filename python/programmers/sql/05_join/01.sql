-- 없어진 기록 찾기
-- 천재지변으로 인해 일부 데이터가 유실되었습니다. 
-- 입양을 간 기록은 있는데, 보호소에 들어온 기록이 없는 동물의 ID와 이름을 ID 순으로 조회하는 SQL문을 작성해주세요.
SELECT 
    a_o.ANIMAL_ID, a_o.NAME
FROM
    ANIMAL_INS a_i
RIGHT JOIN
    ANIMAL_OUTS a_o
ON 
    a_i.ANIMAL_ID = a_o.ANIMAL_ID
WHERE 
    a_i.ANIMAL_ID IS NULL
ORDER BY
    a_i.ANIMAL_ID ASC
