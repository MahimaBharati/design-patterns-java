public class Main {
    public static void main(String[] args) {
        RemoteControl remote=new RemoteControl();
        Light light=new Light();
        AC ac=new AC();
        remote.setCommand(0,new LightOn(light));
        remote.setCommand(1,new LightOff(light));
        remote.setCommand(2,new ACOn(ac));
        remote.setCommand(3,new ACOff(ac));
        remote.pressButton(0);
        remote.pressButton(1);
        remote.pressButton(2);
        remote.undo();
    }
    
}
