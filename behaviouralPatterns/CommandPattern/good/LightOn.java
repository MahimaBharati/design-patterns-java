public class LightOn implements Command{
    Light light;
    LightOn(Light light){
        this.light=light;
    }
    public void execute(){
        light.on();
    }
    public void undo(){
        light.off();
    }
}
