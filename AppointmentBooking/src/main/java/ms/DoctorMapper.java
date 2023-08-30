package ms;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DoctorMapper implements RowMapper<Doctor> {

	public Doctor mapRow(ResultSet rs, int i) throws SQLException {

		Doctor d = new Doctor();
		d.setD_id(rs.getInt(1));
		d.setD_name(rs.getString(2));
		d.setD_gender(rs.getString(3));
		d.setD_qual(rs.getString(4));
		d.setD_exp(rs.getInt(5));
		return d;
	}
}