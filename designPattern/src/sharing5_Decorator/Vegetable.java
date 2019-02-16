package sharing5_Decorator;

/**
 * 裝飾者物件實作-配料(裝飾模式)<br>
 * 青菜
 * 
 * @author Frieda
 *
 */
public class Vegetable extends IngredientDecorator {

	public Vegetable(Noodle noodle) {
		super(noodle);
		description = "Vegetable ";
		cost = 35;
		price = 50;
	}

}
