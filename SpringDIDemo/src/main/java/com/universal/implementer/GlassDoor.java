package com.universal.implementer;

import com.universal.interfaces.Door;

public class GlassDoor implements Door
{
	@Override
	public void openDoor() {
		System.out.println("glass door opened");
	}
}
