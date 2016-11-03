package at.fraunz.sample;

/*
 * This solution is considered better as it performs singleton instantiation when getInstance() is called.
 */
public class BillPughSingleton
{
	private BillPughSingleton() {}

	private static class SingletonHelper
	{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance()
	{
		return SingletonHelper.INSTANCE;
	}
}
