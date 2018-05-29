package org.deploy.test;

public final class Hello {

	private static final String SAY_HELLO = "Hello i'm a test";

	private Hello() {
	}

	/**
	 * This method say hello
	 * 
	 * @return hello
	 */
	public static String sayHello() {
		return SAY_HELLO;
	}
}
