-- 코드를 입력하세요
SELECT history_id, car_id, to_char(start_date, 'YYYY-MM-dd') as start_date, to_char(end_date, 'YYYY-MM-dd') as end_date,
        case
       when end_date - start_date >= 29 then '장기 대여'
       else '단기 대여'
       end as rent_type
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
where start_date >= date '2022-09-01' and start_date < date '2022-10-01'
order by history_id desc