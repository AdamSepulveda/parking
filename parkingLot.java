package parking;
import java.util.LinkedList;


public class parkingLot {
	private int carsParked;
	private int capacity;
	private LinkedList<car>carList;
	private LinkedList<String>carNames;
	public parkingLot(int c){
		capacity = c;
		carsParked = 0;
		carList = new LinkedList<car>();
		carNames = new LinkedList<String>();
	}
	public boolean carEnters(String n, String d){
		carsParked++;
		if (carsParked>capacity) {
			carsParked--;
			return false;
		}
		else {
			car parkedCar = new car(n, d);
			carList.add(parkedCar);
			carNames.add(n);
			return true;
		}
	}
	public void carExits(String n) {
		carsParked--;
		car checkCar = new car(n,"enters");
		if(!carList.isEmpty()) {
			if(!carNames.contains(n)) {
				//carList.remove(checkCar);
				System.out.println(n+" is not in parking lot");
			}
		}
	}
	public car getCar() {
		return carList.getFirst();
	}
}
