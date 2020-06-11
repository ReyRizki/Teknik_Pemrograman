public class Main 
{
    public static void main(String[] args) 
    {
        Family family = new Family();

        family.addUncle("Muthu");
        family.addUncle("Iroh");
        // family.addUncle("Muthu");
        // family.listUncles();
        
        // System.out.println(family.findUncle("Iroh"));

        family.addNiece("Reina", 14, 6);
        family.addNiece("Azula", 3, 5);
        // family.addNiece("Reina", 14, 6);
        // family.listNieces();

        family.findUncle("Iroh").addPresent(family.findNiece("Azula"), "Tea");
        // family.findUncle("Iroh").listPresents(family.getNieces());
        family.findNiece("Azula").listPresents(family.getUncles());
        // System.out.println(family.findNiece("Mei Mei").getName());

        family.birthday(family.findNiece("Azula"), family.getUncles());
        family.findNiece("Azula").listPresents(family.getUncles());
    }
}