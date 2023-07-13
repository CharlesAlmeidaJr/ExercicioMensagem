package mensageiros;

public class Facebook extends ServicoMensagem{
	public void enviarMensagem() {
		validarConexãoInternet();
		System.out.println("Enviando mensagem pelo Facebook");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook");
	}
}
