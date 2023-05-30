package com.spring.prac.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.prac.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	
	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public void insertBoard(BoardDTO boardDTO) {
		
		sqlSession.insert("boardMapperss.insertBoard", boardDTO);
	}


	@Override
	public List<BoardDTO> getBoardList() {
		List<BoardDTO> boardList = sqlSession.selectList("boardMapperss.boardList");
		
		return boardList;
	}


	@Override
	public void updateReadCnt(long boardId) {
		sqlSession.update("boardMapperss.updateReadCnt", boardId);
		
	}


	@Override
	public BoardDTO getBoardDetail(long boardId) {
		BoardDTO boardDTO = sqlSession.selectOne("boardMapperss.getBoardDetail", boardId);
		
		return boardDTO;
	}


	@Override
	public String getPassword(long boardId) {
		String passwd = sqlSession.selectOne("boardMapperss.getPassword", boardId);
		
		return passwd;
	}


	@Override
	public void updateBoard(BoardDTO boardDTO) {
		
		sqlSession.update("boardMapperss.boardUpdate", boardDTO);
		
	}


	@Override
	public void removeBoard(BoardDTO boardDTO) {
		sqlSession.delete("boardMapperss.boardDelete", boardDTO);
		
	}

}
