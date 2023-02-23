import java.util.Scanner;

public class Ej1_pinogallardo_andres 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double dPeso, dAltura, dImc;
		
		System.out.println("Inserte el peso de paciente (kg):");
		dPeso = entrada.nextDouble();
		System.out.println("Inserte la altura del paciente (m):");
		dAltura = entrada.nextDouble();
		
		dImc = dPeso/Math.pow(dAltura, 2);
		
		if (dImc<18.5) {
			System.out.printf("El paciente de %.2f kg y %.2f m de "
					+ "altura tiene un IMC de %.2f y tiene un diagnostico de "
					+ "Bajo Peso", dPeso, dAltura, dImc);
		}
		else if (dImc>=18.5 && dImc<=24.9) {
			System.out.printf("El paciente de %.2f kg y %.2f m de "
					+ "altura tiene un IMC de %.2f y tiene un diagnostico de "
					+ "Peso Normal (saludable)", dPeso, dAltura, dImc);
		}
		else if (dImc>=25 && dImc<=29.9) {
			System.out.printf("El paciente de %.2f kg y %.2f m de "
					+ "altura tiene un IMC de %.2f y tiene un diagnostico de "
					+ "Sobrepeso", dPeso, dAltura, dImc);
		}
		else if (dImc>=30 && dImc<=40) {
			System.out.printf("El paciente de %.2f kg y %.2f m de "
					+ "altura tiene un IMC de %.2f y tiene un diagnostico de "
					+ "Obesidad premórbida", dPeso, dAltura, dImc);
		}
		else if (dImc>40) {
			System.out.printf("El paciente de %.2f kg y %.2f m de "
					+ "altura tiene un IMC de %.2f y tiene un diagnostico de "
					+ "Obesidad mórbida", dPeso, dAltura, dImc);
		}

		entrada.close();
	}

}