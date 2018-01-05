package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.CategoryDao;
import com.project.model.Category;
@Service
public class CategoryServiceImpl implements CategorySevice{
@Autowired
private CategoryDao categoryDao;
	public List<Category> getAllCategories() {
		
		return categoryDao.getAllCategories();
	}

}
