package test;

public class Employee {
	private Integer eid;
	private String ename;
	private String edesg;
	private double bsal;
	private double totsal;
	public Employee() {
		super();
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdesg() {
		return edesg;
	}
	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}
	public double getBsal() {
		return bsal;
	}
	public void setBsal(double bsal) {
		this.bsal = bsal;
	}
	public double getTotsal() {
		return totsal;
	}
	public void setTotsal(double totsal) {
		this.totsal = totsal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edesg=" + edesg + ", bsal=" + bsal + ", totsal="
				+ totsal + "]";
	}


}
