package ejercicio10;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Creamos el diccionario Español-Inglés
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("casa", "house");
		dictionary.put("perro", "dog");
		dictionary.put("gato", "cat");
		dictionary.put("mesa", "table");
		dictionary.put("silla", "chair");
		dictionary.put("libro", "book");
		dictionary.put("lapicero", "pen");
		dictionary.put("planta", "plant");
		dictionary.put("soporte", "stand");
		dictionary.put("ventana", "window");
		dictionary.put("puerta", "door");
		dictionary.put("ordenador", "computer");
		dictionary.put("impresora", "printer");
		dictionary.put("monitor", "monitor");
		dictionary.put("ratón", "mouse");
		dictionary.put("teclado", "keyboard");
		dictionary.put("móvil", "mobile");
		dictionary.put("television", "television");
		dictionary.put("altavoz", "speaker");
		dictionary.put("refrigerador", "refrigerator");

		
		
		// Seleccionamos 5 palabras al azar del diccionario
		Random random = new Random();
		String[] words = new String[5];
		
		for (int i = 0; i < 5; i++) {
		  // Obtenemos un índice aleatorio dentro del rango de índices del diccionario
		  int index = random.nextInt(dictionary.size());
		  
		  // Seleccionamos la palabra correspondiente al índice
		  // con el metodo .keySet() obtenemos las palabras y con .toArray() lo transformamos en Array
		  // para poder obtener una palabra mediante un indice (index)
		  String word = (String) dictionary.keySet().toArray()[index];
		  
		  //Añadimos la palabra al array de 5 palabras
		  words[i] = word;
		}

		// Pedimos al usuario que traduzca las palabras
		Scanner scanner = new Scanner(System.in);
		int correctAnswers = 0;
		int incorrectAnswers = 0;
		
		
		for (String word : words) {
		  // Mostramos la palabra al usuario y le pedimos que la traduzca al inglés
		  System.out.print("\n Traduce la palabra '" + word + "' al inglés: ");
		  String answer = scanner.nextLine().toLowerCase();
		  // Comparamos la respuesta del usuario con la traducción correcta del diccionario
		  if (answer.equals(dictionary.get(word))) {
		    correctAnswers++;
		  } else {
		    incorrectAnswers++;
		  }
		}

		// Mostramos cuántas respuestas correctas e incorrectas tiene el usuario
		System.out.println("Tienes " + correctAnswers + " respuestas correctas y " + incorrectAnswers + " respuestas incorrectas.");
	}

}
