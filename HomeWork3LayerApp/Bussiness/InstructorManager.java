package HomeWork3LayerApp.Bussiness;

import HomeWork3LayerApp.DataAccess.HibernateInstructorDao;
import HomeWork3LayerApp.DataAccess.InstructorDao;
import HomeWork3LayerApp.Entities.Course;
import HomeWork3LayerApp.Entities.Instructor;
import HomeWork3LayerApp.Logger.Logger;

import java.util.List;

public class InstructorManager {
    private Instructor instructor;
    private Logger[] loggers;


    public InstructorManager(HibernateInstructorDao instructor, List<Course> loggers) {
        this.instructor = instructor ;
        this.loggers = loggers;
    }
    public void add(Instructor instructor) {
        InstructorDao.add(instructor);

        for (Logger logger : loggers) {
            logger.log(instructor.getFirstName() + " " + instructor.getLastName());
        }
    }}
