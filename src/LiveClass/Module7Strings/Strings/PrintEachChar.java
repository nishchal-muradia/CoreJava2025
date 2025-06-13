package LiveClass.Module7Strings.Strings;

public class PrintEachChar {
    public static void main(String[] args) {
        String str = "java";

        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }


        char[] arr = str.toCharArray();
        for(char ch : arr){
            System.out.println(ch);
        }
    }
}
