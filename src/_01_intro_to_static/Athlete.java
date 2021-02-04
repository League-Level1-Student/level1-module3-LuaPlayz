package _01_intro_to_static;

public class Athlete {
	    static int nextBibNumber;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	    Athlete (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	        this.bibNumber = nextBibNumber++;
	    }

	    public static void main(String[] args) {
	        //create two athletes
	        //print their names, bibNumbers, and the location of their race. 
	    	Athlete Athlete1 = new Athlete("Person1", 10);
	    	Athlete Athlete2 = new Athlete("Person2", 10);
	    	System.out.println(Athlete1.name);
	    	System.out.println(Athlete2.name);
	    	System.out.println(Athlete1.bibNumber);
	    	System.out.println(Athlete2.bibNumber);
	    	System.out.println(raceLocation);
	    }
	}


