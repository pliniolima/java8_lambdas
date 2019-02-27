package java8_lambdas.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import java8_lambdas.unit1.Person;

public class CollectionInterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Zinedine", "Zidane", 60),
				new Person("Lewis", "Hamilton", 56),
				new Person("Fernando", "Alonso", 59),
				new Person("Cliff", "Lee", 32),
				new Person("Diego", "Lee", 29)
			);
		
		List<String> list = people.stream()
		.filter(p -> p.getAge() < 60)
		.map(Person::getLastName)
		.distinct()
		.limit(2)
		.collect(Collectors.toList());
	}
}
