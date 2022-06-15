package week1.day2;

//Assignment1:
//Create a class for TwoWheeler and declare below global variables with appropriate values
//int noOfWheels
//short noOfMirrors
//long chassisNumber
//boolean isPunctured
//String bikeName
//double runningKM
//create object for TwoWheeler and call all the variables inside main method and print the values.


public class TwoWheeler {
	static int noOfWheels=2;
	static short noOfMirrors=2;
	static long chassisNumber=256656;
	static boolean isPunctured=true;
	static String bikeName="Pulsar";
	static double runningKM=4566.0;
	public static void main (String args[]) {
		TwoWheeler bike=new TwoWheeler();
		
		System.out.println(bike.noOfWheels);
		System.out.println(bike.noOfMirrors);
		System.out.println();
		System.out.println();
		System.out.println(bike.bikeName);
	}
	
}
