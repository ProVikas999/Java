package classes_and_objects;

class Vehicle {
    int seats;
    int speed;
    Vehicle (){
    	System.out.println("1");
    }

    public Vehicle(int seats, int speed) {
    System.out.print("Vehicle ");
    this.seats = seats;
    this.speed = speed;
    }
}