package java8_lambdas.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseJava7 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Zinedine", "Zidane", 60), new Person("Lewis", "Hamilton", 56),
				new Person("Fernando", "Alonso", 67), new Person("Cliff", "Lee", 32), new Person("Diego", "Souza", 29));

		// ordernar a lista
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}

		});

		// criar um metodo pra imprimir os elementos
		printAll(people);

		// criar um metodo que imprime todos que comecam com a letra C
		printConditinally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
		});
	}

	private static void printConditinally(List<Person> people, Condition condition) {
		for (Person person : people) {
			if (condition.test(person)) {
				System.out.println(person);
			}
		}
		
	}

	private static void printAll(List<Person> people) {
		for (Person person : people) {
			System.out.println(person);
		}
		
	}

}

interface Condition {
	boolean test(Person p);
}