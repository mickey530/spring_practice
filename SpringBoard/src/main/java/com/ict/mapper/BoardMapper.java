package com.ict.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ict.domain.BoardVO;

public interface BoardMapper {
	
	// board_tbl
	
	public List<BoardVO> getList();
	
	public void insert(BoardVO vo);
	
	public BoardVO select(long bno);
	
	public void delete(long bno);
	
	public void update(BoardVO vo);
	
	
	// vo 안쓰고 파라미터 여러개 전달
	public void update2(@Param("title") String title,
						@Param("content") String content,
						@Param("bno") long bno);
	
}
