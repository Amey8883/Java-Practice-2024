class Population{
 public static void main(String [] args){
 long currentPopulation = 312032486;
 long secondYear = 365*24*60*60;
 long birthYear = (secondYear/7);
 long deathYear = (secondYear/13);
 long immigrant = (secondYear/45);
 long newPop = (currentPopulation+(birthYear-deathYear+immigrant)*5);
 System.out.println("Next five years population is : "+newPop);
}
}