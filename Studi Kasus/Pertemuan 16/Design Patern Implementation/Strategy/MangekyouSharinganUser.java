package Strategy;

import Strategy.Susanoo.ISusanooKind;

public abstract class MangekyouSharinganUser {
    private ISusanooKind susanoo;

    public MangekyouSharinganUser() { }

    public void setSusanoo(ISusanooKind susanoo) {
        this.susanoo = susanoo;
    }

    public void performSusanoo() {
        this.susanoo.susanoo();
    }
    
    public abstract void display();
}