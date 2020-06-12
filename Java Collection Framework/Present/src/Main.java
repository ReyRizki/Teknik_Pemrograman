// import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Family family = new Family();
        // Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        menu.mainMenu(family);
        
        // Scanner sc = new Scanner(System.in);
        // int id1;
        // try {
        //     System.out.println("Enter id");
        //     id1 = Integer.parseInt(sc.nextLine());
        // } catch (NumberFormatException e) {
        //     e.printStackTrace();
        // }
        // System.out.println("Enter name");
        // String name1 = sc.nextLine();
        // System.out.println(name1);
        
        // int num = sc.nextInt();
        // // int enter = sc.next().charAt(0);
        // String name = sc.nextLine();

        // System.out.println(name);
        // String name = sc.nextLine();
        // System.out.println(name);
        // mainMenu(family);

        // family.addUncle("Muthu");
        // family.addUncle("Iroh");
        // family.addUncle("Muthu");
        // family.listUncles();

        // String uncleName = sc.nextLine();
        // StringBuilder temp = new StringBuilder(uncleName);
        
        // System.out.println(family.findUncle(uncleName));

        // family.addNiece("Reina", 14, 6);
        // family.addNiece("Azula", 3, 5);
        // family.addNiece("Reina", 14, 6);
        // family.listNieces();

        // family.findUncle("Iroh").addPresent(family.findNiece("Azula"), "Tea");
        // family.findUncle("Iroh").listPresents(family.getNieces());
        // family.findNiece("Azula").listPresents(family.getUncles());
        // System.out.println(family.findNiece("Mei Mei").getName());

        // family.birthday(family.findNiece("Azula"), family.getUncles());
        // family.findNiece("Azula").listPresents(family.getUncles());
    }
}