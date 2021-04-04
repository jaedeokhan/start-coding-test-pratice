-- 오랜 기간 보호한 동물(1)
-- 아직 입양을 못 간 동물 중, 
-- 가장 오래 보호소에 있었던 동물 3마리의 이름과 보호 시작일을 조회하는 SQL문을 작성해주세요.
-- 이때 결과는 보호 시작일 순으로 조회해야 합니다.
SELECT
    a_i.name, a_i.datetime
FROM
    ANIMAL_INS a_i
LEFT JOIN
    ANIMAl_OUTS a_o
ON
    a_i.animal_id = a_o.animal_id
WHERE
    a_o.animal_id IS NULL
ORDER BY
    datetime ASC
LIMIT 3
