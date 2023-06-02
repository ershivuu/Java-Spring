package com.univeral.Implementor;

import com.universal.Interface.*;

public class MetalDoor implements Door{
	
	@Override
	public void openDoor() {
		System.out.println("metal Door Opened");
	}

}
