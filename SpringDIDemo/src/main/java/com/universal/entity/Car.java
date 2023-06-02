package com.universal.entity;

import com.universal.interfaces.Door;

public class Car {

	private Door door;
	
	public Car(Door door)//constructor dependency injection 
	{
		this.door = door;
	}
	
	public Car() {
	}
	
	public void setDoor(Door door)//setter dependency injection 
	{
		this.door = door;
	}

	public void unlock() {
		door.openDoor();
	}
}
