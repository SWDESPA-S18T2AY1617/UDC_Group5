package control;

import java.util.ArrayList;

import server.DoctorManager;
import view.CalendarProgram;
import view.DoctorMainView;

public class DoctorController {
	private DoctorManager doctorManager;
	private ArrayList<CalendarProgram> calendarProgram;
	
	public DoctorController()
	{
		doctorManager = new DoctorManager();
		calendarProgram = new ArrayList<CalendarProgram>();
		for(int ctr = 0; ctr<doctorManager.getAllDoctor().size(); ctr++){
			calendarProgram.add(new CalendarProgram(new DoctorMainView()));
		}
	}
}
