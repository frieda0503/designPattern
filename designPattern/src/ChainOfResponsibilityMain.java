import sharing6_ChainOfResponsibility.Manager;
import sharing6_ChainOfResponsibility.Requisition;
import sharing6_ChainOfResponsibility.SectionChief;
import sharing6_ChainOfResponsibility.SeniorExecutive;
import sharing6_ChainOfResponsibility.TeamLeader;

/**
 * 公司請假簽核-(職責鏈模式)
 * 
 * @author Frieda
 *
 */
public class ChainOfResponsibilityMain {

	public static void main(String[] args) {
		Manager teamLeader = new TeamLeader("組長");
		Manager sectionChief = new SectionChief("科長");
		Manager seniorExecutive = new SeniorExecutive("高階長官");

		// 設定上級主管，指定下一層要送給誰核准
		teamLeader.setSuperior(sectionChief);
		sectionChief.setSuperior(seniorExecutive);

		Requisition request = new Requisition();
		request.setRequestType("請假");
		request.setRequestContent("特休-出國旅遊");
		request.setRequestCount(2);
		teamLeader.apply(request);

		request.setRequestCount(4);
		teamLeader.apply(request);

	}

}
