package com.ict.persistance;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ict.domain.BoardVO;
import com.ict.mapper.BoardMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void testGetList() {
		List<BoardVO> result = boardMapper.getList();
		log.info("저장된 게시물 정보 : " + result);
	}
	
	// insert를 실행할 테스트코드를 하단에 작성해보겠습니다.
	@Test
	public void testInsert() {
		// 글 입력을 위해서 BoardVO 타입을 매개로 사용함
		// 따라서 BoardVO를 만들어놓고
		// setter로 글제목, 글본문, 글쓴이 만 저장해둔 채로
		// mapper.insert(vo);를 호출해서 실행여부를 확인하면 됨
		// 위 설명을 토대로 아래 vo에 6번글에 대한 제목 본문 글쓴이를 넣고
		// 호출해주신 다음 실제로 DB에 글이 들어갔는지 
		
		BoardVO vo = new BoardVO();
		log.info("채워넣기 전 : " + vo);
		
		vo.setTitle("새로넣는글");
		vo.setContent("새로넣는본문");
		vo.setWriter("새로넣는글쓴이");
		
		boardMapper.insert(vo);
	}
	@Test
	public void getSelect() {
		BoardVO vo = boardMapper.select(5);
		log.info(vo);
	}
	
	@Test
	public void getDelete() {
		boardMapper.delete(1);
	}
	
	@Test
	public void boardUpdate() {
		BoardVO vo = new BoardVO();
		
		vo.setBno(1); // 수정할 게시글 번호
		vo.setTitle("수정할 제목");
		vo.setContent("수정할 내용");
		
		boardMapper.update(vo);
	}
	
}
