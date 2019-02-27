package java8_lambdas.unit1;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();

		Greeting lambdaGreeting = () -> System.out.println("Hello world!!");
		
		Greeting innerClassFreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello world");
			}
		};
		
		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassFreeting);
	}
}
