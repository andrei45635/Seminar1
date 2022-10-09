import java.time.LocalDateTime;
//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Message msg1 = new Message("cf", "andrei", "munte", LocalDateTime.now());
        Task t1 = new MessageTask("t1", "msg1", msg1);
        Message msg2 = new Message("cf", "andrei", "munte", LocalDateTime.now());
        Task t2 = new MessageTask("t2", "msg1", msg2);
        Message msg3 = new Message("cf", "andrei", "munte", LocalDateTime.now());
        Task t3 = new MessageTask("t3", "msg1", msg3);
        Message msg4 = new Message("cf", "andrei", "munte", LocalDateTime.now());
        Task t4 = new MessageTask("t4", "msg1", msg4);
        Message msg5 = new Message("cf", "andrei", "munte", LocalDateTime.now());
        Task t5 = new MessageTask("t5", "msg1", msg5);

        List<Task> vct = new LinkedList<>();
        vct.add(t1);
        vct.add(t2);
        vct.add(t3);
        vct.add(t4);
        vct.add(t5);
        for(Task t: vct){
            System.out.println(t.toString());
        }
    }
}