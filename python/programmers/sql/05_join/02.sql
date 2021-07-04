-- 관리자의 실수로 일부 동물의 입양일이 잘못 입력되었습니다. 
-- 보호 시작일보다 입양일이 더 빠른 동물의 아이디와 이름을 조회하는 SQL문을 작성해주세요. 
SELECT 
   a_i.animal_id, a_i.name
FROM
   ANIMAL_INS a_i
JOIN
   ANIMAL_OUTS a_o
ON 
   a_i.animal_id = a_o.animal_id
WHERE
   a_i.datetime > a_o.datetime
ORDER BY
   a_i.datetime ASC

