package lab5;

class MySingleton {
	public static void main(String[] args) {
		Singleton s = Singleton.getKey();
		Singleton s1 = Singleton.getKey();
	}
}

class Singleton {
	String key;
	private static Singleton ob;
	
	private Singleton() {
		this.key = "K123";
	}
	
	public static Singleton getKey() {
		if (ob == null) {
			ob = new Singleton();
			System.out.println("Successfully generated");
			System.out.println("your key is " + ob.key);
		} else {
			System.out.println("Unsuccessful");
		}
		return ob;		
	}
}
