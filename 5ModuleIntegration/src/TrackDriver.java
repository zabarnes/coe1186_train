import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class TrackDriver {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Load track 
		Track trackTester = new Track();

//SUB-SYSTEM DEMONSTRATION
		//Run this-- loads track 
		// 
		//move 












		/*Block get1 = trackTester.getBlock(19, "green");
		Block get2 = trackTester.getBlock(47, "red");


		trackTester.showBeacon(35, "red");
		System.out.println(trackTester.getBlock(35,"red").getBeacon());

		trackTester.placeTrain("green", 1);
		System.out.println("Block retrieved through train methods");
		System.out.println();
		System.out.println(trackTester.getBlock(1).gui1());

		
*/

/*
		//Broken Rail
		System.out.println(get1.getSection() + get1.getBlockNumber() + " broken: " +get1.isBroken());
		get1.toggleBroken();
		System.out.println(get1.getSection() + get1.getBlockNumber() + " broken: " +get1.isBroken());

		//Broken Circuit
		System.out.println(get2.getSection() + get2.getBlockNumber() + " is occupied: " +get2.isBlockOccupied());
		get2.breakCircuit();
		System.out.println(get2.getSection() + get2.getBlockNumber() + " is occupied: " +get2.isBlockOccupied());
		
		//Power failure? 

*/


//TEST CROSSING 

		/*
		Block get1 = trackTester.getBlock(19, "green");
		System.out.println(get1);
		System.out.println(get1.isCrossing());

		Block get2 = trackTester.getBlock(47, "red");
		System.out.println(get2);
		System.out.println(get2.isCrossing());

		System.out.println(get1.getCrossing());
		get1.getCrossing().toggleCrossing();
		System.out.println(get2.getCrossing());

		Random pls = new Random();
		System.out.println(pls.nextInt(50));
		System.out.println(pls.nextInt(50));


*/


		//E18



		//trackTester.placeTrain("green", 1);
		//System.out.println(trackTester.getBlock(1).toString());


/*
		trackTester.placeTrain("green", 100);
		trackTester.updateDistance(100,10000);


		Block get1 = trackTester.getBlock(7, "red");
		System.out.println(get1.getBeacon());


*/

//TEST BEACON




//TEST TRAIN GET BLOCK
/*
		Block trainBlock = trackTester.getBlock(100);
		System.out.println(trainBlock.toString());
*/

/* TEST GET BLOCK
		trackTester.placeTrain("green", 100);
		trackTester.updateDistance(100,10000);

		Block trainBlock = trackTester.getTrainBlock(100);
		System.out.println(trainBlock.toString());

*/
/*
		Block get1 = trackTester.getBlock(27, "red");
		Block get2 = trackTester.getBlock(28,"red");
		System.out.println(get1.toString() + " switch: " + get2.isSwitch());
		System.out.println(get2.toString() + " switch: " + get2.isSwitch());

		System.out.println(trackTester.getRoute("red","SHADYSIDE").toString());




		trackTester.commandAuthority("red", 15, 27);
		trackTester.commandSpeed("red", 20, 27);

		System.out.println(get1.toString() + " authority: " + get1.getTrainAuthority());
		System.out.println();


		System.out.println(get1.toString() + " speed: " + get1.getTrainCommandedSpeed());

*/

// TESTING SWITCH TO STRING! 

		/*if(get1.isSwitch())
		{
			System.out.println(get1.getSwitch().toString());
		}

		if(get2.isSwitch())
		{
			System.out.println(get2.getSwitch().toString());
		}
*/

//		trackTester.getRoute("green","PIONEER");

//TEST GETTING ROUTE FOR CTC
		//trackTester.getRoute("green","PIONEER");
	/*	trackTester.getRoute("green","EDGEBROOK");
		trackTester.getRoute("green","BLANK");
		trackTester.getRoute("green","WHITED");
		trackTester.getRoute("green","SOUTH BANK");
*/

/*
		System.out.println(trackTester.getRoute("red","SHADYSIDE").toString());
		System.out.println(trackTester.getRoute("red","SWISSVILLE").toString());

		trackTester.getRoute("red","HERRON AVE");
		trackTester.getRoute("red","SWISSVILLE");

		trackTester.placeTrain("green", 1);
		trackTester.placeTrain("red", 5);

*/

//TESTING PLACE OTHER TRAINS. 
		//trackTester.placeTrain("green", 2);
		//trackTester.placeTrain("green", 3);
		//trackTester.placeTrain("green", 4);
		//trackTester.placeTrain("Red", 15);

//TESTING TRAIN TRAVERSAL. 
		
		/*trackTester.placeTrain("green", 5);
		for(int i = 0;i<1000;i++)
		{
			trackTester.updateDistance(5,100);
			//trackTester.updateDistance(TrainID, distance)
		}
		*/ 

		/*
		trackTester.toggleSwitch("Green", 153);
		trackTester.toggleSwitch("Green", 1);
		
		
		
		for(int i = 0;i<100;i++)
		{
			
			trackTester.updateDistance(10,50);
			//trackTester.updateDistance(TrainID, distance)

			
		}

		for(int i = 0;i<100;i++)
		{
			
			trackTester.updateDistance(10,50);
			//trackTester.updateDistance(TrainID, distance)

			
		}
		
		//trackTester.displayTrack();

		trackTester.getBlock(10, "Green").printBlock();

		
		
		

		ArrayList<String> soyoStrings = trackTester.getRoute("Green", "EDGEBROOK");

		for(String pls: soyoStrings)
		{
			System.out.println(pls);
			
		}
		
		//System.out.println(trackTester.getBlock(15,"Green").getBeacon());
	
		
		*/
		//trackTester.getBlock(100, "Green");
		
		//int trainID = 5;
		
		
		//trackTester.placeTrain(5,"Green",trainID);
		
		
		
	}

}



