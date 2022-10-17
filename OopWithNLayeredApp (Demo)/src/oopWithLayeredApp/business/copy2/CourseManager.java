package oopWithLayeredApp.business.copy2;

import java.util.ArrayList;
import java.util.List;

import oopWithLayeredApp.core.logging.Logger;
import oopWithLayeredApp.dataAccess.CourseDao;
import oopWithLayeredApp.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List <String> courseName = new ArrayList<>();
	
	public CourseManager(CourseDao courseDao, Logger[]  loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		if (courseName.contains(course.getName())) {
			throw new Exception("Aynı kurs yalnızca bir defa eklenebilir.");
		} else if (course.getPrice() < 0) {
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz.");
		} else {
			courseName.add(course.getName());
			courseDao.add(course);
			for (Logger logger : loggers) {
			logger.log(course.getName());
			}
		}
	}
}