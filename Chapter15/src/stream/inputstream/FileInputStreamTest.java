package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = null;
        int i=0;
        try {
            fis = new FileInputStream("input.txt"); //FileReader
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println(e);
            } catch(NullPointerException e){
                System.out.println(e);
            }
        }
        System.out.println("end");
    }
}