package Strategy;

import Strategy.Susanoo.ArmoredSusanoo;
import Strategy.Susanoo.ISusanooKind;
import Strategy.Susanoo.PerfectSusanoo;
import Strategy.Susanoo.WingedPerfectSusanoo;

public class Main {
    public static void main(String[] args) {
        // Uchiha Madara
        ISusanooKind susanooKind = new PerfectSusanoo();
    
        MangekyouSharinganUser uchihaMadara = new Madara();

        uchihaMadara.setSusanoo(susanooKind);

        uchihaMadara.display();

        // Uchiha Sasuke
        susanooKind = new WingedPerfectSusanoo();

        MangekyouSharinganUser uchihaSasuke = new Sasuke();

        uchihaSasuke.setSusanoo(susanooKind);

        uchihaSasuke.display();

        // Uchiha Itachi
        susanooKind = new ArmoredSusanoo();

        MangekyouSharinganUser uchihaItachi = new Itachi();

        uchihaItachi.setSusanoo(susanooKind);

        uchihaItachi.display();
    }

}