package com.NicksWorld2.SoloProgram2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoloProgram2Application {

	public static void main(String[] args) {
		SpringApplication.run(SoloProgram2Application.class, args);

		BoardGame boardGame = new TheThing();
		System.out.println(boardGame.getName());
	}

}