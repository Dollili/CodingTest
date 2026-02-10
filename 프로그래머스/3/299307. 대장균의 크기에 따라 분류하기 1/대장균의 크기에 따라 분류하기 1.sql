select id, (case when a.size_of_colony <= 100 then 'LOW'
            when (a.size_of_colony > 100 and a.size_of_colony <= 1000) then 'MEDIUM'
            when (a.size_of_colony > 1000) then 'HIGH'
            end) as SIZE
from ecoli_data a
