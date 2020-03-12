package market;

import java.util.List;

public class Main {

	public static void main(String args[]) {
		Market myMarket = new Market();
		
		Book ronanBookAboutJava  = new Book(2000, true);
		Piano ronanPiano = new Piano(400, true, "Yamaha");
		Piano ronanPiano1 = new Piano(400, true, "Yamaha");
		Piano ronanPiano2 = new Piano(400, true, "Yamaha");
		Guitar ronanGuitar = new Guitar(400, false, 6);
		
		myMarket.addItem(ronanBookAboutJava);
		myMarket.addItem(ronanPiano);
		myMarket.addItem(ronanPiano1);
		myMarket.addItem(ronanPiano2);
		myMarket.addItem(ronanGuitar);
		
		myMarket.getNumberOfSecondHand(0);
		List<MarketItem> result = myMarket.getNewItemsBelowOrEqualTo(500);
		
		System.out.println("Result size shall be 1 : " + result.size());
		
		System.out.println("The second hand of item is :" + myMarket.getNumberOfSecondHand(0));
		System.out.println("Result size shall be 1 : " + myMarket.atLeast3ItemMakeNoise());
	}
}
