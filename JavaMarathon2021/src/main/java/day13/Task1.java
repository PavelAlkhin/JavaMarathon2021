package day13;

import static java.lang.Thread.sleep;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        User u1 = new User("User1");
        User u2 = new User("User2");
        User u3 = new User("User3");

        u1.sendMessage(u2, "from 1 to 2 Hi1");
        u1.sendMessage(u2, "from 1 to 2 Hi2");
        sleep(10);

        u2.sendMessage(u1, "from 2 to 1 Hi1");
        u2.sendMessage(u1, "from 2 to 1 Hi2");
        u2.sendMessage(u1, "from 2 to 1 Hi3");
        sleep(10);

        u3.sendMessage(u1, "Привет");
        u3.sendMessage(u1, "сколько время?");
        u3.sendMessage(u1, "как дела?");
        sleep(10);

        u1.sendMessage(u3, "время много");
        u1.sendMessage(u3, "дела хорошо ");
        u1.sendMessage(u3, "сам как?");
        sleep(10);

        u1.sendMessage(u3, "у меня еще лучше");
        sleep(10);

        u3.sendMessage(u1, "ну вот и славно");
        sleep(10);

        MessageDatabase.showDialog(u1, u3);
    }
}
