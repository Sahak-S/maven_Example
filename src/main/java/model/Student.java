package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    private String name;
    private String surname;
    private int age;
    private Date dateOfBirth;
    private String email;
    private String phone;
    private List<Lesson> lessons;
}
