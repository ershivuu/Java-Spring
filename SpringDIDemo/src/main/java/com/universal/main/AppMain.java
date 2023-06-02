package com.universal.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.universal.entity.Car;

public class AppMain {

	public static void main(String[] args) {
	
		ApplicationContext context = 
		new ClassPathXmlApplicationContext("spring.xml");
		
		Car metalCar = context.getBean("mCar",
				Car.class);
		metalCar.unlock();
		
		Car glassCar = context.getBean("gCar",
				Car.class);
		glassCar.unlock();
	}
}
