package com.codewallah.StudentTeacher;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class StudentController {
    HashMap<Integer,Student> studentDb= new HashMap<>();

    //adding students
    @PostMapping("/add_student")
    public String addStudent(@RequestBody() Student student)
    {
        int idOfStudent= student.stid;
        studentDb.put(idOfStudent,student);
        return "Student is added successfully!";
    }

    //get student by id
    @GetMapping("get_student_by_id")
    public Student getStudentById(@RequestParam("stdid")Integer id)
    {
        return studentDb.get(id);
    }

    //get student by name
    @GetMapping("get_student_by_name")
    public Student getStudentByName(@RequestParam("name")String stname)
    {
        for(Student s: studentDb.values())
        {
            if(s.name.equals(stname))
                return s;
        }
        return null;
    }

    //getting all students
    @GetMapping("get_all_students")
    public List<String> getAllStudents()
    {
        List<String> listOfStudents= new ArrayList<>();
        for(Student s: studentDb.values())
        {
            listOfStudents.add(s.toString());
        }
        return listOfStudents;
    }

}
