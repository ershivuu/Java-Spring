package com.univeral.Implementor;

import com.universal.Interface.*;

public class GlassDoor implements Door{
	
	@Override
	public void openDoor() {
		System.out.println("Metal Door Opened");
	}

}
