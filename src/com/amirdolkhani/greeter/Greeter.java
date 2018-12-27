package com.amirdolkhani.greeter;

import com.amirdolkhani.greeter.datasource.UserDataSource;
import com.amirdolkhani.greeter.entity.User;
import com.amirdolkhani.greeter.util.GreetingBuilder;

public class Greeter {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		UserDataSource userDataSource = new UserDataSource();		
		User user = userDataSource.getUser2();
		GreetingBuilder greetingBuilder = new GreetingBuilder();
		String message = greetingBuilder.buildGreeting(user);
		System.out.println(message);
	}
}