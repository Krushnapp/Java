import java.util.ArrayList;
import java.util.List;

public class FlattenArrayList {


    public static void main(String[] args) {

        String s="aasdsdfsdas dfgfgs dfghasd";

        Map<Character,Integer> cm = new HashMap<>();

        Map<Character,Integer> strc = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char t = s.charAt(i);
            if(strc.containsKey(t)){
             int f=   strc.get(t);
                strc.put(t,f+1);
            }else{
                 strc.put(t,1);
}


        }

    System.out.println(strc);






        }




}
