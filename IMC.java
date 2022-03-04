import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calculadora de IMC:");
		
		System.out.println("Digite o peso:");
		double peso = teclado.nextDouble();
		System.out.println("Digite a Altura:");
		double altura = teclado.nextDouble();
		double imc = (peso/(altura*altura));
		
		if(imc < 18.5)
			System.out.println("Abaixo do Peso.");
		else {
			if(imc < 25.0)
				System.out.println("Peso normal.");
			else {
				if(imc < 30.0)
					System.out.println("Acima do Peso");
				else {
					if(imc < 35.0)
						System.out.println("Obesidade Grau 1");
					else {
						if(imc < 40.0)
							System.out.println("Obesidade Grau 2");
						else
							System.out.println("Obesidade Mórbida.");
		teclado.close();
					}
				}
			}
		}
	}
}
