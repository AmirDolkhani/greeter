package com.amirdolkhani.greeter.util;

import com.amirdolkhani.greeter.entity.User;

public class GreetingBuilder {
	
	public String buildGreeting(User user) {
		String greeting = "Welcome " + user.getName() + "!";
		return greeting;
	}
}
