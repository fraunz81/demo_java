package at.fraunz.sample;

/*
 * We can choose to create the instance of Singleton class when the class is loaded.
 */
public class EagerSingleton
{
	// create instance eagerly
	private static EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {}
	
	public static EagerSingleton getInstance()
	{
		// just return the instance
		return instance;
	}

}
