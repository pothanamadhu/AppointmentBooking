package ms;

public class Patient {
	private int ptn_age, sid, docid;
	private String time, adate, ptn_mobile;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAdate() {
		return adate;
	}

	public void setAdate(String adate) {
		this.adate = adate;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getDocid() {
		return docid;
	}

	public void setDocid(int docid) {
		this.docid = docid;
	}

	private String ptn_name, ptn_gender;

	public int getPtn_age() {
		return ptn_age;
	}

	public void setPtn_age(int ptn_age) {
		this.ptn_age = ptn_age;
	}

	public String getPtn_mobile() {
		return ptn_mobile;
	}

	public void setPtn_mobile(String ptn_mobile) {
		this.ptn_mobile = ptn_mobile;
	}

	public String getPtn_name() {
		return ptn_name;
	}

	public void setPtn_name(String ptn_name) {
		this.ptn_name = ptn_name;
	}

	public String getPtn_gender() {
		return ptn_gender;
	}

	public void setPtn_gender(String ptn_gender) {
		this.ptn_gender = ptn_gender;
	}

}