package service;

import java.util.List;

import dao.BoardDAO;
import dto.BoardDTO;
import dto.PageDTO;

public class BoardServiceImp implements BoardDAO {
	private BoardDAO dao;

	public BoardServiceImp() {

	}

	public void setDao(BoardDAO dao) {
		this.dao = dao;
	}

	@Override
	public int count() {
		return 0;
	}

	@Override
	public List<BoardDTO> list(PageDTO pv) {
		return null;
	}

	@Override
	public void readCount(int num) {

	}

	@Override
	public BoardDTO content(int num) {
		return null;
	}

	@Override
	public void reStepCount(BoardDTO dto) {

	}

	@Override
	public void save(BoardDTO dto) {

	}

	@Override
	public BoardDTO updateNum(int num) {
		return null;
	}

	@Override
	public void update(BoardDTO dto) {

	}

	@Override
	public void delete(int num) {

	}

	@Override
	public String getFile(int num) {
		return null;
	}
}
