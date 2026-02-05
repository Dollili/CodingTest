-- 코드를 작성해주세요

select b.date as year, (b.size - size_of_colony) as year_dev, id
from ecoli_data a, (select max(size_of_colony) as size, extract(year from differentiation_date) as date
from ecoli_data
group by date) b
where b.date = extract(year from differentiation_date)
order by year, year_dev