package aulas.aula59_funcoes_para_string;

public class Main {

	public static void main(String[] args) {


		String original = "  abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(4);
		String s05 = original.substring(4, 13);
		String s06 = original.replace('a', 'Y');
		String s07 = original.replace("ab", "XY");
		int i = original.indexOf("bc");
		int l = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-"); // Minúsculo
		System.out.println("toUpperCase: -" + s02 + "-"); // Maiúsculo
		System.out.println("trim: -" + s03 + "-"); // Retira espaços dos cantos
		System.out.println("substring(4): -" + s04 + "-"); // Recorta a partir de
		System.out.println("substring(4, 12): -" + s05 + "-"); // Recorta a partir de e até
		System.out.println("replace('a', 'Y'): -" + s06 + "-"); // Substitui por
		System.out.println("replace('abc', 'XY'): -" + s07 + "-"); // Substitui por
		System.out.println("indexOf('bc'): " + i); // Primeiro índice do termo
		System.out.println("lastindexOf('bc'): " + l); // Último índice do termo
		
		
		// Operação Split: recorta a String e divide suas partes
		System.out.println(" ");
		System.out.println("// Operação Split //");
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" "); // Recorta a String a partir do separador informado entre aspas
		
		System.out.println("String: " + s);
		System.out.printf("%nString recortada:%n%s%n%s%n%s", vect[0], vect[1], vect[2]);
		
		
	}

}
