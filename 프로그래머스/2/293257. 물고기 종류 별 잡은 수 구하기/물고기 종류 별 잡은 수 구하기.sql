-- 코드를 작성해주세요

select COUNT(*) as FISH_COUNT, FISH_NAME from 
(select n.FISH_NAME as FISH_NAME from FISH_INFO i
join FISH_NAME_INFO n on i.FISH_TYPE = n.FISH_TYPE) as t

group by FISH_NAME
order by FISH_COUNT DESC;