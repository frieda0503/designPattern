package sharing5_Decorator;

/**
 * 裝飾者物件實作-配料(裝飾模式)<br>
 * 半熟蛋
 * 
 * @author Frieda
 *
 */
public class Egg extends IngredientDecorator {

	public Egg(Noodle noodle) {
		super(noodle);
		description = "Egg ";
		cost = 2;
		price = 10;
	}

}
