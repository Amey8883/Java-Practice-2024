class Car{
	String brand;
	String model;
	String type;
	double price;
	int seatingCapacity;
	Engine engine;

	Car(String brand,String model,String type,double price,int seatingCapacity,double horsepower,double capacityLiter,String engineType,float mileage,int noOfPistons)
	{
		this.brand=brand;
		this.model=model;
		this.type=type;
		this.price=price;
		this.seatingCapacity=seatingCapacity;
		this.engine = new Engine(horsepower,capacityLiter,engineType,mileage,noOfPistons);
	}

	public void displayCar()
	{
		System.out.println("Brand: "+brand);
		System.out.println("model: "+model);
		System.out.println("type: "+type);
		System.out.println("price: "+price);
		System.out.println("seatingCapacity: "+seatingCapacity);
	} 
}

class Engine{
	double horsepower;
	double capacityLiter;
	String engineType;
	float mileage;
	int noOfPistons;

	Engine(double horsepower,double capacityLiter,String engineType,float mileage,int noOfPistons)
	{
		this.horsepower=horsepower;
		this.capacityLiter=capacityLiter;
		this.engineType=engineType;
		this.mileage=mileage;
		this.noOfPistons=noOfPistons;
	}

	public void displayEngine()
	{
		System.out.println("horsepower: "+horsepower);
		System.out.println("capacityLiter: "+capacityLiter);
		System.out.println("engineType: "+engineType);
		System.out.println("mileage: "+mileage);
		System.out.println("noOfPistons: "+noOfPistons);
	}
}
class CarDriver{
	public static void main(String[] args) {
		Car obj = new Car("TATA","NEXON","SUV",120000,5,120,1.2,"Petrol",16,5);
		obj.displayCar();
		obj.engine.displayEngine();
	}
} 