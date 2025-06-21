package com.ksudoku.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameLogicControllers {
	
	@GetMapping("/getGameSolution")
	public Map<String, Map<String, String>> gameMap(){
		Map<String, Map<String, String>> map = null;
		return map;
	}
	
	
	
}
