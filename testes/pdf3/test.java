package base;

public class Gastos {

	double TaxaMetabolica;

	public double CalculoTaxaMetabolica(int idade, double peso, String sexo) {
		if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("m")) {
			if (idade >= 10 && idade <= 18) {
				this.TaxaMetabolica = 17.5 * peso + 651;
			} else if (idade >= 18 && idade <= 30) {
				this.TaxaMetabolica = 15.3 * peso + 679;
			} else if (idade >= 30 && idade <= 60) {
				this.TaxaMetabolica = 8.7 * peso + 879;
			} else if (idade > 65) {
				this.TaxaMetabolica = 13.5 * peso + 487;
			}
		} else {
			if (idade >= 10 && idade <= 18) {
				this.TaxaMetabolica = 12.2 * peso + 746;
			} else if (idade >= 18 && idade <= 30) {
				this.TaxaMetabolica = 14.7 * peso + 496;
			} else if (idade >= 30 && idade <= 60) {
				this.TaxaMetabolica = 8.7 * peso + 829;
			} else if (idade > 65) {
				this.TaxaMetabolica = 10.5 * peso + 596;
			}

		}
		return this.TaxaMetabolica;
	}

	public double CalculaFatorAtividade(String sexo, int rota) {
		String Sexo = sexo;
		int Rota = rota;

		switch (rota) {
		case 1:
			return 1.2;

		case 2:
			if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("m")) {
				return 1.4;
			} else {
				return 1.3;
			}
		case 3:
			if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("m")) {
				return 1.5;
			} else {
				return 1.45;
			}
		case 4:
			if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("m")) {
				return 1.6;
			} else {
				return 1.5;
			}

		case 5:
			if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("m")) {
				return 1.8;

			} else {
				return 1.7;
			}
		default:
			return 0;
		}

	}

	public double CalculoCalorias(double TaxaMetabolica, double FatorAtividade) {
		return TaxaMetabolica * FatorAtividade;
	}

}