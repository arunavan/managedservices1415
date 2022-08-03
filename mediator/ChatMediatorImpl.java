package mediator;
import java.util.ArrayList;
import java.util.List;
public class ChatMediatorImpl implements ChatMediator {
	private List<ChatUser> users;
	
	public ChatMediatorImpl(){
		this.users=new ArrayList<>();
	}
	@Override
	public void addUser(ChatUser user){
		this.users.add(user);
	}
	@Override
	public void sendMessage(String msg, ChatUser user) {
		for(ChatUser u : this.users){
			//message should not be received by the user sending it
			if(u != user){
				u.receive(msg);
			}
		}
	}

}
