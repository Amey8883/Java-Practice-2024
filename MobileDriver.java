class Mobile
{
	 String brand;
	 String model;
	 int ram;
	 int rom;
	 double price;

	 Mobile(String brand,String model,int ram,int rom,double price)
	 {
	 	this.brand = brand;
	 	this.model = model;
	 	this.ram = ram;
	 	this.rom = rom;
	 	this.price = price;
	 }

	 void displayMobile()
	 {
	 	System.out.println("Mobile Details");
	 	System.out.println("Brand: "+brand);
	 	System.out.println("Model: "+model);
	 	System.out.println("Ram: "+ram);
	 	System.out.println("Rom: "+rom);
	 	System.out.println("Price: "+price);
	 }
}

class MobileDriver
{
	public static void main(String[] args) {
		Mobile obj = new Mobile("One plus","CE 2 Lite",8,64,22000);
		obj.displayMobile();
	}
}