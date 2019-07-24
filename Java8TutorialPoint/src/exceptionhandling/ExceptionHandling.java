package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public class ExceptionHandling {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            testException(-10);
           // testException(-5);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("Releasing resources");
        }
        testException(15);

    }

    public static void testException(int i) throws FileNotFoundException,IOException{
        if (i<0){
            FileNotFoundException myException = new FileNotFoundException("Negative Integer" + i);
            throw myException;
        }else if (i > 10){
            throw new IOException("Only supported for index 0 to 10");
        }


    }
}


