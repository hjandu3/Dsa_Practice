import java.util.Arrays;

public class GreatestCommonDivisor {
    public String greatestCommonDivisor(String s1,String s2){

        // AbAb == abab
        // loop abab in larger string
        // if  check length%4==0
        // loop and check the smaller string
        // else decrease the length, check concatination
        // decrease length , check concatination

        Integer biggerStringLen = s1.length() > s2.length() ? s1.length() : s2.length();
        String biggerString = s1.length() > s2.length() ? s1 : s2;
        Integer smallerLen = s1.length() < s2.length() ? s1.length() : s2.length();
        String smaller = s1.length() < s2.length() ? s1 : s2;
        String s = input(biggerString, smaller);
        for(int i =smallerLen;i>0;i--) {
            if (s.equals("")) {
                s = input(biggerString, smaller.substring(0,i-1 ));
            }
        }
        return s;
    }

    public String input(String bigger, String smaller){
        String s= "";
        String result = "";
        for(int i = 0;i<smaller.length();i++){
            if(bigger.charAt(i)==smaller.charAt(i)){
                s = s.concat(String.valueOf(smaller.charAt(i)));
            }
        }
        if(s.length()!=0 && bigger.length() % s.length()==0){
            int repeatation = bigger.length()/s.length();
            for(int i=0;i<repeatation;i++) {
                result = result.concat(s);
            }
        }
        else{
            s = "";
        }
        if(bigger.contains(result)){
            return  s;
        }
        return  "";
    }
}
