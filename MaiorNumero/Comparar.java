package exercicios.ExAP1.MaiorNumero;

public class Comparar {

	private int num1, num2, num3;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	public void maiorEntre(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			System.out.println("O n�mero maior é: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O n�mero maior é: " + num2);
		} else {
			System.out.println("O n�mero maior é: " + num3);
		}
	}

}