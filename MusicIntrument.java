package market;

public abstract  class MusicIntrument implements MarketItem {

	private final  int price;	// in dollars
	
	private final boolean isNew;

	public MusicIntrument(int price, boolean isNew) {
		this.price = price;
		this.isNew = isNew;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public boolean isNew() {
		return this.isNew;
	}
	
	@Override
	public boolean canMakeNoice() {
		return true;
	}
}
