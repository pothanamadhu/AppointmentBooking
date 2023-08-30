package ms;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface msDAO {
	List<Doctor> getAllDoctors();

	List<Slot> getAllSlots();

	boolean insertPatient(Patient p);

	boolean deleteSlot(int docid, int sid);

	int getPatientId(Patient pp);

	boolean addAppointment(Patient pp, int n);

	int getAppointmentId(Patient pp);
}