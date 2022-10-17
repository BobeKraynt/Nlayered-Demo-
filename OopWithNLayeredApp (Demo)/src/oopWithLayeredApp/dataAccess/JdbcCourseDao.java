package oopWithLayeredApp.dataAccess;
import oopWithLayeredApp.entities.Course;

public class JdbcCourseDao {
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanına eklendi");
		System.out.println("------------------------------------");
	}
}
