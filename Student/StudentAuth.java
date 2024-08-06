package Student;

import DTO.StudentDTO;

public interface StudentAuth {
    void register(StudentDTO st);

    void login();

    void logout();
}
