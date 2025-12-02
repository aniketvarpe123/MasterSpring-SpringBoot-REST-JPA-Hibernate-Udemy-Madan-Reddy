package main;

import car.Car;
import engine.DieselEngine;
import engine.PetrolEngine;

public class Main {
	 public static void main (String[] args)
	 {
		 Car petrol= new Car(new PetrolEngine());
		 petrol.startCar();
		 
		 Car diesel = new Car(new DieselEngine());
		 diesel.startCar();
		 
	 }

}
