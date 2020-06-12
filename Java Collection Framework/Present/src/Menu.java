import java.util.Scanner;

public class Menu
{
    private Scanner sc;
    
    public Menu()
    {
        sc = new Scanner(System.in);
    }

    public void mainMenu(Family family)
    {
        System.out.println("Main menu");
        System.out.println("1. Add member");
        System.out.println("2. Show members");
        System.out.println("3. Add present");
        System.out.println("4. Show presents");
        System.out.println("5. Birthday");
        System.out.println("0. Exit");
        
        try
        {
            int option = Integer.parseInt(sc.nextLine());
    
            switch (option)
            {
            case 0:
                System.exit(0);
                break;

            case 1:
                addMember(family);
                break;

            case 2:
                this.showMember(family);
                break;

            case 3:
                this.insertPresent(family);
                break;
            
            case 4:
                this.showPresents(family);
                break;

            case 5:
                this.birthday(family);
    
            default:
                System.out.println();
                mainMenu(family);
                break;
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Input is not an integer\n");
            this.mainMenu(family);
        }
    }

    public void addMember(Family family)
    {
        System.out.println("\nAdd Member");
        System.out.println("1. Add Uncle");
        System.out.println("2. Add Niece");
        System.out.println("0. Back");
        
        try 
        {
            int option = Integer.parseInt(sc.nextLine());
            switch (option)
            {
            case 0:
                this.mainMenu(family);
                break;

            case 1:
                System.out.print("Input uncle's name: ");
                String uncleName = sc.nextLine();
                
                if (family.addUncle(uncleName))
                    System.out.println("Uncle added successfully\n");
                else
                    System.out.println("Can't add uncle\n");
                break;
    
            case 2:
                System.out.print("Input niece's name: ");
                String nieceName = sc.nextLine();

                System.out.print("Day: ");
                int day = Integer.parseInt(sc.nextLine());

                System.out.print("Month: ");
                int month = Integer.parseInt(sc.nextLine());
    
                if (family.addNiece(nieceName, day, month))
                    System.out.println("Niece added successfully\n");
                else
                    System.out.println("Can't add niece\n");
                break;

            default:
                addMember(family);
            }
        } 
        catch (NumberFormatException e)
        {
            System.out.println("Input is not an integer\n");
            this.addMember(family);
        }


        mainMenu(family);
    }

    public void showMember(Family family)
    {
        System.out.println("\nShow Member");
        System.out.println("1. Show Uncles");
        System.out.println("2. Show Nieces");
        System.out.println("0. Back");

        try
        {
            int option = Integer.parseInt(sc.nextLine());

            switch (option)
            {
            case 0:
                this.mainMenu(family);
                break;

            case 1:
                family.listUncles();
                System.out.println();
                break;
    
            case 2:
                family.listNieces();
                System.out.println();
                break;

            default:
                showMember(family);
                break;
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Input is not an integer\n");
            this.showMember(family);
        }

        this.mainMenu(family);
    }

    public void insertPresent(Family family)
    {
        
        System.out.print("Uncle's Name: ");
        String uncleName = sc.nextLine();

        System.out.print("Niece's Name: ");
        String nieceName = sc.nextLine();

        System.out.print("Present description: ");
        String present = sc.nextLine();
        try
        {
            if (family.findUncle(uncleName).addPresent(family.findNiece(nieceName), present))
                System.out.println("Present added successfully\n");
            else
                System.out.println("Can't add present\n");
        }
        catch (NullPointerException e)
        {
            System.out.println("Uncle is not exist\n");
        }

        this.mainMenu(family);
    }

    public void showPresents(Family family)
    {
        System.out.println("\nShow Presents");
        System.out.println("1. From Uncle");
        System.out.println("2. To Niece");
        System.out.println("0. Back");

        try
        {
            int option = Integer.parseInt(sc.nextLine());

            switch (option)
            {
            case 0:
                this.mainMenu(family);
                break;

            case 1:
                try
                {
                    System.out.print("Name: ");
                    String uncleName = sc.nextLine();

                    family.findUncle(uncleName).listPresents(family.getNieces());
                    System.out.println();
                }
                catch (NullPointerException e)
                {
                    System.out.println("Uncle is not exist\n");
                }
                break;
    
            case 2:
                try
                {
                    System.out.print("Name: ");
                    String nieceName = sc.nextLine();

                    family.findNiece(nieceName).listPresents(family.getUncles());
                    System.out.println();
                }
                catch (NullPointerException e)
                {
                    System.out.println("Niece is not exist");
                }
                break;

            default:
                showPresents(family);
                break;
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Input is not an integer\n");
            this.showPresents(family);
        }

        this.mainMenu(family);
    }

    public void birthday(Family family)
    {
        System.out.print("Name: ");
        String name = sc.nextLine();

        family.birthday(family.findNiece(name), family.getUncles());
    }
}