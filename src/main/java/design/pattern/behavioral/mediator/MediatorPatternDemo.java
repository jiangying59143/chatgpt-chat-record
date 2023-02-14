package design.pattern.behavioral.mediator;

import java.util.Date;

interface ChatRoom {
    public void showMessage(User user, String message);
}

class ChatRoomImpl implements ChatRoom {
    @Override
    public void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}

class User {
    private String name;
    private ChatRoom chatRoom;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void sendMessage(String message) {
        chatRoom.showMessage(this, message);
    }
}

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoomImpl();

        User user1 = new User("John Doe", chatRoom);
        User user2 = new User("Jane Doe", chatRoom);

        user1.sendMessage("Hi there!");
        user2.sendMessage("Hello!");
    }
}
