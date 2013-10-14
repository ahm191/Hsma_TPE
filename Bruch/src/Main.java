public class Main {

	public static void main(String[] args) {

		//Bruch b1 = new Bruch(2, 3);
		//Bruch b2 = new Bruch(2, 3, 4);
		Bruch b3 = new Bruch(-2,-6);
		Bruch b4 = new Bruch (-2,7);
		Bruch b5 = new Bruch(2,8);
		Bruch b6 = new Bruch(2,-8);

		System.out.println(b3.kuerzen());
		System.out.println(b4.kuerzen());
		System.out.println(b5.kuerzen());
		System.out.println(b6.kuerzen());
		
		//System.out.println(b1.toString());
		//System.out.println(b2.toString());

	}

}
