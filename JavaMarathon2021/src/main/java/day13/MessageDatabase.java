package day13;

import java.util.*;
import java.util.stream.Collectors;

public class MessageDatabase {
    public static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text){
        Message message = new Message(u1, u2, text);
        messages.add(message);
    }

    public static List<Message> getMessages(){
        return messages;
    }

    public static void showDialog(User u1, User u2){
        /*
        этот метод должен вывести цепочку сообщений (диалог) пользователей u1 и u2. Формат вывода должен быть таким:

        user1: Привет!
        user2: Привет, user1!
        user1: Как у тебя дела?
        user2: Все ок, спасибо :)

         */
        List<Message> mainMes = messages.stream()
                .filter(message -> message.getSender()==u1)
                .filter(message -> message.getReceiver()==u2)
                .collect(Collectors.toList());

        List<Message> mesU2U1 = messages.stream()
                .filter(message -> message.getSender()==u2)
                .filter(message -> message.getReceiver()==u1)
                .collect(Collectors.toList());

        mainMes.addAll(mesU2U1);

        Collections.sort(mainMes, new Comparator<Message>() {
            public int compare(Message m1, Message m2) {
                return Long.compare(m1.getDate().getTime(), m2.getDate().getTime());
            }
        });

        for (Message m: mainMes) {
            System.out.println(String.format("%s: %s", m.getSender().getUsername(), m.getText()));
        }
    }

}
