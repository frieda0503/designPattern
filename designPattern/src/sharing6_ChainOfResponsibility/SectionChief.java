package sharing6_ChainOfResponsibility;

/**
 * 科長
 * 
 * @author Frieda
 *
 */
public class SectionChief extends Manager {

	public SectionChief(String name) {
		super(name);
	}

	@Override
	public void apply(Requisition request) {
		// 可批准5天以下的假，其他往上級送
		if (request.getRequestType().equals("請假")
				&& request.getRequestCount() <= 5) {
			System.out.print(request.getRequestType() + ":"
					+ request.getRequestContent());
			System.out.println(" " + request.getRequestCount() + "天 被" + name
					+ "批准");
		} else {
			if (superior != null) {
				superior.apply(request);
			}
		}
	}

}
