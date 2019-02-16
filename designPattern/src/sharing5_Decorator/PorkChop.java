package sharing5_Decorator;

/**
 * 裝飾者物件實作-配料(裝飾模式)<br>
 * 豬排
 * 
 * @author Frieda
 *
 */
public class PorkChop extends IngredientDecorator {

	public PorkChop(Noodle noodle) {
		super(noodle);
		description = "Pork Chop ";
		cost = 20;
		price = 55;
	}
}