import java.util.ArrayList;
import java.util.List;

public class FlattenArrayList {


    public static void main(String[] args) {

        String s="aasdsdfsdasdfgfgsdfghasd";

        Map<Character,Integer> cm = new HashMap<>();

        

        cm.put('a',2);
        cm.put('b',3);
        cm.put('k',9);
         cm.put('k',7);
         cm.put('a',9);

        if(cm.containsKey('a')){
            System.out.println("ha");
        }

System.out.println(cm.get('a'));
        System.out.println(cm.size());





        }




}
