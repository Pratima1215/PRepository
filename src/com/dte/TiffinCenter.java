import java.util.Scanner;
public class TiffinCenter {
	int dosa = 5;
	int idly = 4;
	int vada = 6;
	int puri = 3;
	static int totalBill=0;
     
	void dosaBill() {
		System.out.println("How many Plates of Dosas, you would like to have"+"\n");
		Scanner sc=new Scanner(System.in);
		int numDosa= sc.nextInt();
		
		int dosaBill = dosa*numDosa;
		System.out.println("Your Dosa bill is: $"+dosaBill);
		TiffinCenter.totalBill = TiffinCenter.totalBill+dosaBill;	
	}
	void idlyBill() {
		System.out.println("How many Plates of Idly, you would like to have"+"\n");
		Scanner sc=new Scanner(System.in);
		int numIdly= sc.nextInt();
		int idlyBill = idly*numIdly;
		System.out.println("Your Idly bill is: $"+idlyBill);
		TiffinCenter.totalBill = TiffinCenter.totalBill+idlyBill;	
	}
	
	void vadaBill() {
		System.out.println("How many Plates of Vada, you would like to have"+"\n");
		Scanner sc=new Scanner(System.in);
		int numVada= sc.nextInt();
		int vadaBill = vada*numVada;
		System.out.println("Your Vada bill is: $"+vadaBill);
		TiffinCenter.totalBill = TiffinCenter.totalBill+vadaBill;	
	}
	void puriBill() {
		System.out.println("How many Plates of Puri, you would like to have"+"\n");
		Scanner sc=new Scanner(System.in);
		int numVada= sc.nextInt();
		int puriBill = puri*numVada;
		System.out.println("Your Puri bill is: $"+puriBill);
		TiffinCenter.totalBill = TiffinCenter.totalBill+puriBill;	
	}
	void chooseTiffin() {
		
		
		System.out.println(" 1) Dosa----$5");
		System.out.println(" 2) Idly----$4");
		System.out.println(" 3) Vada----$6");
		System.out.println(" 4) Puri----$3");
		Scanner sc=new Scanner(System.in);
		int tiffin = sc.nextInt();
		switch(tiffin) {
		case 1:
			dosaBill();
			break;
		case 2:
			idlyBill();
			break;
		case 3:
			vadaBill();
			break;
		case 4:
			puriBill();
			break;
		default:
			System.out.println("We have only Dosa,Idly,Vada and Puri");
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TiffinCenter tc=new TiffinCenter();
		while(true) {
			//tc.chooseTiffin();
			System.out.print("Would you like to have something? Press yes or no"+"\n");
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			System.out.println(s);
			if(s.equalsIgnoreCase("yes")) {
				System.out.println("Choose from the below Menu---------");
				tc.chooseTiffin();
				}
			
			else
				break;
		}
		
				
	System.out.println("You are Total Bill is"+ totalBill);
		if(totalBill>20){
			System.out.println("Your total is greater that 20,you are eligible for 10% discount");
			System.out.println(totalBill-((totalBill*10)/100));



		}

	}

}
