public class Main {
    public static void main(String[] args) {
        Family family = new Family();

        family.addUncle("Muthu");
        // family.listUncles();

        family.addUncle("Iroh");

        family.addUncle("Muthu");
        family.listUncles();
        
    }
}