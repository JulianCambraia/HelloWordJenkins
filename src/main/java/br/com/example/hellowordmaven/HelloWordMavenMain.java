package br.com.example.hellowordmaven;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

public class HelloWordMavenMain {

	public static void main(String[] args) {
		Logger logger = (Logger) LoggerFactory.getLogger(HelloWordMavenMain.class);
		logger.info("Hello Word Maven Jenkins Git Hub!");
	}
}
