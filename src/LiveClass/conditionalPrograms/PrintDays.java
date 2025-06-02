package LiveClass.conditionalPrograms;

public class PrintDays {

    public static void main(String[] args) {
        int day = 444;

        String dayName;

        switch (day){
            case 1: dayName="M"; break;
            case 2: dayName="Tu"; break;
            case 3: dayName="WED"; break;
            case 4: dayName="TH"; break;
            case 5: dayName="FR"; break;
            case 6: dayName="SA"; break;
            case 7: dayName="SUN"; break;
            default:dayName="Invalid DAY";
        }
        //System.out.println(dayName);



        char ch ='a';
        switch (ch){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' : System.out.println("vowel"); break;
            default:
                System.out.println("Consonant");

        }

        int month=2;
        int year= 2024;




    }


}
