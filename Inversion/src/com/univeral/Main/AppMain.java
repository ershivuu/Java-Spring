package com.univeral.Main;

import com.univeral.Entity.Car;
import com.univeral.Implementor.*;
import com.universal.Interface.Door;

public class AppMain {

	public static void main(String[] args) {
		
	Car MetalDoor = new Car(new MetalDoor());
	MetalDoor.unlock();
	
	}

}
