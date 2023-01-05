package com.codewallah.StudentTeacher;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class TeacherController {

    HashMap<Integer,Teacher> teacherDb= new HashMap<>();

    //adding teachers
    @PostMapping("/add_teacher")
    public String addTeacher(@RequestBody() Teacher teacher)
    {
        int idOfTeacher= teacher.id;
        teacherDb.put(idOfTeacher,teacher);
        return "Teacher is added successfully!";
    }

    //get teacher by id
    @GetMapping("get_teacher_by_id")
    public Teacher getStudentById(@RequestParam("id")Integer teachid)
    {
        return teacherDb.get(teachid);
    }

    //get teacher by name
    @GetMapping("get_teacher_by_name")
    public Teacher getTeacherByName(@RequestParam("name")String teachname)
    {
        for(Teacher t: teacherDb.values())
        {
            if(t.name.equals(teachname))
                return t;
        }
        return null;
    }
}
