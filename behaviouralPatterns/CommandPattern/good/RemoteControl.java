import java.util.Stack;
public class RemoteControl {
    Stack<Command> commandHistory = new Stack<>();
    Command[] buttons=new Command[4];

    public void setCommand(int slot,Command command){
        buttons[slot]=command;
    }
    public void pressButton(int slot){
        if(buttons[slot]!=null){
            buttons[slot].execute();
            commandHistory.push(buttons[slot]);
        }
        else{
            System.out.println("No command allocated to slot: "+slot);
        }
    }
    public void undo(){
        if(!commandHistory.empty())
            commandHistory.pop().undo();
        else
        System.out.println("Nothing to undo!");
    }
}
