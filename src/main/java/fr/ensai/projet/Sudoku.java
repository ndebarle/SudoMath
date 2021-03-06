package fr.ensai.projet;

import java.util.Random;

public class Sudoku {

	public Matrix99 grille;
	public boolean[][][] possibilites; // la liste des chiffres possibles pour chaque case
	public int nb_restants;
	public boolean estSolvable;

	public int nbValeursPossibles(int num_ligne, int num_col) {
		int compt = 0;
		for (int i = 0; i < 9; i++) {
			if (possibilites[num_ligne][num_col][i]) {
				compt += 1;
			}
		}
		return compt;
	}

	public int[] listeValeursPossibles(int num_ligne, int num_col) {
		int[] valeursPossibles = new int[9];
		for (int i = 0; i < 9; i++) {
			if (possibilites[num_ligne][num_col][i]) {
				valeursPossibles[i] = i + 1;
			}
		}
		return valeursPossibles;
	}

	public int nbCasesVidesLigne(int num_ligne) {
		int nb = 0;
		for (int num_col = 0; num_col < 9; num_col++) {
			if (nbValeursPossibles(num_ligne, num_col) > 0) {
				nb += 1;
			}
		}
		return nb;
	}

	// Pour récupérer le num de colonne de la case vide sur une ligne donnée.
	public int getNumCaseVideLigne(int num_ligne) {
		int nb = 0;
		for (int num_col = 0; num_col < 9; num_col++) {
			if (nbValeursPossibles(num_ligne, num_col) > 0) {
				nb = num_col;
			}
		}
		return nb;
	}

	public int nbCasesVidesColonne(int num_col) {
		int nb = 0;
		for (int num_ligne = 0; num_ligne < 9; num_ligne++) {
			if (nbValeursPossibles(num_ligne, num_col) > 0) {
				nb += 1;
			}
		}
		return nb;
	}

	// Pour récupérer le num de ligne de la case vide sur une colonne donnée.
	public int getNumCaseVideColonne(int num_col) {
		int nb = 0;
		for (int num_ligne = 0; num_ligne < 9; num_ligne++) {
			if (nbValeursPossibles(num_ligne, num_col) > 0) {
				nb = num_ligne;
			}
		}
		return nb;
	}

	public int nbCasesVidesCarre(boolean[][][] carre) {
		int nb = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int compt = 0;
				for (int k = 0; k < 9; k++) {
					if (carre[i][j][k]) {
						compt += 1;
					}
				}
				if (compt > 0) {
					nb += 1;
				}
			}
		}
		return nb;
	}

	// Pour récupérer le num de ligne et de colonne de la case vide dans un carré
	// donné.
	public int getNumCaseVideCarre(int num_ligne, int num_col) {
		int numero_ligne = 0;
		int numero_col = 0;
		for (int num_ligne = 0; num_ligne < 9; num_ligne++) {
			if (nbValeursPossibles(num_ligne, num_col) > 0) {
				nb = num_ligne;
			}
		}
		return nb;
	}

	// Une fois l'élément de la ligne num_ligne et de la colonne num_col modifié,
	// on change la liste des possibilités des autres éléments de la ligne,
	// de la colonne et du carré auxquels l'élément appartient.

	public void changePossibilitesLigne(int value, int num_ligne) {
		for (int i = 0; i < 9; i++) {
			this.possibilites[num_ligne][i][value - 1] = false;
		}
	}

	public void changePossibilitesColonne(int value, int num_col) {
		for (int i = 0; i < 9; i++) {
			this.possibilites[i][num_col][value - 1] = false;
		}
	}

	public boolean[][][] quelCarre3D(int num_ligne, int num_col) {
		boolean[][][] sous_mat = new boolean[3][3][9];
		if (num_ligne < 3) {
			if (num_col < 3) {
				sous_mat[0][0] = this.possibilites[0][0];
				sous_mat[0][1] = this.possibilites[0][1];
				sous_mat[0][2] = this.possibilites[0][2];
				sous_mat[1][0] = this.possibilites[1][0];
				sous_mat[1][1] = this.possibilites[1][1];
				sous_mat[1][2] = this.possibilites[1][2];
				sous_mat[2][0] = this.possibilites[2][0];
				sous_mat[2][1] = this.possibilites[2][1];
				sous_mat[2][2] = this.possibilites[2][2];
			} else if (num_col < 6) {
				sous_mat[0][0] = this.possibilites[0][3];
				sous_mat[0][1] = this.possibilites[0][4];
				sous_mat[0][2] = this.possibilites[0][5];
				sous_mat[1][0] = this.possibilites[1][3];
				sous_mat[1][1] = this.possibilites[1][4];
				sous_mat[1][2] = this.possibilites[1][5];
				sous_mat[2][0] = this.possibilites[2][3];
				sous_mat[2][1] = this.possibilites[2][4];
				sous_mat[2][2] = this.possibilites[2][5];
			} else {
				sous_mat[0][0] = this.possibilites[0][6];
				sous_mat[0][1] = this.possibilites[0][7];
				sous_mat[0][2] = this.possibilites[0][8];
				sous_mat[1][0] = this.possibilites[1][6];
				sous_mat[1][1] = this.possibilites[1][7];
				sous_mat[1][2] = this.possibilites[1][8];
				sous_mat[2][0] = this.possibilites[2][6];
				sous_mat[2][1] = this.possibilites[2][7];
				sous_mat[2][2] = this.possibilites[2][8];
			}
		} else if (num_ligne < 6) {
			if (num_col < 3) {
				sous_mat[0][0] = this.possibilites[3][0];
				sous_mat[0][1] = this.possibilites[3][1];
				sous_mat[0][2] = this.possibilites[3][2];
				sous_mat[1][0] = this.possibilites[4][0];
				sous_mat[1][1] = this.possibilites[4][1];
				sous_mat[1][2] = this.possibilites[4][2];
				sous_mat[2][0] = this.possibilites[5][0];
				sous_mat[2][1] = this.possibilites[5][1];
				sous_mat[2][2] = this.possibilites[5][2];
			} else if (num_col < 6) {
				sous_mat[0][0] = this.possibilites[3][3];
				sous_mat[0][1] = this.possibilites[3][4];
				sous_mat[0][2] = this.possibilites[3][5];
				sous_mat[1][0] = this.possibilites[4][3];
				sous_mat[1][1] = this.possibilites[4][4];
				sous_mat[1][2] = this.possibilites[4][5];
				sous_mat[2][0] = this.possibilites[5][3];
				sous_mat[2][1] = this.possibilites[5][4];
				sous_mat[2][2] = this.possibilites[5][5];
			} else {
				sous_mat[0][0] = this.possibilites[3][6];
				sous_mat[0][1] = this.possibilites[3][7];
				sous_mat[0][2] = this.possibilites[3][8];
				sous_mat[1][0] = this.possibilites[4][6];
				sous_mat[1][1] = this.possibilites[4][7];
				sous_mat[1][2] = this.possibilites[4][8];
				sous_mat[2][0] = this.possibilites[5][6];
				sous_mat[2][1] = this.possibilites[5][7];
				sous_mat[2][2] = this.possibilites[5][8];
			}
		} else {
			if (num_col < 3) {
				sous_mat[0][0] = this.possibilites[6][0];
				sous_mat[0][1] = this.possibilites[6][1];
				sous_mat[0][2] = this.possibilites[6][2];
				sous_mat[1][0] = this.possibilites[7][0];
				sous_mat[1][1] = this.possibilites[7][1];
				sous_mat[1][2] = this.possibilites[7][2];
				sous_mat[2][0] = this.possibilites[8][0];
				sous_mat[2][1] = this.possibilites[8][1];
				sous_mat[2][2] = this.possibilites[8][2];
			} else if (num_col < 6) {
				sous_mat[0][0] = this.possibilites[6][3];
				sous_mat[0][1] = this.possibilites[6][4];
				sous_mat[0][2] = this.possibilites[6][5];
				sous_mat[1][0] = this.possibilites[7][3];
				sous_mat[1][1] = this.possibilites[7][4];
				sous_mat[1][2] = this.possibilites[7][5];
				sous_mat[2][0] = this.possibilites[8][3];
				sous_mat[2][1] = this.possibilites[8][4];
				sous_mat[2][2] = this.possibilites[8][5];
			} else {
				sous_mat[0][0] = this.possibilites[6][6];
				sous_mat[0][1] = this.possibilites[6][7];
				sous_mat[0][2] = this.possibilites[6][8];
				sous_mat[1][0] = this.possibilites[7][6];
				sous_mat[1][1] = this.possibilites[7][7];
				sous_mat[1][2] = this.possibilites[7][8];
				sous_mat[2][0] = this.possibilites[8][6];
				sous_mat[2][1] = this.possibilites[8][7];
				sous_mat[2][2] = this.possibilites[8][8];
			}
		}
		return sous_mat;
	}

	public void changePossibilitesCarre(int value, int num_ligne, int num_col) {
		boolean[][][] carre = quelCarre3D(num_ligne, num_col);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				carre[i][j][value - 1] = false;
			}
		}
	}

	public void changePossibilites(int value, int num_ligne, int num_col) {
		changePossibilitesLigne(value, num_ligne);
		changePossibilitesColonne(value, num_col);
		changePossibilitesCarre(value, num_ligne, num_col);
		this.nb_restants -= 1;
	}

	public void remplir(Matrix99 grille_test) {
		for (int num_ligne = 0; num_ligne < 9; num_ligne++) {
			// Si on trouve une ligne sur laquelle une seule case n'est pas remplie
			if (nbCasesVidesLigne(num_ligne) == 1) {
				int col_vide = getNumCaseVideLigne(num_ligne);
				for (int i = 0; i < 9; i++) {
					if (possibilites[num_ligne][col_vide][i]) {
						grille_test.remplir(i, num_ligne, col_vide);
						changePossibilites(i + 1, num_ligne, col_vide);
					}
				}
			}
			for (int num_col = 0; num_col < 9; num_col++) {
				// Si on trouve une ligne sur laquelle une seule case n'est pas remplie
				if (nbCasesVidesColonne(num_col) == 1) {
					int ligne_vide = getNumCaseVideColonne(num_col);
					for (int i = 0; i < 9; i++) {
						if (possibilites[ligne_vide][num_col][i]) {
							grille_test.remplir(i, ligne_vide, num_col);
							changePossibilites(i + 1, ligne_vide, num_col);
						}
					}
				}
				boolean[][][] carre3D = quelCarre3D(num_ligne, num_col) {
					if (nbCasesVidesCarre(carre3D) == 1) {
						for (int k = 0; k < 9; k++) {
							
						}
					}
				}
				
			}
		}
		Random r = new Random();
		int numero_ligne = r.nextInt(9);
		int numero_col = r.nextInt(9);
		if (nbValeursPossibles(numero_ligne, numero_col) == 1) {
			for (int i = 0; i < 9; i++) {
				if (possibilites[numero_ligne][numero_col][i]) {
					grille_test.remplir(i + 1, numero_ligne, numero_col);
					changePossibilites(i + 1, numero_ligne, numero_col);
				}
			}
		} else {
			int valeur = r.nextInt(9) + 1;
			if (possibilites[numero_ligne][numero_col][valeur - 1]) {
				grille_test.remplir(valeur, numero_ligne, numero_col);
				changePossibilites(valeur, numero_ligne, numero_col);
			}
		}
	}

	public Sudoku() {
		this.grille = new Matrix99();
		// Initialement, chaque case peut contenir n'importe lequel des 9 chiffres.
		this.possibilites = new boolean[9][9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				for (int k = 0; k < 9; k++) {
					possibilites[i][j][k] = true;
				}
			}
		}
		this.nb_restants = 81;
		this.estSolvable = true;
		// On rentre les valeurs initiales de la grille
		for (int i = 0; i < 24; i++) {
			remplir(grille);
		}
		Matrix99 grille_test = grille;
		remplir(grille_test);
		if (this.estSolvable) {

		}
	}

}
