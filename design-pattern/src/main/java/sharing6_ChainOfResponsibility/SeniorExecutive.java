package sharing6_ChainOfResponsibility;

/**
 * 高階長官
 * 
 * @author Frieda
 *
 */
public class SeniorExecutive extends Manager {

	public SeniorExecutive(String name) {
		super(name);
	}

	@Override
	public void apply(Requisition request) {
		if (request.getRequestType().equals("請假")) {
			System.out.print(request.getRequestType() + ":"
					+ request.getRequestContent());
			System.out.println(" " + request.getRequestCount() + "天 被" + name
					+ "批准");
		}
	}

}
