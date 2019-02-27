package java8_lambdas.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java8_lambdas.unit1.Person;

public class StandartFunctionalInterfaceExample {
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
		printConditinally(people, p -> true, p -> System.out.println(p));

		// criar um metodo que imprime todos que comecam com a letra C
		printConditinally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p.getFirstName()));
	}

	private static void printConditinally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}
		
	}
}
