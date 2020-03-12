package market;

public class Guitar extends MusicIntrument {

	private final int nbOfStrings;
	private boolean atLeast3ItemMakeNoise;
	
	public Guitar(int price, boolean isNew, int nbOfStrings) {
		super(price, isNew);
		
		this.nbOfStrings = nbOfStrings;
	}

}
