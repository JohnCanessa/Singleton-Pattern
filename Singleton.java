package singleton.pattern.canessa;

/*
 * Using getSingleInstance() to get access to the instance.
 */
public class Singleton {
	
	// **** variable ****
	private static Singleton singleInstance = null;
	
	public 	String str;
	
	// **** constructor ****
	private Singleton() {
		str = "class instantiated";
	}
	
	// **** creates an instance of this class ****
	public static Singleton getSingleInstance() {
		
		// **** create the single instance (if needed) ****
		if (singleInstance == null)
			singleInstance = new Singleton();
			
		// **** return the single instance ****
		return singleInstance;
	}

}
