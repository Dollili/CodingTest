-- 코드를 입력하세요
select ('/home/grep/src/' || a.board_id || '/' || file_id || file_name || file_ext) as file_path
from USED_GOODS_BOARD a join USED_GOODS_FILE b on a.board_id = b.board_id
where views = (SELECT max(views)
from used_goods_board)
order by file_id desc
