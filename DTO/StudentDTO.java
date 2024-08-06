package DTO;

public class StudentDTO {
    String name;
    String rollnumber;
    public String email;
    private String password;
    public StudentDTO(String name, String rollnumber, String email, String password){
        this.name = name;
        this.rollnumber =rollnumber;
        this.email= email;
        this.password= password;
    }

    public String getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

