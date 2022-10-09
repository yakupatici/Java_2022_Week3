package HomeWork3LayerApp.DataAccess;

import HomeWork3LayerApp.Entities.Course;

public class HibernateCourseDao implements  CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Category is added by using Hibernate : " + course.getName() + " " + course.getId() + " " + course.getPrice());
    }

    @Override
    public void update(Course course) {
        System.out.println("Category is updatied by using Hibernate : " + course.getName() + " " + course.getId() + " " + course.getPrice());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Category is deleted by using Hibernate : " + course.getName() + " " + course.getId() + " " + course.getPrice());
    }
}
