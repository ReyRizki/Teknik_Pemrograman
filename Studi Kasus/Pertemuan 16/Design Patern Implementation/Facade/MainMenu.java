
package Facade;

import java.util.Scanner;

public class MainMenu {
    
    public MainMenu(){ 
    }
    
    private int displayMainMenu(){
        int select;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("\nSilahkan Pilih Mode:");
        System.out.println("1. Mode Siang");
        System.out.println("2. Mode Sore");
        System.out.println("3. Mode Malam");
        System.out.println("4. Mode Kosong");
        System.out.println("5. Exit");
        System.out.println("\nInput number: ");
        
        select = keyboard.nextInt();
        
        System.out.println("\nStatus:");
        
        return select;
    }
    
    public void SelectMode(){
        SimpleSmartRoomFacade room = new SimpleSmartRoomFacade(
             new Light(),
             new AirConditioner(),
             new NightLamp()
        );
        boolean userExited = false;
        
        while(!userExited){
            int selection = displayMainMenu();
            switch(selection){
                case 1:
                    room.ModeSiang();
                    break;
                case 2:
                    room.ModeSore();
                    break;
                case 3:
                    room.ModeMalam();
                    break;
                case 4:
                    room.ModeKosong();
                    break;
                case 5:
                    System.out.println("System exiting..");
                    userExited = true;
                    break;
                default:
                    System.out.println(
                    "\nYou did not enter a valid selection. Try again.");
                    break;
            }
        }
    }
}
