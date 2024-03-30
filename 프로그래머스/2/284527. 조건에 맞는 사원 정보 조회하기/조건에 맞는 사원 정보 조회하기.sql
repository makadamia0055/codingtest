-- 코드를 작성해주세요
 # SELECT s.score as SCORE, e.EMP_NO
SELECT s.SCORE, h.EMP_NO, h.EMP_NAME, h.POSITION, h.EMAIL FROM HR_EMPLOYEES h
inner join 
(SELECT emp_no, sum(SCORE) as score FROM HR_GRADE
 
GROUP BY EMP_NO
 order by score DESC
 limit 1
) s on s.EMP_NO = h.EMP_NO

