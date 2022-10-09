package HomeWork3LayerApp.DataAccess;

import HomeWork3LayerApp.Entities.Category;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Category is added by using Jdbc : " + category.getName() + " " + category.getId());
    }

    @Override
    public void update(Category category) {
        System.out.println("Category is updated by using Jdbc : " + category.getName() + " " + category.getId());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Category is deleted by using Jdbc : " + category.getName() + " " + category.getId());
    }
}
