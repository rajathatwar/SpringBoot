package io.javabrains.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContrlr {

	

		@RequestMapping("/hello")
		public String sayHi() {
			return "Hi";
		}
	}