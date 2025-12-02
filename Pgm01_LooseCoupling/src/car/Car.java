package car;

import engine.Engine;

public class Car {
	
	private Engine engine; ;   // Loose Coupling → only interface
	
	public Car(Engine engine)
	{
		this.engine=engine;
	}
	
	 public void startCar()
	 {
		 engine.start();
	 }

}
