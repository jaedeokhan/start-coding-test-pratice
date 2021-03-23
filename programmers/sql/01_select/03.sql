-- 아픈 동물 찾기
-- 동물 보호소에 들어온 동물 중 아픈 동물1의 아이디와 이름을 조회하는 SQL 문을 작성해주세요.
-- 아픈 동물 => INTAKE_CONDITION이 Sick 인 경우를 뜻함
SELECT animal_id, name
FROM ANIMAL_INS
WHERE intake_condition = 'Sick'
