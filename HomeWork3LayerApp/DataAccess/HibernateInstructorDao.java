package HomeWork3LayerApp.DataAccess;

import HomeWork3LayerApp.Entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor is added by  using hibernate " + instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getId());
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Instructor is updated by  using hibernate " + instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getId());

    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Instructor is deleted by  using hibernate " + instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getId());

    }
}
