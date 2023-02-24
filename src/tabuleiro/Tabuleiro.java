package tabuleiro;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private Peça[][] peças;
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new BoardException("Erro criando tabuleiro: É necessário ter pelo menos 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		peças = new Peça[linhas][colunas];
	}
	
	public int getLinhas() {
		return linhas;
	}
	
	public int getColunas() {
		return colunas;
	}
	
	public Peça peça(int linha, int coluna) {
		if (!posiçaoExiste(linha, coluna)) {
			throw new BoardException("Posição não existe no tabuleiro");
		}
		return peças[linha][coluna];
	}
	
	public Peça peça(Posiçao posiçao) {
		if (!posiçaoExiste(posiçao)) {
			throw new BoardException("Posição não existe no tabuleiro");
		}
		return peças[posiçao.getLinha()][posiçao.getColuna()];
	}
	
	public void colocarPeça(Peça peça, Posiçao posiçao) {
		if (temUmaPeça(posiçao)) {
			throw new BoardException("Já tem uma peça na posição " + posiçao);
		}
		peças[posiçao.getLinha()][posiçao.getColuna()] = peça;
		peça.posiçao = posiçao;
	}
	
	private boolean posiçaoExiste(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean posiçaoExiste(Posiçao posiçao) {
		return posiçaoExiste(posiçao.getLinha(), posiçao.getColuna());
	}
	
	public boolean temUmaPeça(Posiçao posiçao) {
		if (!posiçaoExiste(posiçao)) {
			throw new BoardException("Posição não existe no tabuleiro");
		}
		return peça(posiçao) != null;
	}
	
	
}
