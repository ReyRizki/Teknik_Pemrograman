public class Main {
    public static void main(String[] args) {
        Family family = new Family();

        // family.addUncle("Muthu");

        // family.addUncle("Iroh");
        // family.addUncle("Muthu");
        // family.listUncles();
        
        // System.out.println(family.findUncle("Iroh"));

        family.addNiece("Reina", 14, 6);
        family.addNiece("Azula", 3, 5);
        family.addNiece("Reina", 14, 6);
        family.listNieces();

    }
}