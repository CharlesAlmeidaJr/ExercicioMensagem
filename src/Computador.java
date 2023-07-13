import mensageiros.Facebook;
import mensageiros.Msn;
import mensageiros.Telegram;

public class Computador {
	
	public static void main(String[] args) {
		Msn msn = new Msn();
		Facebook facebook = new Facebook();
		Telegram telegram = new Telegram();
		
		msn.enviarMensagem();
		facebook.enviarMensagem();
		telegram.enviarMensagem();
		
		msn.receberMensagem();
		facebook.receberMensagem();
		telegram.receberMensagem();
	}
	
}
