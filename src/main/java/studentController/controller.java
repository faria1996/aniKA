package studentController;
import data.model.Student;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "studentController")

public class controller {
    private Student student= new Student();

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String isNextPage(){
        return "succes";
    }
}

