package controllers;

import Groups.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.Service;
import students.Student;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Service service;

    @PostMapping("/student/{group_id}")
    public void addStudent(@RequestBody Student student, @PathVariable(name = "group_id") int group_id) {
        service.addStudent(student, group_id);
    }

    @GetMapping("/student")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @PostMapping("/group")
    public void addGroup(@RequestBody Group group) {
        service.addGroup(group);
    }

    @GetMapping("/group")
    public List<Group> getAllGroups() {
        return service.getAllGroups();
    }

}

