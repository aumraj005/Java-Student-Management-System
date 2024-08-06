package Admin;

import DB.DB;
import DTO.StudentDTO;

import java.util.ArrayList;

public class Admin {
    DB dataBase;

    public Admin() {
        this.dataBase = new DB();
    }

    public boolean registerStudent(StudentDTO studnet) {
        ArrayList<StudentDTO> arr = this.dataBase.getAllStudents();
        for (StudentDTO obj : arr) {
            if (studnet.email.equals(obj.email)) {
                return false;
            }
        }
        this.dataBase.saveData(studnet);
        return true;
    }

    public void search(String email) {
        StudentDTO student = this.dataBase.getStudentData(email);
        if (student == null) {
            System.out.println("Data not Found");
        } else {
            System.out.println("Data Found");
        }
    }

    public void getAllStudents() {
        ArrayList<StudentDTO> arr = this.dataBase.getAllStudents();
    }

    public void updateStudnet(String email, StudentDTO newDeatils) {
    }

    public void removeStudent(String email) {}
}
