package app;

import tabuleiro.Posiçao;
import tabuleiro.Tabuleiro;
import xadrez.PartidaXadrez;


public class Main {

	public static void main(String[] args) {

		PartidaXadrez partidaXadrez = new PartidaXadrez();
		UI.printTabuleiro(partidaXadrez.getPeças());
	}

}
