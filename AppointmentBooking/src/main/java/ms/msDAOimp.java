package ms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class msDAOimp implements msDAO {

	JdbcTemplate jdbcTemplate;

	private final String SQL_GET_DOCTORS = "select * from msdoctor";
	private final String SQL_GET_SLOTS = "select * from appslot";
	private final String SQL_INSERT_PATIENT = "insert into mspatient(ptn_name,ptn_age,ptn_gender,ptn_mobile) values (?,?,?,?)";
	private final String SQL_DELETE_SLOT = "delete from appslot where s_id=? and s_docid=?";
	private final String SQL_GET_PATIENT = "select ptn_id  from mspatient where ptn_name=? and ptn_age=? and ptn_gender=? and ptn_mobile=?";
	private final String SQL_INSERT_APPOINTMENT = "insert into msappointment(ap_bdate,ap_adate,ap_docid,ap_ptnid,ap_slotid,ap_status) values (?,?,?,?,?,?)";
	private final String SQL_GET_APP_ID = "select ap_id  from msappointment where ap_adate=? and ap_docid=? and ap_slotid=?";

	@Autowired
	public msDAOimp(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<Doctor> getAllDoctors() {

		return jdbcTemplate.query(SQL_GET_DOCTORS, new DoctorMapper());
	}

	public List<Slot> getAllSlots() {

		return jdbcTemplate.query(SQL_GET_SLOTS, new SlotMapper());
	}

	public boolean insertPatient(Patient p) {

		return jdbcTemplate.update(SQL_INSERT_PATIENT, p.getPtn_name(), p.getPtn_age(), p.getPtn_gender(),
				p.getPtn_mobile()) > 0;
	}

	public boolean deleteSlot(int docid, int sid) {

		return jdbcTemplate.update(SQL_DELETE_SLOT, sid, docid) > 0;
	}

	@Override
	public int getPatientId(Patient p) {
		String ptnName = p.getPtn_name();
		int ptnAge = p.getPtn_age();
		String ptnGender = p.getPtn_gender();
		String ptnMobile = p.getPtn_mobile();

		Integer patientId = jdbcTemplate.queryForObject(SQL_GET_PATIENT,
				new Object[] { ptnName, ptnAge, ptnGender, ptnMobile }, Integer.class);
		return patientId != null ? patientId : -1;

	}

	@Override
	public boolean addAppointment(Patient p, int n) {
		LocalDate l = LocalDate.now();
		String s = l + "";
		String date1 = p.getAdate();
		String date2 = s;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date u1, u2;
		java.sql.Date sqlDate2 = null;
		java.sql.Date sqlDate1 = null;
		try {
			u1 = dateFormat.parse(date1);
			sqlDate1 = new java.sql.Date(u1.getTime());
			u2 = dateFormat.parse(date2);
			sqlDate2 = new java.sql.Date(u2.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return jdbcTemplate.update(SQL_INSERT_APPOINTMENT, sqlDate2, sqlDate1, p.getDocid(), n, p.getSid(), "s") > 0;
	}

	@Override
	public int getAppointmentId(Patient p) {
		String ad = p.getAdate();
		int di = p.getDocid();
		int si = p.getSid();
		String date1 = ad;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date u1;
		java.sql.Date sqlDate1 = null;
		try {
			u1 = dateFormat.parse(date1);
			sqlDate1 = new java.sql.Date(u1.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Integer patientId = jdbcTemplate.queryForObject(SQL_GET_APP_ID, new Object[] { sqlDate1, di, si },
				Integer.class);
		return patientId != null ? patientId : -1;

	}

}