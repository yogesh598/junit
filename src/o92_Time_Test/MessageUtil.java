package o92_Time_Test;

public class MessageUtil {

	private String name;
	
	public MessageUtil(String message) {
		this.name = message;
	}
	//prints the message
	public String printMessage() {
		System.out.println(name);
		return name;
	}
	public String salutationMessage() {
		name = "Hi "+name;
		System.out.println(name);
		return name;
	}
}
