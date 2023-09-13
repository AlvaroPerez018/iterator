package pattern;

public class Invoker {
    public void executeCommand(Command command, Receiver receiver) {
        command.execute(receiver);
    }
}
