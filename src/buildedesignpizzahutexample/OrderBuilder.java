package buildedesignpizzahutexample;

import java.util.Scanner;

public class OrderBuilder {

	public OrderedItems preparePizza() {
		OrderedItems orderedItems = new OrderedItems();
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the choice of Pizza ");  
		System.out.println("============================");  
		System.out.println("        1. Veg-Pizza       ");  
		System.out.println("        2. Non-Veg Pizza   ");  
		System.out.println("        3. Exit            ");  
		System.out.println("============================");
		int pizzaandcolddrinkchoice = scan.nextInt();
		switch (pizzaandcolddrinkchoice) {
		case 1:{
			System.out.println("You ordered Veg Pizza");  
			System.out.println("\n\n");  
			System.out.println(" Enter the types of Veg-Pizza ");  
			System.out.println("------------------------------");  
			System.out.println("        1.Cheeze Pizza        ");  
			System.out.println("        2.Onion Pizza        ");  
			System.out.println("        4.Exit            ");  
			System.out.println("------------------------------");
			int vegpizzachoice=scan.nextInt();
			switch (vegpizzachoice) {
			case 1:
			{
				System.out.println("You ordered Cheeze Pizza");  

				System.out.println("Enter the cheeze pizza size");  
				System.out.println("------------------------------------");  
				System.out.println("    1. Small Cheeze Pizza ");  
				System.out.println("    2. Medium Cheeze Pizza ");  
				System.out.println("    3. Large Cheeze Pizza ");  
				System.out.println("------------------------------------");
				int vegpizzasize= scan.nextInt();
				switch (vegpizzasize) {
				case 1:
					orderedItems.addItems(new SmallCheesePizza());
					break;
				case 2:
					orderedItems.addItems(new MediumCheesePizza());
					break;
				case 3:
					orderedItems.addItems(new LargeCheesePizza());
				default:
					break;
				}
			}
			break;
			case 2:{
				System.out.println("You ordered onion Pizza");  

				System.out.println("Enter the cheeze pizza size");  
				System.out.println("------------------------------------");  
				System.out.println("    1. Small Cheeze Pizza ");  
				System.out.println("    2. Medium Cheeze Pizza ");  
				System.out.println("    3. Large Cheeze Pizza ");  
				System.out.println("------------------------------------");
				int vegpizzasize=scan.nextInt();
				switch (vegpizzasize) {
				case 1:
					orderedItems.addItems(new SmallOnionPizza());
					break;
				case 2:
					orderedItems.addItems(new MediumOnionPizza());
				case 3:
					orderedItems.addItems(new LargeOnionPizza());
				default:
					break;
				}
			}


			default:
				break;
			}
		}

		break;
		case 2: //nonveg pizza{
			System.out.println("You ordered Non-Veg Pizza");  
			System.out.println("\n\n");  
			System.out.println("    1. Small Non-Veg  Pizza ");  
			System.out.println("    2. Medium Non-Veg  Pizza ");  
			System.out.println("    3. Large Non-Veg  Pizza ");    
			System.out.println("------------------------------------"); 
			int nonvegpizzasize=scan.nextInt();
			switch (nonvegpizzasize) {
			case 1:
				orderedItems.addItems(new SmallNonVegPizza());
				break;
			case 2:
				orderedItems.addItems(new MediumNonVegPizza());
			case 3:
				orderedItems.addItems(new LargeNonVegPizza());
			default:
				break;
			}
			break;
		default:
			break;
		}
		scan.close();
		return orderedItems;


	}
}


