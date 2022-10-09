package HomeWork3LayerApp;

import HomeWork3LayerApp.Bussiness.CategoryManager;
import HomeWork3LayerApp.Bussiness.CourseManager;
import HomeWork3LayerApp.Bussiness.InstructorManager;
import HomeWork3LayerApp.DataAccess.*;
import HomeWork3LayerApp.Entities.Category;
import HomeWork3LayerApp.Entities.Course;
import HomeWork3LayerApp.Entities.Instructor;

import java.util.ArrayList;
import java.util.List;



public class Main {
    private static List<Course> loggers;

    public static void main(String[] args) throws Exception{

        Course course1 = new Course(1, "Java2022", 0.0);
        //Course course2 = new Course(2, "Java2022", 0);

        List<Course> courseList = new ArrayList<>();

        CourseManager courseManager = new CourseManager(courseList, new HibernateCourseDao(), loggers);
        courseManager.add(course1);
        //courseManager.add(course2);


        System.out.println("----------------------------------------------------------");

        Category category1 = new Category(1, "Programming");


        List<Category> categoryDb = new ArrayList<>();


        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category1);


        System.out.println("----------------------------------------------------------");

        Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
        instructorManager.add(instructor);


    }
}
