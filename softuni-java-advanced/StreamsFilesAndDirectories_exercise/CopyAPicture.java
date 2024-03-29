package StreamsFilesAndDirectories_exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public record CopyAPicture() {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024];

        try(FileInputStream fis = new FileInputStream("image.jpg");
            FileOutputStream fos= new FileOutputStream("copyImage.jpg") ) {

            while (fis.read(buffer) != -1){
                fos.write(buffer);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;

    }
}
