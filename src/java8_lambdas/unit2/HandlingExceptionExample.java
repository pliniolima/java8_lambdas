package java8_lambdas.unit2;

import java.util.function.BiConsumer;

public class HandlingExceptionExample {

	public static void main(String[] args) {
		int[] someNumbers = {1,2,3,4};
		int key = 2;
		
		process(someNumbers, key, wrapperLambda((k, v) -> System.out.println(k / v)));
	}

	private static <T, U> BiConsumer<T, U> wrapperLambda(BiConsumer<T, U> consumer) {
		return (k, v) -> {
			try {
				consumer.accept(k, v);
			} catch (Exception e) {
				System.out.println("Exception from a lambda!");
			}
		};
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : someNumbers) {
			consumer.accept(i, key);
		}
		
	}

}
