package com.spring.prac.service;

import java.util.List;

import com.spring.prac.dto.BoardDTO;

public interface BoardSerivice {
	
	
	
	public void insertBoard(BoardDTO boardDTO);
	
	public List<BoardDTO> getBoardList();
	public BoardDTO getBoardDetail(long boardId,boolean IncreseRead);
	
	
	public boolean boardUpdate(BoardDTO boardDTO);
	public boolean removeBoard(BoardDTO boardDTO);
}
