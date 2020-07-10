package Strategy;

public class Sasuke extends MangekyouSharinganUser {
    @Override
    public void display() {
        System.out.print("Sasuke: ");
        this.performSusanoo();
    }
}