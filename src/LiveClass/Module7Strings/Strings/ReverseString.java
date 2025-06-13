package LiveClass.Module7Strings.Strings;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello";
       // System.out.println(reverseString(str));

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);


    }

    private static String reverseString(String str) {
        String result= "";
        char ch[] = str.toCharArray();
        for(int i=ch.length-1; i>=0; i--){
            result = result+ ch[i];
        }

        return  result;


    }
}
