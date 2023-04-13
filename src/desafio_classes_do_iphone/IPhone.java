package desafio_classes_do_iphone;

import aplicativos.AparelhoTelefonico;
import aplicativos.NavegadorInternet;
import aplicativos.ReprodutorMusical;
import aplicativos.funcionalidades.Ipod;
import aplicativos.funcionalidades.Safari;
import aplicativos.funcionalidades.Telefone;

public class IPhone  {

	public static void main(String[] args) {
		
		AparelhoTelefonico telefone = new Telefone();
		
		telefone.ligar();
		telefone.atender();
		
		
		ReprodutorMusical ipod = new Ipod();
		
		ipod.selecionarMusica();
		ipod.tocar();

		
		NavegadorInternet safari = new Safari();
		
		safari.exibirPagina();
		safari.atualizarPagina();
	}

}
