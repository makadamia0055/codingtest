-- 코드를 작성해주세요
SELECT ID, EMAIL, FIRST_NAME, LAST_NAME FROM DEVELOPER_INFOS
WHERE SKILL_1 like 'Python' or SKILL_2 like 'Python' OR SKILL_3 like 'Python'
ORDER BY ID ASC