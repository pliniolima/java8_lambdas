package java8_lambdas.unit1;

public class TypeInferenceExample {

	public static void main(String[] args) {
		printLambda(s -> s.length());
	}
	
	static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("Hello lambda"));
	}
	
	interface StringLengthLambda {
		int getLength(String s);
	}
}
