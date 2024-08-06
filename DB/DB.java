package DB;
import DTO.StudentDTO;


import java.util.ArrayList;


public class DB {
    ArrayList<StudentDTO> db;

    public DB(){
        this.db = new ArrayList<StudentDTO>();
    }

    public void saveData(StudentDTO student){
        this.db.add(student);
    }

    public ArrayList<StudentDTO> getAllStudents(){
        return this.db;
    }

    public StudentDTO getStudentData(String email){
        for (int i = 0; i < this.db.size(); i++) {
            StudentDTO temp = this.db.get(i);
            if (temp.email.equals(email)){
                return temp;
            }
        }
        return null;
    }

    public boolean updateStudent(String email,StudentDTO deatils){
        StudentDTO oldStudent = this.getStudentData(email);
        if (oldStudent != null){
            oldStudent.setName(deatils.getName());
            oldStudent.setPassword(deatils.getPassword());
            oldStudent.setRollnumber(deatils.getRollnumber());
            this.saveData(oldStudent);
            return true;
        } else {
            return false;
        }
    }

    public void removeStudent(String email){
//        this.db.remove();
    }
}

