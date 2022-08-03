package mediator;

public class ChatClient {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		ChatUser user1 = new ChatUserImpl(mediator, "Ram");
		ChatUser user2 = new ChatUserImpl(mediator, "Smith");
		ChatUser user3 = new ChatUserImpl(mediator, "John");
		ChatUser user4 = new ChatUserImpl(mediator, "Peter");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		user1.send("Hi All");
		user1.send("Good afternoon");
		
	}
}
