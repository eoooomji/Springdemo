package controller;

import org.springframework.stereotype.Controller;

import dto.PageDTO;
import service.BoaderService;

@Controller
public class BoardController {
	private BoaderService service;
	private PageDTO pdto;
	private int currentpage;
	
	
	public BoardController() {
		
	}
} // end class
