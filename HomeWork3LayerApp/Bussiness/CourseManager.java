package HomeWork3LayerApp.Bussiness;

import HomeWork3LayerApp.DataAccess.CourseDao;
import HomeWork3LayerApp.DataAccess.HibernateCourseDao;
import HomeWork3LayerApp.Entities.Course;
import HomeWork3LayerApp.Logger.Logger;

import java.util.List;

public class CourseManager {

    private final HibernateCourseDao loggers;
    private final List<Course> courses;

    public CourseManager(List<Course> courseDao, HibernateCourseDao loggers, List<Course> courses) {
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course) throws Exception {
        if (course.getPrice() <= 0) {
            throw new Exception("The price of course are not be able to be less than zero");
        }
        for (Course c : courses) {
            if (c.getName().equals(course.getName())) {
                throw new Exception("You created already before this course ");
            }
        }

        CourseDao.add(course);
        courses.add(course);

        for (Logger logger : loggers)
            logger.log(course.getName());

    }
}
