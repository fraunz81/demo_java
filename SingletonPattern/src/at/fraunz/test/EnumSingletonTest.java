/**
 * 
 */
package at.fraunz.test;

import at.fraunz.sample.EnumSingleton;

/**
 * @author franz
 * Quelle:
 * http://www.topjavatutorial.com/design-pattern/singleton-design-pattern-in-java/
 */
public class EnumSingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println(EnumSingleton.INSTANCE.getInstance().getMessage());
		EnumSingleton.INSTANCE.method();

	}

}
