package demo.maurorossi68.testcontainerdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface TestContainerController {

	@PostMapping("/test")
	public ResponseEntity<?> test(@RequestBody String number);
}
