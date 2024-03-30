-- 코드를 작성해주세요
select ID, EMAIL, FIRST_NAME, LAST_NAME  FROM DEVELOPERS 

where (select sum(CODE) from SKILLCODES 
where NAME like 'Python' OR NAME like 'C#')  & SKILL_CODE > 0

ORDER BY ID ASC;