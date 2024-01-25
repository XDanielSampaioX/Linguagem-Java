package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
//		Produto p= new Produto("iPad", 3235.89, 0.13);
		
		/*
		 * 1. A partir do produto calcular o preco real (com desconto) ok
		 * 2. Importo Municipal> >= 2500 (8,5%)/ < 2500 (Isento) ok
		 * 3. Frete: >= 3000 (100)/ <3000 (50) ok
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$ 1234,56 
		 */
		
//		UnaryOperator<Double> desconto= n-> n - 13.0/100; 
//		
//		double precoComDesconto= desconto.apply(p.preco);	
//		
//		System.out.println(precoComDesconto);
//		
//		Function <Double, Double> impostoMunicipal= 
//				n-> n>= 2500 ? n + 8.5/100 : n;
//				
//		double precoComImposto= desconto.andThen(impostoMunicipal).apply(p.preco);
//		
//		System.out.println(precoComImposto);
//		
//		Function <Double, Double> frete= 
//				m-> m>= 3000 ? m + 100 : m + 50;
//				System.out.println(frete.apply(p.preco));
//				
//		double precoComFrete= desconto.andThen(impostoMunicipal).andThen(frete).apply(p.preco);	
//		
//		System.out.println(precoComFrete);
//		
//		Function <Double, String> arredondar=
//				n-> n.toString().format("%.2f", n).replace(".", ",");
//				
//		String precoArredondado= desconto.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).apply(p.preco);	
//				
//		System.out.println(precoArredondado);
//		
//		UnaryOperator<String> formatar=
//				n-> "R$ " + n;
//				
//		String formatado= desconto.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p.preco);	
//		System.out.println(formatado);
		
		
		Function<Produto, Double> precoFinal=
				produto-> produto.preco *(1- produto.desconto);
		UnaryOperator<Double> impostoMunicipal=
				preco-> preco>= 2500 ? preco* 1.085: preco;
		UnaryOperator<Double> frete=
				preco-> preco>= 3000 ? preco+ 100: preco+ 50;
		UnaryOperator<Double> arredondar =
				preco -> Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", preco));
		Function<Double, String> formatar=
				preco-> ("R$ " + preco).replace(".", ",");
		
		Produto p= new Produto("iPad", 3235.89, 0.13);
		String preco= precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O preço final é " + preco);
	}
}
