package week1.day2;

public class Car {
	
	//carname
public void printCarName() {
	System.out.println("Safari");
}

//carcolor
private String getCarColor() {
	System.out.println("Grey");
	String clr="grey";
	return clr;
}

//carpunctured
 Boolean isCarPunctured() {
	Boolean carPuncture=false;
	return carPuncture;
}

public static void main(String args[]) {
	Car specification=new Car();
	specification.printCarName();
	
	String name= specification.getCarColor();
	System.out.println(name);
	
	Boolean carPunctured = specification.isCarPunctured();
	System.out.println(carPunctured);
}

}
