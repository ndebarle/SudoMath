package sudoku;

public class Sudoku {

	public Matrix99 grille;
	public int[][][] possibilites; // la liste des chiffrs possibles pour chaque case

	public Sudoku() {
		this.mat = new Matrix99();
	}

	// Une fois l'élément de la ligne i et de la colonne j modifié,
	// on change la liste des possibilités des autres éléments 
	protected void changePossible(int i, int j) {

	}

}