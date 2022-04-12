package com.ict.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ict.domain.BoardVO;
import com.ict.domain.Criteria;

public interface BoardMapper {
	
	// board_tbl
	
	// 버튼 추가를 위해 PageNum 대신 Criteria를 활용합니다.
	public List<BoardVO> getList(Criteria cri);
	
	public void insert(BoardVO vo);
	
	public BoardVO select(long bno);
	
	public void delete(long bno);
	
	public void update(BoardVO vo);
	
	
	// vo 안쓰고 파라미터 여러개 전달
	public void update2(@Param("title") String title,
						@Param("content") String content,
						@Param("bno") long bno);
	
	public int countPageNum();
	
}
