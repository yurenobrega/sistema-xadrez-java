package tabuleiro;

public class Peça {

	protected Posiçao posiçao;
	private Tabuleiro tabuleiro;
	
	public Peça(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posiçao = null;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
}
