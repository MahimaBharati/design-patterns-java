public class Main {
    public static void main(String[] args){
        Light light=new Light();
        AC ac=new AC();
        NaiveRemoteControl remoteControl=new NaiveRemoteControl(light,ac);
        remoteControl.pressLightOn();
        remoteControl.pressACOn();
        remoteControl.pressUndo();
        remoteControl.pressACOff();
        remoteControl.pressUndo();
    }
}
