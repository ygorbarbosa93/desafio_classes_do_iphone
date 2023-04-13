package aplicativos.funcionalidades;

import aplicativos.ReprodutorMusical;

public class Ipod implements ReprodutorMusical{

	@Override
	public void tocar() {
		selecionarMusica();
		System.out.println("Tocando música.");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música.");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música.");
		
	}

}
