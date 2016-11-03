package at.fraunz.sample;

/*
 * Singleton-Pattern for multi threaded environments
 * aber nicht so ganz
 */
public class SingletonMulti
{
	private static SingletonMulti instance;
	
	private SingletonMulti() {}
	
	public static SingletonMulti getInstance()
	{
		// first check if instance is available
		if (instance == null)
			// if instance not available, enter synchronized block to create
			synchronized (SingletonMulti.class)
			{
				if (instance == null)
					instance = new SingletonMulti();
			}
		
		return instance;
	}

}
