package aplicativos.funcionalidades;

import aplicativos.NavegadorInternet;

public class Safari implements NavegadorInternet{

	@Override
	public void exibirPagina() {
		System.out.println("Digitando url do site...\nExibindo págian encontrada.");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo nova guia no navegador.");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando contéudo da página.");
		
	}

}
