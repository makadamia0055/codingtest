-- 코드를 작성해주세요
select count(*) as FISH_COUNT, month(TIME) as MONTH FROM FISH_INFO
GROUP BY MONTH
ORDER BY MONTH ASC;