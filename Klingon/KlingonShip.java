import java.util.Scanner;

/**
 * AlienShip 
 * 
 * @author (SK) 
 * @version ()
 */
public class KlingonShip
{
	double photonPower;
	int threatFactor;
	double cosmicProximity;
	
	
	//Put the displayKlingonDetails()and getDangerLeve() methods below.
	public void displayKlingonDetails() {
		
		
		promptSettings();

		System.out.println( getDangerLevel());
	}
	
	public double getDangerLevel() {
		
		// Calculate the dangerLevel
		double dangerLevel =  (photonPower * threatFactor) / cosmicProximity;
		
		System.out.println("------------------------------------------------------");
		
		// Prints the Danger level for the KlingonShip
		System.out.println("This is the Danger Level " + dangerLevel);
		return dangerLevel; 
	}
	
	
	public void promptSettings() {
		
		// Create the object for Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt Message for Photon Power
		System.out.print("Please enter the full Photon Power for your KlingonShip?: ");
		
		// connecting the variable with the prompt message to save the users data
		photonPower = input.nextDouble();
		
		
		// Prompt Message for threatFactor
		System.out.print("Please enter the threatFactor?: ");
		
		// connecting the variable with the prompt message to save the users data
		threatFactor = input.nextInt();
		
		
		//Prompt message for CosmicProximity
		System.out.print("Please enter the CosmicProximity?: ");
		
		// connecting the variable with the prompt message to save the users data
		cosmicProximity = input.nextDouble();
		
		//Display this information to look nice
		System.out.println("Welcome to the place for details about out KlingonShip");
		System.out.println("------------------------------------------------------");
		System.out.println("Photon Power " + photonPower );
		System.out.println("------------------------------------------------------");
		System.out.println("ThreatFactor " + threatFactor );
		System.out.println("------------------------------------------------------");
		System.out.println("CosmicProximity " + cosmicProximity);
	
		
		//Close the Scanner
		input.close();
		
	}
	
	
	
}
