package ms;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

// int s_id, int s_did, String s_date, String s_time
public class SlotMapper implements RowMapper<Slot> {

	public Slot mapRow(ResultSet rs, int i) throws SQLException {

		Slot s = new Slot();
		s.setS_id(rs.getInt(1));
		s.setS_did(rs.getInt(2));
		s.setS_date(rs.getString(3));
		s.setS_time(rs.getString(4));
		return s;
	}
}