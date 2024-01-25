package exercicios.imovel;

public class CompraImovel {
	public static void main(String[] args) {
		
		NovoImovel novoImovel = new NovoImovel("Rua Guanabara", 180000);
		VelhoImovel velhoImovel = new VelhoImovel("Rua Parque", 180000);
		
		System.out.println("Esse imóvel é novo e custa " +
		novoImovel.getPreco() + " está localizado na " + novoImovel.getEndereco());
		System.out.println("Esse imóvel é velho e custa " +
		velhoImovel.getPreco() + " está localizado na " + velhoImovel.getEndereco());
	}
}
