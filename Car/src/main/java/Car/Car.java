/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author agneshe
 */
public class Car {
    // instant variables
    // property field
    int maxSpeed = 100;//assign 100 to the value of maxSpeed
    int minSpeed = 0;
    
    double weight = 4079;
    
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;
    
    //constructor: Create new instance from the blue print: Car has to match with class name Car
    //add parameter in ()
//    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
//        maxSpeed = customMaxSpeed;
//        weight = customWeight;
//        isTheCarOn = customIsTheCarOn;
//    }
    
    public void printVariables() {
        System.out.println(maxSpeed);//print this out, the next thing you print out is going to be on another line
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }
    
    public void wreckCar() {
        condition = 'C';
    }
    
    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }
    
    public void getIn() {
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
            numberOfPeopleInCar++;
            System.out.println("Someone got in");
        }
        else {
            System.out.println("The car is full!");
        }
    }
    
    public void getOut() {
        if (numberOfPeopleInCar > 0){
            numberOfPeopleInCar--;
        }
        else {
            System.out.println("No one is in the car.");
        }
    }
    
    public double howManyMiledTillOutOfGas() {
        return currentFuel * mpg;
    }
    
    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }
    
    public void turnTheCarOn() {
        if (isTheCarOn == false) {
            isTheCarOn = true;
        } else {
            System.out.println("The Car is already on " + isTheCarOn);
        }
        
    }
       
    
    public static void main(String[] args) {
        //Main function is where we make things, use methods, create new objects etc.
        // TODO code application logic here
//        Car familyCar = new Car();//create a new class object with default values
//        System.out.println("family Car:");
//        familyCar.printVariables();//call the class method
//        familyCar.wreckCar();
//        familyCar.upgradeMinSpeed();
//        familyCar.upgradeMinSpeed();
//        familyCar.printVariables();
//        Car birthdayPresent = new Car(500, 5000.545, true);
//        System.out.println("Birthday Car v1");
//        birthdayPresent.printVariables();
//        birthdayPresent.getIn();
//        birthdayPresent.getIn();
//        birthdayPresent.getIn();
//        System.out.println("Miles Left:" + birthdayPresent.howManyMiledTillOutOfGas());
//        System.out.println("Miles Left:" + birthdayPresent.maxMilesPerFillUp());
//        System.out.println("Birthday Car v2");
//        birthdayPresent.printVariables();
//        birthdayPresent.getOut();
//        System.out.println("Birthday Car v3");
//        birthdayPresent.printVariables();
        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();
                
    }
    
}
