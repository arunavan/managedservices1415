package mediator;

public abstract class ChatUser {
	protected ChatMediator mediator;
	protected String name;
	
	public ChatUser(ChatMediator med, String name){
		this.mediator=med;
		this.name=name;
	}
	
	public abstract void send(String msg);
	
	public abstract void receive(String msg);
}
