package biscuits;

import java.util.ArrayList;

public class Box {

	private ArrayList<Double> brokenBiscuits;
	private double boxWeight;

	public Box(boolean addBiscuits, int biscuitsToAdd) {

		if (addBiscuits) {
			this.brokenBiscuits = generateBiscuits(biscuitsToAdd);
		} else {
			this.brokenBiscuits = new ArrayList<Double>();
			this.boxWeight = 0.00;
		}

		bubbleSortBiscuits();

	}

	public double getBoxWeight() {
		this.boxWeight = 0.00;

		for (int i = 0; i < brokenBiscuits.size(); i++) {
			boxWeight += brokenBiscuits.get(i);

		}

		return boxWeight;
	}

	public ArrayList<Double> generateBiscuits(int noOfBiscuits) {
		ArrayList<Double> newBiscuits = new ArrayList<Double>();

		double random;
		for (int i = 0; i < noOfBiscuits; i++) {
			random = (Math.random() * 20 + 1);
			newBiscuits.add(random);
		}

		return newBiscuits;
	}

	public void bubbleSortBiscuits() {

		double temp = 0.00;
		for (int i = 0; i < brokenBiscuits.size(); i++) {
			for (int j = 0; j < brokenBiscuits.size() - 1; j++) {

				if (brokenBiscuits.get(j) < brokenBiscuits.get(j + 1)) {
					temp = brokenBiscuits.get(j);
					brokenBiscuits.set(j, brokenBiscuits.get(j + 1));
					brokenBiscuits.set(j + 1, temp);
				}
			}
		}
	}

	public void addBiscuits(double Biscuit) {

		brokenBiscuits.add(Biscuit);
	}

	public int getBoxSize() {

		return brokenBiscuits.size();

	}

	public double getIndexedBiscuit(int i) {

		double biscuit = brokenBiscuits.get(i);
		return biscuit;

	}

	public ArrayList<Double> getAllBisucits() {

		return brokenBiscuits;
	}

	public String displayBiscuits() {

		String display = "";
		for (int i = 0; i < brokenBiscuits.size(); i++) {
			display += String.format("%.2f", brokenBiscuits.get(i)) + "g, ";

		}
		return display;
	}
}