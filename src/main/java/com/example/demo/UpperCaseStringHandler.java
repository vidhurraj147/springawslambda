package com.example.demo;

import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component
public class UpperCaseStringHandler implements Function<String, String> {

	@Override
	public String apply(String string) {
		return string.toUpperCase();
	}
	
	

}
