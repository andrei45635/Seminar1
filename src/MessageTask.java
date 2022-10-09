

public class MessageTask extends  Task{

    private final Message message;

    //super is always first!!!
    public MessageTask(String taskID, String description, Message message) {
        super(taskID, description);
        this.message = message;
    }

    //TODO: format datetime
    @Override
    public void execute() {
        System.out.println(message.getMessage() + message.getDate().toString());
    }
}
