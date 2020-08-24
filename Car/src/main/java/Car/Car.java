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
    
    // property field
    int maxSpeed = 100;//assign 100 to the value of maxSpeed
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';    
    
    public void printVariables() {
        System.out.println(maxSpeed);//print this out, the next thing you print out is going to be on another line
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Car carry = new Car();//create a new class object
        carry.printVariables();//call the class method
    }
    
}
