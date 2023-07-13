package mensageiros;

public abstract class ServicoMensagem {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	protected void validarConexãoInternet() {
		System.out.println("Validando conexão com a internet...");
	}
	
}
