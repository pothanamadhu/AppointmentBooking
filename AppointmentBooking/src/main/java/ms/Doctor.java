package ms;

public class Doctor {
	private int d_id;
	private String d_name, d_gender, d_qual;
	private int d_exp;

	public Doctor() {

	}

	public Doctor(int d_id, String d_name, String d_gender, String d_qual, int d_exp) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.d_gender = d_gender;
		this.d_qual = d_qual;
		this.d_exp = d_exp;
	}

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getD_gender() {
		return d_gender;
	}

	public void setD_gender(String d_gender) {
		this.d_gender = d_gender;
	}

	public String getD_qual() {
		return d_qual;
	}

	public void setD_qual(String d_qual) {
		this.d_qual = d_qual;
	}

	public int getD_exp() {
		return d_exp;
	}

	public void setD_exp(int d_exp) {
		this.d_exp = d_exp;
	}
}