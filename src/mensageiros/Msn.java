package mensageiros;

public class Msn extends ServicoMensagem{
	public void enviarMensagem() {
		validarConexãoInternet();
		System.out.println("Enviando mensagem pelo MSN");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN");
	}
}
