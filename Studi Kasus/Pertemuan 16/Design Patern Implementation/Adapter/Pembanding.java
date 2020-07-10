package Adapter;

public class Pembanding {
    public Pembanding(int bangunDatar1, int bangunDatar2) {
        if(bangunDatar1 == bangunDatar2) {
            System.out.println("Luas kedua bangun datar sama.");
        }
        if(bangunDatar1 > bangunDatar2) {
            System.out.println("Luas bangun datar pertama lebih besar daripada yang kedua.");
        }
        if(bangunDatar2 > bangunDatar1) {
            System.out.println("Luas bangun datar kedua lebih besar daripada yang pertama.");
        }
    }
}
