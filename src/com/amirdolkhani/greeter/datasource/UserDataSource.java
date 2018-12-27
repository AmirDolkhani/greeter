package com.amirdolkhani.greeter.datasource;
import com.amirdolkhani.greeter.entity.User;
import java.util.Scanner;

public class UserDataSource {

	public User getUser() {
		User user = new User();
		System.out.println("********** User Greeter Service **********\n"
				+"This service will receive user name and age and will"
				+"print out a greeting message includes received user name and age.\n\n");
		System.out.println("Please Enter your name: ");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.nextLine();
		user.setName(userName);
		System.out.println("Please enter your age: ");
		int userAge = scanner.nextInt();
		user.setAge(userAge);
		scanner.close();
		return user;
	}
	
	public User getUser2() {
		System.out.println("********** User Greeter Service **********\n"
				+"This service will receive user name and age and will"
				+"print out a greeting message includes received user name and age.\n\n");
		System.out.println("Please Enter your name: ");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.nextLine();
		System.out.println("Please enter your age: ");
		int userAge = scanner.nextInt();
		scanner.close();
		User user = new User(userName, userAge);
		return user;
	}
	
	public User getUser3() {
		int age =0;
		String name = null;
		User user = new User(name, age);
		System.out.println("********** User Greeter Service **********\n"
				+"This service will receive user name and age and will"
				+"print out a greeting message includes received user name and age.\n\n");
		System.out.println("Please Enter your name: ");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.nextLine();
		user.setName(userName);
		System.out.println("Please enter your age: ");
		int userAge = scanner.nextInt();
		user.setAge(userAge);
		scanner.close();
		return user;
	}
}

