package LiveClass.Module7Strings.StringBuilderAndBuffers;

public class ConcatNumbers {

    public static void main(String[] args) {
        String sb = "";

        for(int i=1; i<=100; i++){
            sb= sb+i;
        }
        System.out.println(sb);
    }
}
