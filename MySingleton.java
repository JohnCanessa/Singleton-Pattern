package singleton.pattern.canessa;

/*
 * MySingleton.MySingleton to get access to the instance.
 */
public class MySingleton {

	// **** variable ****
	private static MySingleton singleInstance = null;
	
	public 	String str;
	
	// **** constructor ****
	private MySingleton() {
		str = "class instantiated";
	}
	
	// **** creates an instance of this class ****
	public static MySingleton MySingleton() {
		
		// **** create the single instance (if needed) ****
		if (singleInstance == null)
			singleInstance = new MySingleton();
			
		// **** return the single instance ****
		return singleInstance;
	}
	
}
