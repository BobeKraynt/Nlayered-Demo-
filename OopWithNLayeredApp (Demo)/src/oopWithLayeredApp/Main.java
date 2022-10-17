package oopWithLayeredApp;

import oopWithLayeredApp.business.CategoryManager;
import oopWithLayeredApp.business.CourseManager;
import oopWithLayeredApp.business.InstructorManager;
import oopWithLayeredApp.core.logging.DatabaseLogger;
import oopWithLayeredApp.core.logging.EmailLogger;
import oopWithLayeredApp.core.logging.FileLogger;
import oopWithLayeredApp.core.logging.Logger;
import oopWithLayeredApp.dataAccess.HibernateCourseDao;
import oopWithLayeredApp.dataAccess.HibernateInstructorDao;
import oopWithLayeredApp.dataAccess.JdbcCategoryDao;
import oopWithLayeredApp.entities.Category;
import oopWithLayeredApp.entities.Course;
import oopWithLayeredApp.entities.Instructor;



public class Main {

	public static void main(String[] args) throws Exception {
		Instructor instructor = new Instructor("Engin Demiroğ");
		Category category = new Category("Programlama");
		Course course = new Course("Java Kampı", 0);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new EmailLogger()};
		
		System.out.println("Eğitmen");
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);
		
		System.out.println("Kategori");
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category);
		
	
		System.out.println("Kurs");
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course);

		
	}

}
