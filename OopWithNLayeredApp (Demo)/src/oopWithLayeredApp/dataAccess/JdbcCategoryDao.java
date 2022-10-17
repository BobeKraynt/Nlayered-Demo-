package oopWithLayeredApp.dataAccess;

import oopWithLayeredApp.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	public void add(Category category) {
		System.out.println("Jdbc ile veritabanına eklendi");
		System.out.println("------------------------------------");
	}
}
