select a.dept_id, a.DEPT_NAME_EN, round(avg(b.sal), 0) as avg_sal
from hr_department a join hr_employees b on a.dept_id = b.dept_id
group by a.dept_id, a.DEPT_NAME_EN
order by 3 desc