package xadrez;

import tabuleiro.Posiçao;
import tabuleiro.Tabuleiro;
import xadrez.peças.*;

public class PartidaXadrez {
	private Tabuleiro tabuleiro;

	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		configuraçaoInicial();
	}

	public PeçaXadrez[][] getPeças() {
		PeçaXadrez[][] mat = new PeçaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PeçaXadrez) tabuleiro.peça(i, j);
			}
		}
		return mat;
	}

	private void configuraçaoInicial() {
		tabuleiro.colocarPeça(new Torre(tabuleiro, Cor.BRANCO), new Posiçao(0, 4));
		tabuleiro.colocarPeça(new Rei(tabuleiro, Cor.PRETO), new Posiçao(2, 1));
		tabuleiro.colocarPeça(new Rei(tabuleiro, Cor.BRANCO), new Posiçao(7, 4));
	}

}
