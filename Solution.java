package singleton.pattern.canessa;

/*
 * Used to test our singleton pattern(s).
 */
public class Solution {

	/*
	 * Scaffold to test singleton pattern.
	 */
	public static void main(String[] args) {
		
//		// **** attempt to instantiate the constructor (compiler prevents it) ****
//		Singleton singleton = new Singleton();
		
		// **** instantiate the singleton ****
		Singleton w = Singleton.getSingleInstance();
		System.out.println("main <<< w.str ==>" + w.str + "<==");
		
		// ***** instantiate the singleton ****
		Singleton x = Singleton.getSingleInstance();
		
		// **** alter the string ****
		x.str = x.str.toUpperCase();
		System.out.println("main <<< x.str ==>" + x.str + "<==");
		
		// **** w and x refer to the same instance  ****
		System.out.println("main <<< w.str ==>" + w.str + "<==");
		System.out.println();
		
		
//		// **** attempt to instantiate the constructor (compiler prevents it) ****
//		MySingleton mySingleton = new MySingleton();
		
		// **** instantiate the my singleton ****
		MySingleton y = MySingleton.MySingleton();
		System.out.println("main <<< y.str ==>" + y.str + "<==");
		
		// **** instantiate my singleton ****
		MySingleton z = MySingleton.MySingleton();
		
		// **** alter the string ****
		z.str = z.str.toUpperCase();
		System.out.println("main <<< z.str ==>" + z.str + "<==");
		
		// **** y and z refer to the same instance ****
		System.out.println("main <<< y.str ==>" + y.str + "<==");
	}

}
