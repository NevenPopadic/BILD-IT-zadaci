package zadaci_31_8_2016;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_2 {
	/*
	 * (Add package statement) Suppose you have Java source files under the
	 * directories chapter1, chapter2, . . . , chapter34. Write a program to
	 * insert the statement package chapteri; as the first line for each Java
	 * source file under the directory chapteri. Suppose chapter1, chapter2, . .
	 * . , chapter34 are under the root directory srcRootDirectory. The root
	 * directory and chapteri directory may contain other folders and files. Use
	 * the following command to run the program: java Exercise12_18
	 * srcRootDirectory
	 */

	public static void main(String[] args) throws Exception {
		// provjeravamo da li je objekat direktorij
		File folder = new File(args[0]);
		if (!folder.isDirectory()) {
			System.out.println("Directory " + args[0] + " does not exist");
			System.exit(2);
		}

		// pravimo array listu @directories u koju smjestamo listu direktorija
		ArrayList<File> directories = getDirectories(folder);
		// petlja radi sve dok direktorij objekat nije prazan
		while (!directories.isEmpty()) {
			// kreiramo array fajlova koji se nalaze u direktorijima
			ArrayList<File> files = getFiles(directories);
			// pozivamo metodu i prosledjujemo joj argumente
			insertStatement(files, directories.get(0));
			directories.remove(0);
		}
	}

	// ubacujemo string kao prvu liniju za svaki fajl u listi
	public static void insertStatement(ArrayList<File> list, File dir)
			throws Exception {
		for (int i = 0; i < list.size(); i++) {
			ArrayList<String> lines = new ArrayList<>();
			lines.add("package " + dir.getName() + ";");

			try (
			// kreiramo skener za dodavanje sadrzaja na @lines
			Scanner input = new Scanner(list.get(i));) {
				while (input.hasNext()) {
					lines.add(input.nextLine());
				}
			}

			try (
			// upisujemo @lines u fajl
			PrintWriter output = new PrintWriter(list.get(i));) {
				for (int y = 0; y < lines.size(); y++) {
					output.println(lines.get(y));
				}
			}
		}
	}

	// uspisujemo listu fajlova iz direktorija i dodajemo ih na array listu
	public static ArrayList<File> getFiles(ArrayList<File> dir) {
		if (!dir.get(0).isDirectory()) {
			System.exit(0);
		}
		ArrayList<File> list = new ArrayList<>(Arrays.asList(dir.get(0)
				.listFiles()));

		filterJavaFiles(list);
		return list;
	}

	// uklanjamo fajlove iz koji se ne zavrsavaju sa ".java"
	public static void filterJavaFiles(ArrayList<File> array) {
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i).getName();
			boolean isjavaCode = s.substring(s.lastIndexOf('.'))
					.equals(".java");
			if (!isjavaCode)
				array.remove(i);
		}
	}

	// generisemo "File" objekte dodajemo ih na listu
	public static ArrayList<File> getDirectories(File root) {
		ArrayList<File> directories = new ArrayList<>();
		for (int i = 1; i < 34; i++) {
			directories.add(new File(root, "chapter" + i));
		}
		return directories;
	}
}
