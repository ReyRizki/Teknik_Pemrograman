
package Facade;


public class SimpleSmartRoomFacade {
    private Light lampu;
    private AirConditioner ac;
    private NightLamp lampuTidur;
    
    public SimpleSmartRoomFacade(Light lampu, AirConditioner ac, 
            NightLamp lampuTidur){
        this.lampu = lampu;
        this.ac = ac;
        this.lampuTidur = lampuTidur;
    }
    
    public void ModeSiang(){
        lampu.off();
        ac.on();
        lampuTidur.off();
    }
    
    public void ModeSore(){
        lampu.on();
        ac.on();
        lampuTidur.off();
    }
    
    public void ModeMalam(){
        lampu.off();
        ac.off();
        lampuTidur.on();
    }
    
    public void ModeKosong(){
        lampu.off();
        ac.off();
        lampuTidur.off();
    }
}
