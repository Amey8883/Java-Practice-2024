//Assume a runner  runs 14 kilometers in 45 minutes and 30 seconds. Write a program that displays the average speed in miles per hour.
//(Note that 1 mile is 1.6 kilometer’s)

class AverageSpeedInMiles {
      
    public static void main(String[] args) {
     
        double distanceInKm = 14;
        double timeInMinutes = 45 + 30 / 60.0; 
        double distanceInMiles = distanceInKm / 1.6;
        double timeInHours = timeInMinutes / 60.0;
        double averageSpeedMph = distanceInMiles / timeInHours;
        System.out.println("Average speed: " + averageSpeedMph + " miles per hour");
    }
}
