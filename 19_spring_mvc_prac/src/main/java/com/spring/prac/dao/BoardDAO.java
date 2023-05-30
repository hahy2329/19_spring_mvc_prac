package com.spring.prac.dao;

import java.util.List;

import com.spring.prac.dto.BoardDTO;

public interface BoardDAO {
	
	public void insertBoard(BoardDTO boardDTO);
	
	public List<BoardDTO> getBoardList();
	
	public void updateReadCnt(long boardId);
	public BoardDTO getBoardDetail(long boardId);
	
	
	public String getPassword(long boardId);
	public void updateBoard(BoardDTO boardDTO);
	
	public void removeBoard(BoardDTO boardDTO);
	
}
