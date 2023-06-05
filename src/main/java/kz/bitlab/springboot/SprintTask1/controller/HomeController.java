package kz.bitlab.springboot.SprintTask1.controller;

import kz.bitlab.springboot.SprintTask1.db.DBManager;
import kz.bitlab.springboot.SprintTask1.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String indexPage(Model model){
        List<Student> students = DBManager.getStudents();
        model.addAttribute("students",students);
        return "index";
    }

    @GetMapping(value="/add-student")
    public String addStudent(Model model){
        return "addstudent";
    }

    @PostMapping(value = "/add-student")
    public String addStudent(Student student){
        DBManager.addStudent(student);
        return "redirect:/";
    }
}
