package biscuits;

import java.util.ArrayList;

public class BoxArray {

	private ArrayList<Box> biscuitBoxArray;

	public BoxArray(int noOfBoxes, ArrayList<Double> allBiscuits) {
		this.biscuitBoxArray = boxArray(noOfBoxes);
		addBiscuits(allBiscuits);

	}

	public ArrayList<Box> boxArray(int ammount) {

		ArrayList<Box> boxArray = new ArrayList<Box>();

		for (int i = 0; i < ammount; i++) {
			Box b = new Box(false, 0);
			boxArray.add(b);
		}

		return boxArray;

	}

	public void addBiscuits(ArrayList<Double> allBiscuits) {

		for (int i = 0; i < biscuitBoxArray.size(); i++) {

			biscuitBoxArray.get(i).addBiscuits(allBiscuits.get(i));
		}

		for (int j = biscuitBoxArray.size(); j < allBiscuits.size(); j++) {
			biscuitBoxArray.get(sortBoxes()).addBiscuits(allBiscuits.get(j));
		}

	}

	public int sortBoxes() {
		int index = 0;
		double temp = biscuitBoxArray.get(0).getBoxWeight();

		for (int i = 0; i < biscuitBoxArray.size(); i++) {

			if (biscuitBoxArray.get(i).getBoxWeight() < temp) {
				index = i;
				temp = biscuitBoxArray.get(i).getBoxWeight();
			}

		}
		return index;

		
	}

	public String displayBiscuits() {
		String boxes = "";
		for (int i = 0; i < biscuitBoxArray.size(); i++) {
			boxes += "\nBox-" + (i + 1) + ": " + String.format("%.2f", biscuitBoxArray.get(i).getBoxWeight()) + "g \n";
			boxes += "Contents: " + biscuitBoxArray.get(i).displayBiscuits() + "\n";
		}
		return boxes;
	}
}
