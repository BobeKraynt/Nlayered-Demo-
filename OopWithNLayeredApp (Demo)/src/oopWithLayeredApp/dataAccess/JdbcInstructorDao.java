package oopWithLayeredApp.dataAccess;

import oopWithLayeredApp.entities.Instructor;

public class JdbcInstructorDao {

	public void add(Instructor instructor) {
		System.out.println("Jdbc ile veritabanına eklendi");
		System.out.println("------------------------------------");
	}
}
