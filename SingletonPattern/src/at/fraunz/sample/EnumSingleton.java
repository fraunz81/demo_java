package at.fraunz.sample;

public enum EnumSingleton
{
	INSTANCE;
	
	private EnumSingletonObject inst = new EnumSingletonObject();
	
	public EnumSingletonObject getInstance()
	{
		return inst;
	}
	
	public void method()
	{
		System.out.println("Singleton Method");
	}

}
