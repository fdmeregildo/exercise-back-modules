package com.developer.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fmeregildo on 27/02/2020.
 */

@RestController
@RequestMapping(DefaultController.BASE_MAPPING)
public class DefaultController {

	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultController.class);

	static final String BASE_MAPPING = "/home";
	static final String USERGUEST = "{code}";


	@GetMapping
	public ResponseEntity<String> getTest(){

		return ResponseEntity.ok("Textooo Modules!");
	}

}
