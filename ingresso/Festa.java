package exercicios.ingresso;

public class Festa {
	public static void main(String[] args) {

		IngressoNormal ingressoNormal = new IngressoNormal(50);
		CamaroteSuperior ingressoVip = new CamaroteSuperior(50);
		
		ingressoNormal.imprimeTipoDeIngresso();
		ingressoVip.imprimeValor();
	}
}
