package HomeWork3LayerApp.DataAccess;

import HomeWork3LayerApp.Entities.Course;

public interface CourseDao {

   static void add(Course course);

    void update(Course course);

    void delete(Course course);
}
