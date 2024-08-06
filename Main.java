import Admin.Admin;
import DTO.StudentDTO;
import Student.StudentAuthImpl;
import java.util.Scanner;

class Application{
    Application(){}
    public void studentMenu()
    {
        System.out.println("Student Menu");
        System.out.println("1.Register");
        System.out.println("2.Login");
        System.out.println("3. Exit");
    }
    public void adminMenu()
    {
        System.out.println("Admin Menu");
        System.out.println("1.Login");
        System.out.println("2.Exit");
    }
    public void adminOptions()
    {
        System.out.println("1.Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3.Search Student");
        System.out.println("4.Update Student");
        System.out.println("5.Exit");
    }
}

public class Main {
    public static void main(String[] args) {
        Application ap =new Application();
        StudentAuthImpl mt = new StudentAuthImpl();
        ap.studentMenu();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice==3){
                System.out.println("Program Finished");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter your name");
                    String name = sc.nextLine();
                    System.out.println("Enter roll no");
                    String roll= sc.nextLine();
                    System.out.println("Enter Your Email");
                    String email = sc.nextLine();
                    System.out.println("Enter your Password");
                    String password = sc.nextLine();
                    System.out.println("Registration Sucessful");
                    StudentDTO st = new StudentDTO(name, roll, email, password);
                    mt.register(st);
                    break;
                case 2:
                    System.out.println("Enter Email id");
                    String Lemail = sc.nextLine();
                    System.out.println("Enter Your Password");
                    String pass = sc.nextLine();
                    break;
                default:
                    System.out.println("Invalid choice...");
            }
        }
        StudentDTO s1 = new StudentDTO("name1","Rn101","A@gmail.com","123");
        StudentDTO s2 = new StudentDTO("name2","Rn102","b@gmail.com","1234");
        StudentDTO s3 = new StudentDTO("name3","Rn103","c@gmail.com","1235");
        StudentDTO s4 = new StudentDTO("name4","Rn104","d@gmail.com","1236");
        Admin adminService = new Admin();
//        adminService.registerStudent(s1);
//        adminService.search();
    }
}