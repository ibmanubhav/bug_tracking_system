
public class BugInfo {
	private int bugid;
	private String bugname;
	private String bugpriority;
	private String projectname;
	private String buglocation;
	private String bugtype;
	private BUGSTATUS bugstatus;
	private int projectid;
	// private BUGSTATUS BUGSTATUS;

	BugInfo(int bugid, String bugname, String bugpriority, String projectname, String buglocation, String bugtype,
			BUGSTATUS bugstatus, int projectid) {
		this.bugid = bugid;
		this.bugname = bugname;
		this.bugpriority = bugpriority;
		this.projectname = projectname;
		this.buglocation = buglocation;
		this.bugtype = bugtype;
		this.bugstatus = bugstatus;
		this.projectid = projectid;

	}

	


	@Override
	public String toString() {
		return "BugInfo [bugid=" + bugid + ", bugname=" + bugname + ", bugpriority=" + bugpriority + ", projectname="
				+ projectname + ", buglocation=" + buglocation + ", bugtype=" + bugtype + ", bugstatus=" + bugstatus
				+ ", projectid=" + projectid + "]";
	}




	void addBug() {
		System.out.println("New Bug is Created");

	}

	public BUGSTATUS getBugstatus() {
		return bugstatus;
	}

	public void setBugstatus(BUGSTATUS bugstatus) {
		this.bugstatus = bugstatus;
	}

	public int getBugid() {
		return bugid;
	}

	public void setBugid(int bugid) {
		this.bugid = bugid;
	}

	public String getBugname() {
		return bugname;
	}

	public void setBugname(String bugname) {
		this.bugname = bugname;
	}

	public String getBugpriority() {
		return bugpriority;
	}

	public void setBugpriority(String bugpriority) {
		this.bugpriority = bugpriority;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getBuglocation() {
		return buglocation;
	}

	public void setBuglocation(String buglocation) {
		this.buglocation = buglocation;
	}

	public String getBugtype() {
		return bugtype;
	}

	public void setBugtype(String bugtype) {
		this.bugtype = bugtype;
	}

}
