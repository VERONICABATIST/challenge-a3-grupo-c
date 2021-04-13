package fit.challenge;

public class ImcCalculator {

	/**
	 * Calculate IMC
	 * @param weight
	 * @param height
	 * @return String
	 */
	public static String calculate(double weight, double height) {
		
		double imc = weight / Math.pow(height, 2);

		if (imc < 18.5) return "Magreza";		
		if (imc >= 18 && imc < 24.9) return "Normal";		
		if (imc >= 24.9 && imc <= 30) return "Sobrepeso";		
		if (imc > 30) return "Obesidade";
		
		return "Erro inesperado!";
	}

}
