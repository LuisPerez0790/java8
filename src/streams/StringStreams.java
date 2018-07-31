package streams;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class StringStreams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String entrada = sc.nextLine();

		IntStream streamChars = entrada.chars();

		streamChars.filter(n -> !Character.isDigit((char) n) && !Character.isWhitespace((char) n))
				.forEach(n -> System.out.println((char) n));

		String tecnologias = "HTML, CSS, JAVASCRIPT, JAVA, C++";
		Pattern.compile(", ").splitAsStream(tecnologias).forEach(System.out::println);
	}

}
