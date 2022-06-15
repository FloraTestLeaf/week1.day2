package week1.day2;


//Assignment2:
//1. Create a Car class
//2. create methods for this class
//example:
//applyBreak()
//applyGear()
//switchOnAc()
//applyAcclerate()
//create object and excute for same class
//create new class as MyCar class and create object for existing class and excute


public class Cars {
	public boolean applyBreak() {
		System.out.println("Have applied break");
		return false;
	}
	
	public String applyGear() {
		System.out.println("I have applied gear");
		return "I have applied";
		
	}
	
	public boolean switchOnAc(){
		return true;
	}
	
	private boolean applyAcclerate(){
		
		return false;
	}
	
	public static void main (String args[]) {
		System.out.println("Main method is being called");
		Cars carObj=new Cars();
		carObj.applyBreak();
		carObj.applyGear();
		carObj.switchOnAc();
		carObj.applyAcclerate();
		
	}
}
