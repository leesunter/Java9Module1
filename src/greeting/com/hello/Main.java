package greeting.com.hello;

import examples.GreeterPrivateMethods;
import world.org.astro.Place;

public class Main {

	// need --add-modules=java.se.ee in vmrgs when running
	public static void main(String[] args) {
		System.out.println("Greetings " + Place.getPlace());

		Greet greet = new Greet();
		greet.greetSomeone("Lee", false);
	}

}


class Greet implements GreeterPrivateMethods {

	public void greetSomeone(String personName, boolean female) {
		//To use the Java9 project (module)
		GreeterPrivateMethods.super.greetSomeone(personName, female);
	}
}
