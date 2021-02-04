package o8_Test_Suite_Class;

public class MessageUtil {

	private String message;
	
	public MessageUtil(String message) {
		this.message = message;
	}
	//prints the message
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	public String salutationMessage() {
		message = "Hi "+message;
		System.out.println(message);
		return message;
	}
}
