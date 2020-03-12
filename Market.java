package market;

import java.util.ArrayList;
import java.util.List;

public class Market {
	
	private List<MarketItem> items;
	
	public int getNumberOfSecondHand(int MarketItem) {
		int countTheNumberOfSecondHand = 0;
		for(MarketItem secondHand : this.items) {
			if(secondHand.isNew() == true) {
				countTheNumberOfSecondHand++;
			}
		}
		return countTheNumberOfSecondHand;
	}
	
	
	public boolean atLeast3ItemMakeNoise() {
		int countItemCanMakeNoice = 0;
		boolean result = false;
		for(MarketItem ms : this.items) {
			if(ms.canMakeNoice()) {
				countItemCanMakeNoice++;
			}
			
			if(countItemCanMakeNoice >= 3 ) {
				result = true;
			}
		}
		return result;
		
	}

	
	public Market() {
		this.items = new ArrayList<>();
	}

	public List<MarketItem> getItems() {
		return items;
	}
	
	/**
	 * @param price
	 * @param Market 
	 * @return the list of items which are: 
	 *                 - new
	 *                 - below the given price
	 */
	public List<MarketItem> getNewItemsBelowOrEqualTo(int price) {
		List<MarketItem> result= new ArrayList<MarketItem>();

		// Loop on all market items
		for(MarketItem mi : this.items) {
			
			// If the item is cheaper than price  + if item si new -> add it
			if (mi.getPrice() <= price && mi.isNew() == true) {
				result.add(mi);
			}
		}
		
		return result;
	}
	
	
	
	public void addItem(MarketItem item) {
		this.items.add(item);
	}
}
