package aplicativos.funcionalidades;

import aplicativos.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico{

	public void ligar() {
		System.out.println("Discando numero...\nFazendo a ligação.");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo a ligação.");
		
	}

	@Override
	public void iniciarCorrerioVoz() {
		System.out.println("Abrindo correio de voz...\nInicializando correio de voz.");
		
	}
}
