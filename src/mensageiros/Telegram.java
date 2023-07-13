package mensageiros;

public class Telegram extends ServicoMensagem{
	public void enviarMensagem() {
		validarConexãoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}

}
