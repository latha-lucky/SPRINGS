package assignment;

public class Project {
	private int projectid;
	private String projectname;
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	@Override
	public String toString() {
		return "Project [projectid=" + projectid + ", projectname=" + projectname + "]";
	}
	

}
