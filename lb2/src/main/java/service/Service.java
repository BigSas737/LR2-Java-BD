package service;


import Groups.Group;
import com.example.lb2.GroupRepository;
import com.example.lb2.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import students.Student;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private StudentRepository studentRepo;

    @Autowired
    private GroupRepository groupRepo;

    public void addStudent(Student student, int id) {
        Group g = groupRepo.getOne(id);
        student.setGroup(g);
        studentRepo.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public void addGroup(Group group) {
        groupRepo.saveAndFlush(group);
    }

    public List<Group> getAllGroups() {
        return groupRepo.findAll();
    }
}


