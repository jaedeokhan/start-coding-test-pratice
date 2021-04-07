-- ANIMAL_INS, 보호소에 들어올 당시에는 sex_upon_intake가 Neutered 
-- ANIMAL_OUTS, 보호소에 나갈 당시에는 중성화된 sex_upon_outcome Spayed
SELECT
   a_i.animal_id, a_i.animal_type, a_i.name
FROM
   ANIMAL_INS a_i
JOIN
   ANIMAL_OUTS a_o
ON 
   a_i.animal_id = a_o.animal_id
WHERE 
    a_i.sex_upon_intake != a_o.sex_upon_outcome
ORDER BY
    a_i.animal_id ASC



