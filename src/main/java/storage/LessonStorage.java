package storage;

import model.Lesson;
import util.FileUtil;

import java.util.ArrayList;
import java.util.List;

public class LessonStorage {

    private List<Lesson> lessons = new ArrayList<>();

    public void add(Lesson lesson) {
        lessons.add(lesson);
        FileUtil.serializeLesson(lessons);
    }

    public void print() {
        for (Lesson lesson : lessons) {
            System.out.println(lesson);
        }
    }

    public Lesson getaByLessonName(String lessonName) {
        for (Lesson lesson : lessons) {
            if (lesson.getLessonName().equals(lessonName)) {
                return lesson;
            } else {
                System.out.println("There is no such lesson");
                System.out.println("նման դաս չկա");
            }
        }
        return null;
    }

    public void deleteLesson(String lessonName) {
        lessons.removeIf(lesson -> lesson.getLessonName().equals(lessonName));
        FileUtil.serializeLesson(lessons);
    }

    public void initData() {
        this.lessons = FileUtil.deserializeLesson();
    }

}
