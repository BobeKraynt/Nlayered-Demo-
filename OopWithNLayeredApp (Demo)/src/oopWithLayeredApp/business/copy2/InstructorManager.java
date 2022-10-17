package oopWithLayeredApp.business.copy2;



import oopWithLayeredApp.core.logging.Logger;
import oopWithLayeredApp.dataAccess.InstructorDao;
import oopWithLayeredApp.entities.Instructor;


public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}
}