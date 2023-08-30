package ms;

public class appointment {
	private int ap_id, ap_docid, ap_ptnid, ap_slotid;
	private String ap_bdate, ap_adate, ap_status;

	public appointment(int ap_id, String ap_bdate, String ap_adate, int ap_docid, int ap_ptnid, int ap_slotid,
			String ap_status) {
		this.ap_id = ap_id;
		this.ap_docid = ap_docid;
		this.ap_ptnid = ap_ptnid;
		this.ap_slotid = ap_slotid;
		this.ap_bdate = ap_bdate;
		this.ap_adate = ap_adate;
		this.ap_status = ap_status;
	}

	public int getAp_id() {
		return ap_id;
	}

	public void setAp_id(int ap_id) {
		this.ap_id = ap_id;
	}

	public int getAp_docid() {
		return ap_docid;
	}

	public void setAp_docid(int ap_docid) {
		this.ap_docid = ap_docid;
	}

	public int getAp_ptnid() {
		return ap_ptnid;
	}

	public void setAp_ptnid(int ap_ptnid) {
		this.ap_ptnid = ap_ptnid;
	}

	public int getAp_slotid() {
		return ap_slotid;
	}

	public void setAp_slotid(int ap_slotid) {
		this.ap_slotid = ap_slotid;
	}

	public String getAp_bdate() {
		return ap_bdate;
	}

	public void setAp_bdate(String ap_bdate) {
		this.ap_bdate = ap_bdate;
	}

	public String getAp_adate() {
		return ap_adate;
	}

	public void setAp_adate(String ap_adate) {
		this.ap_adate = ap_adate;
	}

	public String getAp_status() {
		return ap_status;
	}

	public void setAp_status(String ap_status) {
		this.ap_status = ap_status;
	}
}