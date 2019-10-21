package parking;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class parkingTest {
	public static void main(String[] args) throws FileNotFoundException{
		//String filename = args
		File file = new File("C:\\Users\\Adam\\eclipse-workspace\\parking\\src\\input1.txt");
		Scanner scnr = new Scanner(file);
		//String capacityStr = scnr.next();
		int cap = Integer.parseInt(scnr.next());
		System.out.println(cap);
		parkingLot p = new parkingLot(cap);
		while (scnr.hasNextLine()) {
			//System.out.println(scnr.next());
			
			String carName = scnr.next();
			String dir = scnr.next();
			
			//car c = new car(carName, dir);
			
			//System.out.println("name: "+carName);
			//System.out.println("dir: "+dir);
			if(dir.equals("enters")) {
				//System.out.println("hgbfvcdfvg");
				if(p.carEnters(carName, dir)) {
					System.out.println(carName+" has entered the parking lot.");
				}
				else {
					System.out.println(carName+" cannot enter the parking lot.");
				}
			}
			else if(dir.equals("exits")) {
				p.carExits(carName);
				System.out.println(carName+" has exited the parking lot.");
			}
		}
			
	       scnr.close();
	   }
}
