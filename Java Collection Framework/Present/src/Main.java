public class Main {
    public static void main(String[] args) {
        Family family = new Family();

        family.addUncle("Muthu");
        family.addUncle("Iroh");
        
        family.listUncles();
    }
}