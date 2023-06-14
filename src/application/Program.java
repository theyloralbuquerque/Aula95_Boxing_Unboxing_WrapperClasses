package application;

public class Program {

	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj = x; // Object é uma classe padrão do Java, por isso não criei ela.
						// Boxing
		
		System.out.println(obj);
		
		int y = (int) obj; // Unboxing aqui. Tem que usar o Casting.
		
		System.out.println(y*2);
		
		Integer a = 50;  // Wrapper classes aqui (Boxing e Unboxing de maneira natural).
		
		int b = a;  // Não foi necessário usar o Casting, pois "a" é uma Wrapper class.
		
		System.out.println(b);

	}

}
