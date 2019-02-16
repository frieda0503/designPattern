package sharing5_Decorator;

/**
 * 主要物件-麵(裝飾模式)
 * 
 * @author Frieda
 *
 */
public abstract class Noodle {

	protected String description = "";
	protected int cost;
	protected int price;

	public abstract String getDescription();

	public abstract int getCost();

	public abstract int getPrice();
}
