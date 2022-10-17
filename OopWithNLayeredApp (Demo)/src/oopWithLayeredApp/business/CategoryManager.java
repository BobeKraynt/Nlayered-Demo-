package oopWithLayeredApp.business;

import java.util.ArrayList;
import java.util.List;

import oopWithLayeredApp.core.logging.Logger;
import oopWithLayeredApp.dataAccess.CategoryDao;
import oopWithLayeredApp.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List <String> categoryName = new ArrayList<>();
	
	public CategoryManager(CategoryDao categoryDao, Logger[]  loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		if (categoryName.contains(category.getName())) {
			throw new Exception("Aynı kategori yalnızca bir defa eklenebilir.");
		} else {
			categoryName.add(category.getName());
			categoryDao.add(category);
			for (Logger logger : loggers) {
			logger.log(category.getName());
			}
		}			
	}
}