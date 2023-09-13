import commands.Command;

public class DeviceButton {

    private Command command;


    public DeviceButton(Command Command){
        this.command = Command;
    }

    public void press(){
        command.execute();
    }

    public void pressUndo(){
        command.undo();
    }
}




