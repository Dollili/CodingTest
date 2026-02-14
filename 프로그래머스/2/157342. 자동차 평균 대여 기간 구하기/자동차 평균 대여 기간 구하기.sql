-- 코드를 입력하세요

SELECT car_id, to_char(round(avg((end_date - start_date) + 1), 1), 'FM999.0') as AVERAGE_DURATION
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
group by car_id
having round(avg((end_date - start_date) + 1), 1) >= 7
order by ROUND(AVG(END_DATE - START_DATE) + 1, 1) desc, car_id desc