import java.util.LinkedHashMap;

public class Niece {
    private String name;
    private int day;
    private int month;
    private LinkedHashMap<Uncle, String> presents;

    protected Niece(String name, int day, int month) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.presents = new LinkedHashMap<Uncle, String>();
    }

    public int compareTo(Niece niece) {
        if (this.month == niece.month)
            return this.day - niece.day;

        return this.month - niece.month;
    }

    public String toString() {
        return this.name + ": " + this.day + " " + this.getMonth();
    }

    private String getMonth() {
        switch(this.month) {
        case 1:
            return "January";
        
        case 2:
            return "February";
        
        case 3:
            return "March";

        case 4:
            return "April";

        case 5:
            return "May";

        case 6:
            return "June";

        case 7:
            return "July";

        case 8:
            return "August";
        
        case 9:
            return "September";
        
        case 10:
            return "October";

        case 11:
            return "November";

        case 12:
            return "December";

        default:
            return null;
        }
    }
}