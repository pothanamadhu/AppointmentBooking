package ms;

public class Slot {
	private int s_id, s_did;
	private String s_date, s_time;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public int getS_did() {
		return s_did;
	}

	public void setS_did(int s_did) {
		this.s_did = s_did;
	}

	public String getS_date() {
		return s_date;
	}

	public void setS_date(String s_date) {
		this.s_date = s_date;
	}

	public String getS_time() {
		return s_time;
	}

	public void setS_time(String s_time) {
		this.s_time = s_time;
	}

	public Slot() {

	}

	public Slot(int s_id, int s_did, String s_date, String s_time) {
		super();
		this.s_id = s_id;
		this.s_did = s_did;
		this.s_date = s_date;
		this.s_time = s_time;
	}
}