package com.ksudoku.controllers;

import java.time.LocalTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBodys

@RequestMapping("/tictactoe-services/service")	
@RestController //a combination of @Controller and @ResponseBody
public class GameManagerControllers {
	
	
	@GetMapping("/ping")
	public ResponseEntity<String> ping(){
		return ResponseEntity.ok("Healthy naman");
	}
	
	@GetMapping("/getGameCode")
	public String getGameCode() {
		String code ="";
		
		return code;
	}
	
	@GetMapping("/getGameRoomStatus")
	public boolean checkGameRoomStatus() {
		return false;
	}
	
	
	@GetMapping("/getTimer")
	public LocalTime getTimer() {
		LocalTime timer = null; 
		return timer;
		
	}
	
	@GetMapping("/checkGameMove")
	public boolean checkGameMove() {
		return false;
	}
	
	@PostMapping("/setMove")
	public void setMove() {
		
	}
	
	
}
