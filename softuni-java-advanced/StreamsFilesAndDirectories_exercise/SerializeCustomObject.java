package StreamsFilesAndDirectories_exercise;

import java.io.*;

public class SerializeCustomObject {
    public static void main(String[] args) {
        Course course = new Course();
        course.name = "Java Advanced";
        course.numberOfStudents = 250;

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("course.ser"));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("course.ser"))) {

            oos.writeObject(course);
            Course courseFromFile = (Course) ois.readObject();
            System.out.println(courseFromFile.name);
            System.out.println(courseFromFile.numberOfStudents);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        ;
    }
}
