package Controle;

import Visao.Frame1;
import Visao.Frame2;
import Visao.TelaInicial;

import javax.swing.*;
import java.awt.*;

public class Main {

	public static void main(String[] args) {
		
		Database data = new Database();

		TelaInicial tela = new TelaInicial(data);


		/*MenuPrincipal menu = new MenuPrincipal();
		menu.menuInicio();
		/*Database data = new Database();
		MenuComprarIngresso menui = new MenuComprarIngresso(data);
		Filme filme1 = menui.selecionarFilme(1);
		System.out.println(filme1.poltronasDisponiveis());
		Filme filme2 = menui.selecionarFilme(2);
		System.out.println(filme2.poltronasDisponiveis());
		System.out.println("comprando poltrona 1 filme1");
		filme1.comprarPoltrona(1);
		System.out.println(filme1.poltronasDisponiveis());
		filme2.comprarPoltrona(2);
		System.out.println("comprando poltrona 2 filme2");
		System.out.println(filme2.poltronasDisponiveis());
		*/



	}


}
