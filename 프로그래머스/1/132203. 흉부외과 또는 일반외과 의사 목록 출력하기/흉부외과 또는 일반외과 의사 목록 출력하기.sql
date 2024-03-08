-- 코드를 입력하세요
SELECT DR_name, DR_ID, MCDP_CD, date_format(HIRE_YMD, '%Y-%m-%d')as HIRE_YMD from DOCTOR where MCDP_CD in('CS', 'GS')
ORDER BY HIRE_YMD DESC, DR_NAME ASC;