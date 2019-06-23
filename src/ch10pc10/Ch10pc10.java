package ch10pc10;
import java.util.Scanner;
/**
 *
 * @author Frank
 * date 11/26/2017
 */
public class Ch10pc10 {

    public static void main(String[] args) {
        // variables
        int number, shipType, capacity;
        String name, yearBuilt;
        
        //instantiate Scanner class keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //request input from user
        System.out.print("Please enter the number of ships you have.");
        number = keyboard.nextInt();
        
        //Create an array of Ships and allocate memory for the array
        Ship[] ships = new Ship[number];
        
        for (int i = 0; i < number; i++) {
            System.out.print("Please select the type of ship: 1 for Cruise ship or 2 for Cargo ship. ");
            shipType = keyboard.nextInt();
            
            switch (shipType) {
                case 1:  //Cruise Ship
                    System.out.print("Please enter the name of the ship. ");
                    name = keyboard.next();
                    System.out.print("Please enter the year the ship was built. ");
                    yearBuilt = keyboard.next();
                    System.out.print("Please enter the maximum number of passengers the ship can hold. ");
                    capacity = keyboard.nextInt();
                    ships[i] = new CruiseShip(name, yearBuilt, capacity);
                    break;
                case 2:  //Cargo Ship
                    System.out.print("Please enter the name of the ship. ");
                    name = keyboard.next();
                    System.out.print("Please enter the year the ship was built. ");
                    yearBuilt = keyboard.next();
                    System.out.print("Please enter the cargo capacity of the ship. ");
                    capacity = keyboard.nextInt();
                    ships[i] = new CargoShip(name, yearBuilt, capacity);
                    break;
                default:  //error
                    System.out.println("Invalid choice.  Please enter 1 or 2");
                    i--;
                    break;
            }
        }
        
        //demonstrate output to users
        for (int i = 0; i < number; i++) {
            System.out.println(ships[i].toString());
        }
    }
    
}
