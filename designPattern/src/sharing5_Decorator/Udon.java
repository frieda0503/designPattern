package sharing5_Decorator;

/**
 * 主要物件實作-烏龍麵(裝飾模式)
 * 
 * @author Frieda
 *
 */
public class Udon extends Noodle {

	public Udon() {
		description = "Udon ";
		cost = 30;
		price = 60;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public int getCost() {
		return cost;
	}

	@Override
	public int getPrice() {
		return price;
	}

}
