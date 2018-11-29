package udemy03_OOP_Part2_encapsulation;

public class Main {

	public static void main(String[] args) {
		
		//Main method
		
		Printer print1 = new Printer(150,true);
		Printer print2 = new Printer(20,false);
		
		System.out.println("Toner Level :" +print1.getTonerlvl());
		
		print1.print(100);
		
		System.out.println("Toner Level :" +print1.getTonerlvl());
		
		print1.print(20000);
		
		System.out.println("Toner Level :" +print1.getTonerlvl());
		
		print1.filltoner(20);
		
		print2.print(10);
	}

}
