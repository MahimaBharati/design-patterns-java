public class ACOff implements Command{
    AC ac;
    ACOff(AC ac){
        this.ac=ac;
    }
    public void execute(){
        ac.off();
    }
    public void undo(){
        ac.on();
    }
}
