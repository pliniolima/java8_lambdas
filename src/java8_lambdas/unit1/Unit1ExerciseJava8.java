package java8_lambdas.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseJava8 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
			new Person("Zinedine", "Zidane", 60),
			new Person("Lewis", "Hamilton", 56),
			new Person("Fernando", "Alonso", 67),
			new Person("Cliff", "Lee", 32),
			new Person("Diego", "Souza", 29)
		);
		
		// ordernar a lista
		Collections.sort(people, (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
		
		// criar um metodo pra imprimir os elementos
		people
		.stream()
		.forEach(p -> System.out.println(p));
		
		// criar um metodo pra imprimir os elementos
		printConditinally(people, p -> true);

		// criar um metodo que imprime todos que comecam com a letra C
		printConditinally(people, p -> p.getFirstName().startsWith("C"));
	}

	private static void printConditinally(List<Person> people, Predicate<Person> condition) {
		for (Person person : people) {
			if (condition.test(person)) {
				System.out.println(person);
			}
		}
		
	}
}
