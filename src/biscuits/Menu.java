package biscuits;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		int number;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter the number of biscuits to generate: ");
		number = userInput.nextInt();
		Box allBiscuits = new Box(true, number);
		
		System.out.println("Please enter the number of boxes to sort the biscuits into: ");
		number = userInput.nextInt();
		BoxArray boxes = new BoxArray(number, allBiscuits.getAllBisucits());
		userInput.close();
		
		
		System.out.println("\n\nAll Biscuits:");
		System.out.println(allBiscuits.displayBiscuits());
		System.out.println("\n\nBoxes: ");
		System.out.println(boxes.displayBiscuits());

	}

}
