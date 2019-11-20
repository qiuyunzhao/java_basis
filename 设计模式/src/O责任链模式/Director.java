package O责任链模式;

/**
 * 主任
 */
public class Director extends Leader {

	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 3) {
			System.out.println(
					"员工：" + request.getEmpName() + "请假，天数：" + request.getLeaveDays() + ",理由：" + request.getReason());
			System.out.println("主任：" + this.name + ",审批通过！");
		} else {
			if (this.nextLeader != null) {
				this.nextLeader.handleRequest(request);  //链表传递
			}
		}
	}
	
}