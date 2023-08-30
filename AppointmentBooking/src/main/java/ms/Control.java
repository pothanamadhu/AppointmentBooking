 package ms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Control {
	msDAO ms;

	@Autowired
	public Control(msDAO ms) {
		this.ms = ms;
	}

	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public String home(Model model) {

		return "home";
	}

	@RequestMapping(value = "/process", method = RequestMethod.GET)
	public String process(Patient pat, Model model) {
		model.addAttribute("patient", pat);
		System.out.println(pat.getTime() + " " + pat.getAdate());
		if (ms.deleteSlot(pat.getDocid(), pat.getSid()) && ms.insertPatient(pat)) {
			int n = ms.getPatientId(pat);
			ms.addAppointment(pat, n);
			int apid = ms.getAppointmentId(pat);
			model.addAttribute("appid", apid);
			model.addAttribute("pid", n);
			return "success";
		} else {
			return "failed";
		}
	}

	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public String first(Date dt, Model model) {
		List<Doctor> doc = ms.getAllDoctors();
		List<Slot> sl = ms.getAllSlots();
		model.addAttribute("doctors", doc);
		model.addAttribute("slots", sl);
		model.addAttribute("date", dt.getDd());
		return "booking";
	}
}