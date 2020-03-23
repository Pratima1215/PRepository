import java.util.Scanner;

public class RestaurantDemo {
	static int totalBill = 0;
	int cBiryani = 12;
	int vBiryani = 10;
	int lChoc = 5;
	int iceCream = 5;
	int cDrink = 2;
	int hDrink = 2;

	void chooseMenu() {
		System.out.println(" Choose 1 for Biryani");
		System.out.println(" Choose 2 for Desert");
		System.out.println(" Choose 3 Drink");
		Scanner sc = new Scanner(System.in);
		int tiffin = sc.nextInt();
		switch (tiffin) {
		case 1:
			chooseBiryani();

			break;
		case 2:
			chooseDesert();
			break;
		case 3:
			chooseDrink();
			break;
		default:
			System.out.println("We don't have" + tiffin + "...." + "Check our menu again");
		}

	}

	void chooseBiryani() {
		System.out.println("Which Briyani you would like to have? Choose from below options");
		System.out.println(" Choose 1 for Chicken Biryani---$10");
		System.out.println(" Choose 2 for Vegetable Biryani---$8");
		Scanner sc = new Scanner(System.in);
		int tiffin = sc.nextInt();
		switch (tiffin) {
		case 1:
			cBiryaniBill();
			break;
		case 2:
			vBiryaniBill();
			break;
		default:
			System.out.println("We don't have" + tiffin + "...." + "Check our Biryanis again");
		}

	}

	void cBiryaniBill() {
		System.out.println("How many Plates of Chicken Biryani, you would like to have" + "\n");
		Scanner sc = new Scanner(System.in);
		int numCBiryani = sc.nextInt();
		int cBiryaniBill = cBiryani * numCBiryani;
		System.out.println("Your Chicken Biryani bill is: $" + cBiryaniBill);
		RestaurantDemo.totalBill = RestaurantDemo.totalBill + cBiryaniBill;
	}

	void vBiryaniBill() {
		System.out.println("How many Plates of Veg Biryani, you would like to have" + "\n");
		Scanner sc = new Scanner(System.in);
		int numVBiryani = sc.nextInt();
		int vBiryaniBill = vBiryani * numVBiryani;
		System.out.println("Your Veg Biryani bill is: $" + vBiryaniBill);
		RestaurantDemo.totalBill = RestaurantDemo.totalBill + vBiryaniBill;
	}

	void chooseDesert() {
		System.out.println("Which Desert you would like to have? Choose from below options");
		System.out.println(" Choose 1 for Lava Choclate---$5");
		System.out.println(" Choose 2 for Ice Cream---$5");
		Scanner sc = new Scanner(System.in);
		int tiffin = sc.nextInt();
		switch (tiffin) {
		case 1:
			lavachocBill();
			break;
		case 2:
			iceCreamBill();
			break;
		default:
			System.out.println("We don't have" + tiffin + "...." + "Check our Deserts again");
		}

	}

	void lavachocBill() {
		System.out.println("How many Lava Choclates, you would like to have" + "\n");
		Scanner sc = new Scanner(System.in);
		int numLChoc = sc.nextInt();
		int lavachocBill = lChoc * numLChoc;
		System.out.println("Your Lava Choclate bill is: $" + lavachocBill);
		RestaurantDemo.totalBill = RestaurantDemo.totalBill + lavachocBill;
	}

	void iceCreamBill() {
		System.out.println("How many Ice Creams, you would like to have" + "\n");
		Scanner sc = new Scanner(System.in);
		int numIceCream = sc.nextInt();
		int iceCreamBill = iceCream * numIceCream;
		System.out.println("Your Ice Cream bill is: $" + iceCreamBill);
		RestaurantDemo.totalBill = RestaurantDemo.totalBill + iceCreamBill;
	}

	void chooseDrink() {
		System.out.println("Which Drink you would like to have? Choose from below options");
		System.out.println(" Choose 1 for cool drink---$2");
		System.out.println(" Choose 2 for hot drink---$2");
		Scanner sc = new Scanner(System.in);
		int tiffin = sc.nextInt();
		switch (tiffin) {
		case 1:
			cDrinkBill();
			break;
		case 2:
			hDrinkBill();
			break;
		default:
			System.out.println("We don't have" + tiffin + "...." + "Check our Drinks again");
		}

	}

	void cDrinkBill() {
		System.out.println("How many Cool Drinks, you would like to have" + "\n");
		Scanner sc = new Scanner(System.in);
		int numCDrink = sc.nextInt();
		int cDrinkBill = cDrink * numCDrink;
		System.out.println("Your Cool Drink bill is: $" + cDrinkBill);
		RestaurantDemo.totalBill = RestaurantDemo.totalBill + cDrinkBill;
	}

	void hDrinkBill() {
		System.out.println("How many Hot Drinks, you would like to have" + "\n");
		Scanner sc = new Scanner(System.in);
		int numHDrink = sc.nextInt();
		int hDrinkBill = hDrink * numHDrink;
		System.out.println("Your Cool Drink bill is: $" + hDrinkBill);
		RestaurantDemo.totalBill = RestaurantDemo.totalBill + hDrinkBill;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestaurantDemo rd = new RestaurantDemo();
		while (true) {
			System.out.print("Would you like to have something? Press yes or no" + "\n");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			System.out.println(s);
			if (s.equalsIgnoreCase("yes")) {
				System.out.println("Choose from the below Menu---------");
				rd.chooseMenu();
			} else
				break;

		}
		System.out.println("You are Total Bill is: $" + totalBill);

	}

}
