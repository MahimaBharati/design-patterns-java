public class ACOn implements Command{
    AC ac;
    ACOn(AC ac){
        this.ac=ac;
    }
    public void execute(){
        ac.on();
    }
    public void undo(){
        ac.off();
    }
}
