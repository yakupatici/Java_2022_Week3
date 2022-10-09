package HomeWork3LayerApp.DataAccess;

import HomeWork3LayerApp.Entities.Instructor;

public interface InstructorDao {

    static void add(Instructor instructor);

    void update(Instructor instructor);

    void delete(Instructor instructor);
}
