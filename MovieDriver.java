class Movie{
	String name;
	double price;
	String actorName;
	String actressName;
	double turnOver;
	double rating;
	String producer;
	String summery;

	Movie(String name,double price,String actorName,String actressName,double turnOver,double rating,String producer,String summery){
		this.name=name;
		this.price=price;
		this.actorName=actorName;
		this.actressName=actressName;
		this.turnOver=turnOver;
		this.rating=rating;
		this.producer=producer;
		this.summery=summery;

		}

		public void displayDetails(){
			System.out.print("Movie name: "+name);
			System.out.print("Movie price: "+price);
			System.out.print("Actors: "+actorName);
			System.out.print("Actress: "+actressName);
			System.out.print("Turn Over: "+turnOver);
			System.out.print("Rating: "+rating);
			System.out.print("Producer: "+producer);
			System.out.print("Summery: "+summery);
		
	}
}

class MovieDriver{
	public static void main(String[] args) {
	Movie m = new Movie("Hera pheri",20.2,"Akshay kumar","don't know",100.0,4.5,"Sunil sheety","Comedy movie");	
	m.displayDetails();
	
	}
}