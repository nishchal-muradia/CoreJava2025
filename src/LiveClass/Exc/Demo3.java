package LiveClass.Exc;

import java.io.IOException;

public class Demo3 {

    public static void doSomething() throws IOException
    {
        throw new IOException("Something went wrong");
    }

    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            System.out.println("Caught it. You are out");
        }
    }
}
