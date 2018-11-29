package udemy03_OOP_Part2_encapsulation;

public class Printer {

	private int tonerlvl;
	private int noofpagesprtd;
	private boolean duplex;
	

	public Printer(int tonerlvl,boolean duplex) {
		//constructor to set the printer can run only once
		
			if (tonerlvl <=100) {
				this.tonerlvl = tonerlvl;
			}
			else {
				System.out.println("Toner Level will be set to 100, cannot exceed");
				this.tonerlvl = 100;
			}
			this.duplex = duplex;
		
	}
	
	public void filltoner(int refill) {
		
		if (refill > 0) {
				
			if (this.tonerlvl+refill <= 100) {
				this.tonerlvl = this.tonerlvl+refill;  
				System.out.println("Toner Level : " +this.tonerlvl);
			}
			else {
				System.out.println("Toner Level is : " +this.tonerlvl +" set to 100, cannot exceed");
				this.tonerlvl = 100;
			}
		
			System.out.println("No of pages that can be printed: " +this.tonerlvl*50);
		}
		else {
			System.out.println("Refill needs to be > 0");
		}
	}
	
	public void print(int noofpages) {
		
		if ((this.tonerlvl - noofpages/50 ) < 0) {
			noofpages = this.tonerlvl*50;
			System.out.println("Toner level less, printing first " +noofpages +" pages");
		}
			
		if (noofpages < 0) {
			noofpages = -1 * noofpages;
			System.out.println("No of pages cannot be -ve, set to :" +noofpages);
		}
		
		this.noofpagesprtd = this.noofpagesprtd + noofpages;
		System.out.println("Pages printed so far is :" +this.noofpagesprtd);
		
		if (this.duplex) {
			System.out.println("Number of papers used :" +this.noofpagesprtd/2);
		}
		
		this.tonerlvl = this.tonerlvl - noofpages/50;
	}

	public int getTonerlvl() {
		return tonerlvl;
	}

}
