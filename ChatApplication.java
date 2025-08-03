package SS11.bai3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ChatApplication {
    public List<Message>messageList=new ArrayList<>();
    public void sendMessage(String sender,String content){
        Message message=new Message(sender,content);
        messageList.add(message);
    }
    public void displayMessages(){
        System.out.println("Lich su chat :");
        messageList.forEach(Message::display);

    }public void filterMessagesBySender(String sender){
        List<Message>filterdMessages=messageList.stream()
                .filter(ms->ms.getSender().equalsIgnoreCase(sender))
                .toList();
    }
};
