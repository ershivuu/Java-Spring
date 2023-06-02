package com.universal.implementer;

import com.universal.interfaces.Door;

public class MetalDoor implements Door
{
	@Override
	public void openDoor() {
		System.out.println("metal door opened");
	}
}
