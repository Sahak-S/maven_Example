package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lesson implements Serializable {
    private String lessonName;      // դասի անունը
    private double duration;        // դասընթացի տևողությունն է
    private String lecturerName;    //դասախոսի անունն է
    private int price;
}
