package sharing5_Decorator;

/**
 * 裝飾者物件-配料(裝飾模式)<br>
 * 傳進來的基本麵跟自身配料做相加
 * 
 * @author Frieda
 *
 */
public abstract class IngredientDecorator extends Noodle {

	protected Noodle noodle;

	public IngredientDecorator(Noodle noodle) {
		this.noodle = noodle;
	}

	@Override
	public String getDescription() {
		return noodle.getDescription() + "with " + description;
	}

	@Override
	public int getCost() {
		return noodle.getCost() + cost;
	}

	@Override
	public int getPrice() {
		return noodle.getPrice() + price;
	}

}
