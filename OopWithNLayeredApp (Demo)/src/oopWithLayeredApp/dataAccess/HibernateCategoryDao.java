package oopWithLayeredApp.dataAccess;

import oopWithLayeredApp.entities.Category;

public class HibernateCategoryDao {
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi");
		System.out.println("------------------------------------");
	}
}
