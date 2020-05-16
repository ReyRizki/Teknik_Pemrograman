public class CollegeBasketballPlayer extends BasketballPlayer {
    // ATTRIBUTES
    private int eligibilityRemaining;
    private String role;

    // METHODS

    // CONSTRUCTORS

    // constructor with 0 parameter
    public CollegeBasketballPlayer() {
        super();
        this.eligibilityRemaining = 4;
        this.role = "bench";
    }

    // constroctor with 3 parameters
    public CollegeBasketballPlayer(String name, String position, String team) {
        super(name, position, team);
        this.eligibilityRemaining = 4;
        this.role = "bench";

    }

    // constructor with the parameters that will initialize the all fields
    public CollegeBasketballPlayer(String name, String position, String team, int height, int weight, int agility, int speed, int ballHandling, int eligibilityRemaining, String role) {
        super(name, position, team, height, weight, agility, speed, ballHandling);
        this.eligibilityRemaining = eligibilityRemaining;
        this.role = role;
    }

    // Accessor methods
    public int getEligibilityRemaining() {
        return this.eligibilityRemaining;
    }

    public String getRole() {
        return this.role;
    }

    // toString method
    public String toString() {
        return super.toString() + "\nRole\t\t: " + this.getRole();
    }

    // method to check if a CollegeBasketballPlayer is draftable or nah
    public boolean draftable() {
        return (this.getRole() == "starter" && super.getValue() > 4) || (this.getRole() == "bench" && super.getValue() >= 8);
    }
}