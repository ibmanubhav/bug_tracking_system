
public class Manager extends Employee {
	private int projectid;
	private REVIEWEDSTATUS reviewstatus;
	private int bugid;
	private BUGSTATUS testerstatus;
	private BUGSTATUS developerstatus;

	Manager(int id, String name, String emailid, int mobile, String role, int projectid, int bugid,
			BUGSTATUS testerstatus, BUGSTATUS developerstatus) {
		super(id, name, emailid, mobile, role);
		this.bugid = bugid;
		this.testerstatus = testerstatus;
		this.developerstatus = developerstatus;
		this.projectid = projectid;

	}
	public Manager() {
		
	}


	public void finalStatus() {

		System.out.println(getReviewstatus());
	}

	public void verifyBugStatus() {
		if (testerstatus == BUGSTATUS.OPEN && developerstatus == BUGSTATUS.FIXED) {
			setReviewstatus(REVIEWEDSTATUS.APPROVED);
		} else {
			setReviewstatus(REVIEWEDSTATUS.REOPEN);
		}

	}

	@Override
	public String toString() {
		return "Manager [projectid" + projectid + ", reviewstatus=" + reviewstatus + ", bugid=" + bugid
				+ ", testerstatus=" + testerstatus + ", developerstatus=" + developerstatus + "]";
	}

	public int getProjectname() {
		return projectid;
	}

	public void setProjectname(int projectname) {
		this.projectid = projectname;
	}

	public REVIEWEDSTATUS getReviewstatus() {
		return reviewstatus;
	}

	public void setReviewstatus(REVIEWEDSTATUS reviewstatus) {
		this.reviewstatus = reviewstatus;
	}

}
