package com.univeral.Entity;

import com.universal.Interface.Door;

public class Car {

	private Door door;

	public Car(Door door)// constructor dependency injection
	{
		this.door = door;
	}

	public void setDoor(Door door)// Setter dependency injection
	{
		this.door = door;
	}
	public void unlock() {
		door.openDoor();
	}

}
