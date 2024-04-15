package A;
abstract class Vehicle
{
   abstract void start();
}
abstract class Car extends Vehicle
{
    void start(){
	System.out.println("car start with key");
}
}
class Scooty extends Vehicle{
void start(){
	System.out.println("Scooty start with kick");
}

public static void main(String[] args) {
	Scooty s=new Scooty();	
	s.start();
	
}
}



