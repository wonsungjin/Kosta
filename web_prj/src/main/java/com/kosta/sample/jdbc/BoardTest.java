package com.kosta.sample.jdbc;
import java.util.ArrayList;

import com.kosta.sample.board.Board;
import com.kosta.sample.json.EmpVO;
public class BoardTest {

	public static void main(String[] args) {
		Board bd = new Board();
		ArrayList<EmpVO> as =  bd.boardSelect();
		bd.boardDelete(7499);
		System.out.println(as.size());
		//bd.boardDelete();
		//bd.oracleColse();
		
	}

}