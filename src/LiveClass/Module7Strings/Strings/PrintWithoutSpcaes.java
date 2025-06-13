package LiveClass.Module7Strings.Strings;

public class PrintWithoutSpcaes {

    public static void main(String[] args) {
        String str = "Hello World";

        char cha[] = str.toCharArray();

        int count =0;
        for(char ch: cha){
            if(ch == ' '){
                continue;
            }
            count++;
            System.out.println(ch);
        }
        System.out.println(count);


    }
}
