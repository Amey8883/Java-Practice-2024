class QSpider{
	long noOfBatches = 40;
	String branchLocation = "Deccan";
	String trainerName = "Raviteja";
	long noOfStudents = 10000;
	String course = "Software Development";

	public void study(){
		System.out.print("Students are Studying");
	} 

	public void placement(){
		System.out.print("Student are placed");
	}

	public void training(){
		System.out.print("Tainers will train the student");
	}
	public void sleeping(){
		System.out.print("Students are sleeping");
	}
	public void gosipping(){
		System.out.print("Students are gosipping while lectures ");
	}
	public static void main(String[] args) {
		QSpider class = new QSpider();
		class.noOfBatches;
		class.branchLocation();
		class.trainerName();
		class.noOfStudents();
		class.course();
		class.study();
		class.placement();
		class.training();
		class.sleeping();
		class.gosipping();
	}
}