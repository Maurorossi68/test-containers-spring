package demo.maurorossi68.testcontainerdemo.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import demo.maurorossi68.testcontainerdemo.controller.TestContainerController;
import demo.maurorossi68.testcontainerdemo.service.TestContainerService;

public class TestContainerControllerImpl implements TestContainerController{

	@Autowired
	TestContainerService testContainerService;
	
	@Override
	public ResponseEntity<?> test(String number) {
		try {
			if(testContainerService.verificarEsPar(number)) {
				return new ResponseEntity<>(HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
