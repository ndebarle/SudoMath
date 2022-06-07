package fr.ensai.projet;

public class Matrix99 {

	public int[][] mat;

	public Matrix99() {
		this.mat = new int[9][9];
	}

	public boolean estLigne(int value, int num_ligne) {
		boolean response = False;
		for (int i = 0; i < 9; i++) {
			if (this.mat[num_ligne][i] == value) {
				response = True;
			}
		}
	}

	public boolean estColonne(int value, int num_col) {
		boolean response = False;
		for (int i = 0; i < 9; i++) {
			if (this.mat[i][num_col] == value) {
				response = True;
			}
		}
	}

	public int[][] quelCarre(int num_ligne, int num_col) {
		int[][] sous_mat = new int[3][3];
		if (num_ligne < 3) {
			if (num_col < 3) {
				sous_mat[0][0] = this.mat[0][0];
				sous_mat[0][1] = this.mat[0][1];
				sous_mat[0][2] = this.mat[0][2];
				sous_mat[1][0] = this.mat[1][0];
				sous_mat[1][1] = this.mat[1][1];
				sous_mat[1][2] = this.mat[1][2];
				sous_mat[2][0] = this.mat[2][0];
				sous_mat[2][1] = this.mat[2][1];
				sous_mat[2][2] = this.mat[2][2];
			} else if (num_col < 6) {
				sous_mat[0][0] = this.mat[0][3];
				sous_mat[0][1] = this.mat[0][4];
				sous_mat[0][2] = this.mat[0][5];
				sous_mat[1][0] = this.mat[1][3];
				sous_mat[1][1] = this.mat[1][4];
				sous_mat[1][2] = this.mat[1][5];
				sous_mat[2][0] = this.mat[2][3];
				sous_mat[2][1] = this.mat[2][4];
				sous_mat[2][2] = this.mat[2][5];
			} else {
				sous_mat[0][0] = this.mat[0][6];
				sous_mat[0][1] = this.mat[0][7];
				sous_mat[0][2] = this.mat[0][8];
				sous_mat[1][0] = this.mat[1][6];
				sous_mat[1][1] = this.mat[1][7];
				sous_mat[1][2] = this.mat[1][8];
				sous_mat[2][0] = this.mat[2][6];
				sous_mat[2][1] = this.mat[2][7];
				sous_mat[2][2] = this.mat[2][8];
			}
		} else if (num_ligne < 6) {
			if (num_col < 3) {
				sous_mat[0][0] = this.mat[3][0];
				sous_mat[0][1] = this.mat[3][1];
				sous_mat[0][2] = this.mat[3][2];
				sous_mat[1][0] = this.mat[4][0];
				sous_mat[1][1] = this.mat[4][1];
				sous_mat[1][2] = this.mat[4][2];
				sous_mat[2][0] = this.mat[5][0];
				sous_mat[2][1] = this.mat[5][1];
				sous_mat[2][2] = this.mat[5][2];
			} else if (num_col < 6) {
				sous_mat[0][0] = this.mat[3][3];
				sous_mat[0][1] = this.mat[3][4];
				sous_mat[0][2] = this.mat[3][5];
				sous_mat[1][0] = this.mat[4][3];
				sous_mat[1][1] = this.mat[4][4];
				sous_mat[1][2] = this.mat[4][5];
				sous_mat[2][0] = this.mat[5][3];
				sous_mat[2][1] = this.mat[5][4];
				sous_mat[2][2] = this.mat[5][5];
			} else {
				sous_mat[0][0] = this.mat[3][6];
				sous_mat[0][1] = this.mat[3][7];
				sous_mat[0][2] = this.mat[3][8];
				sous_mat[1][0] = this.mat[4][6];
				sous_mat[1][1] = this.mat[4][7];
				sous_mat[1][2] = this.mat[4][8];
				sous_mat[2][0] = this.mat[5][6];
				sous_mat[2][1] = this.mat[5][7];
				sous_mat[2][2] = this.mat[5][8];
			}
		} else {
			if (num_col < 3) {
				sous_mat[0][0] = this.mat[6][0];
				sous_mat[0][1] = this.mat[6][1];
				sous_mat[0][2] = this.mat[6][2];
				sous_mat[1][0] = this.mat[7][0];
				sous_mat[1][1] = this.mat[7][1];
				sous_mat[1][2] = this.mat[7][2];
				sous_mat[2][0] = this.mat[8][0];
				sous_mat[2][1] = this.mat[8][1];
				sous_mat[2][2] = this.mat[8][2];
			} else if (num_col < 6) {
				sous_mat[0][0] = this.mat[6][3];
				sous_mat[0][1] = this.mat[6][4];
				sous_mat[0][2] = this.mat[6][5];
				sous_mat[1][0] = this.mat[7][3];
				sous_mat[1][1] = this.mat[7][4];
				sous_mat[1][2] = this.mat[7][5];
				sous_mat[2][0] = this.mat[8][3];
				sous_mat[2][1] = this.mat[8][4];
				sous_mat[2][2] = this.mat[8][5];
			} else {
				sous_mat[0][0] = this.mat[6][6];
				sous_mat[0][1] = this.mat[6][7];
				sous_mat[0][2] = this.mat[6][8];
				sous_mat[1][0] = this.mat[7][6];
				sous_mat[1][1] = this.mat[7][7];
				sous_mat[1][2] = this.mat[7][8];
				sous_mat[2][0] = this.mat[8][6];
				sous_mat[2][1] = this.mat[8][7];
				sous_mat[2][2] = this.mat[8][8];
			}
		}
		return sous_mat;
	}

	public boolean estCarre(int value, int[][] carre) {
		boolean response = False;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (carre[i][j] == value) {
					response = True;
				}
			}
		}
	}
}
