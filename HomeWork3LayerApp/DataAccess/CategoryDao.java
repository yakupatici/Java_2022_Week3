package HomeWork3LayerApp.DataAccess;

import HomeWork3LayerApp.Entities.Category;

public interface CategoryDao {

    void add(Category category);

    void update(Category category);

    void delete(Category category);
}
