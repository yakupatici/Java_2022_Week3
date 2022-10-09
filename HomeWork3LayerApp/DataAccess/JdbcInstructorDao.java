package HomeWork3LayerApp.DataAccess;

import HomeWork3LayerApp.Entities.Instructor;

public class JdbcInstructorDao implements  InstructorDao{
    @Override
    public void add(Instructor instructor) {

        System.out.println("Instructor is added by  using Jdbc " + instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getId());
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Instructor is updated by  using Jdbc " + instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getId());

    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Instructor is deleted by  using Jdbc " + instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getId() );

    }
}
