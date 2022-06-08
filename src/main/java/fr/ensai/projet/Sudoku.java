package fr.ensai.projet;

public class Sudoku {

	public Matrix99 grille;
	public int[][][] impossibilites; // la liste des chiffres impossibles pour chaque case

	public Sudoku() {
		this.grille = new Matrix99();
		// Initialement, chaque case peut contenir n'importe lequel des 9 chiffres.
		// Il n'y a donc aucune impossibilité.
		this.impossibilites = new int[9][9][9];
	}

	public boolean valeurEstPossible(int value, int num_ligne, int num_col) {
		return (grille.estLigne(value, num_ligne) && grille.estColonne(value, num_col)
				&& grille.estCarre(value, grille.quelCarre(num_ligne, num_col)));
	}

	// Une fois l'élément de la ligne num_ligne et de la colonne num_col modifié,
	// on change la liste des possibilités des autres éléments de la ligne,
	// la colonne et du carré auxquels l'élément appartient.

	public void changeImpossibilitesLigne(int value, int num_ligne) {
		for (int i = 0; i < 9; i++) {
			this.impossibilites[num_ligne][i][value - 1] = value;
		}
	}

	public void changeImpossibilitesColonne(int value, int num_col) {
		for (int i = 0; i < 9; i++) {
			this.impossibilites[i][num_col][value - 1] = value;
		}
	}

	public int[][][] quelCarre3D(int num_ligne, int num_col) {
		int[][][] sous_mat = new int[3][3][9];
		if (num_ligne < 3) {
			if (num_col < 3) {
				sous_mat[0][0] = this.impossibilites[0][0];
				sous_mat[0][1] = this.impossibilites[0][1];
				sous_mat[0][2] = this.impossibilites[0][2];
				sous_mat[1][0] = this.impossibilites[1][0];
				sous_mat[1][1] = this.impossibilites[1][1];
				sous_mat[1][2] = this.impossibilites[1][2];
				sous_mat[2][0] = this.impossibilites[2][0];
				sous_mat[2][1] = this.impossibilites[2][1];
				sous_mat[2][2] = this.impossibilites[2][2];
			} else if (num_col < 6) {
				sous_mat[0][0] = this.impossibilites[0][3];
				sous_mat[0][1] = this.impossibilites[0][4];
				sous_mat[0][2] = this.impossibilites[0][5];
				sous_mat[1][0] = this.impossibilites[1][3];
				sous_mat[1][1] = this.impossibilites[1][4];
				sous_mat[1][2] = this.impossibilites[1][5];
				sous_mat[2][0] = this.impossibilites[2][3];
				sous_mat[2][1] = this.impossibilites[2][4];
				sous_mat[2][2] = this.impossibilites[2][5];
			} else {
				sous_mat[0][0] = this.impossibilites[0][6];
				sous_mat[0][1] = this.impossibilites[0][7];
				sous_mat[0][2] = this.impossibilites[0][8];
				sous_mat[1][0] = this.impossibilites[1][6];
				sous_mat[1][1] = this.impossibilites[1][7];
				sous_mat[1][2] = this.impossibilites[1][8];
				sous_mat[2][0] = this.impossibilites[2][6];
				sous_mat[2][1] = this.impossibilites[2][7];
				sous_mat[2][2] = this.impossibilites[2][8];
			}
		} else if (num_ligne < 6) {
			if (num_col < 3) {
				sous_mat[0][0] = this.impossibilites[3][0];
				sous_mat[0][1] = this.impossibilites[3][1];
				sous_mat[0][2] = this.impossibilites[3][2];
				sous_mat[1][0] = this.impossibilites[4][0];
				sous_mat[1][1] = this.impossibilites[4][1];
				sous_mat[1][2] = this.impossibilites[4][2];
				sous_mat[2][0] = this.impossibilites[5][0];
				sous_mat[2][1] = this.impossibilites[5][1];
				sous_mat[2][2] = this.impossibilites[5][2];
			} else if (num_col < 6) {
				sous_mat[0][0] = this.impossibilites[3][3];
				sous_mat[0][1] = this.impossibilites[3][4];
				sous_mat[0][2] = this.impossibilites[3][5];
				sous_mat[1][0] = this.impossibilites[4][3];
				sous_mat[1][1] = this.impossibilites[4][4];
				sous_mat[1][2] = this.impossibilites[4][5];
				sous_mat[2][0] = this.impossibilites[5][3];
				sous_mat[2][1] = this.impossibilites[5][4];
				sous_mat[2][2] = this.impossibilites[5][5];
			} else {
				sous_mat[0][0] = this.impossibilites[3][6];
				sous_mat[0][1] = this.impossibilites[3][7];
				sous_mat[0][2] = this.impossibilites[3][8];
				sous_mat[1][0] = this.impossibilites[4][6];
				sous_mat[1][1] = this.impossibilites[4][7];
				sous_mat[1][2] = this.impossibilites[4][8];
				sous_mat[2][0] = this.impossibilites[5][6];
				sous_mat[2][1] = this.impossibilites[5][7];
				sous_mat[2][2] = this.impossibilites[5][8];
			}
		} else {
			if (num_col < 3) {
				sous_mat[0][0] = this.impossibilites[6][0];
				sous_mat[0][1] = this.impossibilites[6][1];
				sous_mat[0][2] = this.impossibilites[6][2];
				sous_mat[1][0] = this.impossibilites[7][0];
				sous_mat[1][1] = this.impossibilites[7][1];
				sous_mat[1][2] = this.impossibilites[7][2];
				sous_mat[2][0] = this.impossibilites[8][0];
				sous_mat[2][1] = this.impossibilites[8][1];
				sous_mat[2][2] = this.impossibilites[8][2];
			} else if (num_col < 6) {
				sous_mat[0][0] = this.impossibilites[6][3];
				sous_mat[0][1] = this.impossibilites[6][4];
				sous_mat[0][2] = this.impossibilites[6][5];
				sous_mat[1][0] = this.impossibilites[7][3];
				sous_mat[1][1] = this.impossibilites[7][4];
				sous_mat[1][2] = this.impossibilites[7][5];
				sous_mat[2][0] = this.impossibilites[8][3];
				sous_mat[2][1] = this.impossibilites[8][4];
				sous_mat[2][2] = this.impossibilites[8][5];
			} else {
				sous_mat[0][0] = this.impossibilites[6][6];
				sous_mat[0][1] = this.impossibilites[6][7];
				sous_mat[0][2] = this.impossibilites[6][8];
				sous_mat[1][0] = this.impossibilites[7][6];
				sous_mat[1][1] = this.impossibilites[7][7];
				sous_mat[1][2] = this.impossibilites[7][8];
				sous_mat[2][0] = this.impossibilites[8][6];
				sous_mat[2][1] = this.impossibilites[8][7];
				sous_mat[2][2] = this.impossibilites[8][8];
			}
		}
		return sous_mat;
	}

	public void changeImpossibilitesCarre(int value, int num_ligne, int num_col) {
		int[][][] carre = quelCarre3D(num_ligne, num_col);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				carre[i][j][value - 1] = value;
			}
		}
	}

	public void remplir(int value, int num_ligne, int num_col) {
		grille.remplir(value, num_ligne, num_col);
		changeImpossibilitesLigne(value, num_ligne);
		changeImpossibilitesColonne(value, num_col);
		changeImpossibilitesCarre(value, num_ligne, num_col);
	}

}
