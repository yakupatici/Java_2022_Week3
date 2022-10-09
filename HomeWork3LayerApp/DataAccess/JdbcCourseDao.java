package HomeWork3LayerApp.DataAccess;

import HomeWork3LayerApp.Entities.Course;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Category is added by using Jdbc : " + course.getName() + " " + course.getId() + " " + course.getPrice());
    }

    @Override
    public void update(Course course) {
        System.out.println("Category is updatied by using Jdbc : " + course.getName() + " " + course.getId() + " " + course.getPrice());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Category is deleted by using Jdbc : " + course.getName() + " " + course.getId() + " " + course.getPrice());
    }
}
