package com.nemo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nemo.bean.HelloBean;

@Component
public class MyRunner implements CommandLineRunner {
	
@Autowired
HelloBean hellobean;
	@Override
	public void run(String... args) throws Exception {
		hellobean.sayHello();

	}

}
