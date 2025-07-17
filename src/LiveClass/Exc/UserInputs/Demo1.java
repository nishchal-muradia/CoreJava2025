package LiveClass.Exc.UserInputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws IOException {

        //int a = System.in.read();
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        String str = br.readLine();
        System.out.println(str);

        int a = Integer.parseInt(br.readLine());
        System.out.println(a);
    }
}
