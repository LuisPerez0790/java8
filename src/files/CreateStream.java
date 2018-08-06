package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CreateStream {

	public static void main(String[] args) {
		Path path = Paths.get("prueba.txt");

		try (Stream<String> lineas = Files.lines(path)) {
			lineas.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();

		Path dir = Paths.get(".");

		System.out.printf("%nEl arbol de archivos del proyecto para el recurso %s es %n", dir.toAbsolutePath());

		try (Stream<Path> paths = Files.walk(dir)) {
			paths.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
