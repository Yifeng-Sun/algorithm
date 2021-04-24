package t_2;

import java.util.*;

public class list {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int howmanyarrays = sc.nextInt();
        ArrayList<String> arrayArrayList = new ArrayList<>();
        for(int i = 0; i < howmanyarrays; i++){
            String theithstring = sc.nextLine();
            arrayArrayList.add(theithstring);
        }
        int howmanyquestions = sc.nextInt();
        ArrayList<String> questionArrayList = new ArrayList<>();
        for(int i = 0; i < howmanyquestions; i++){
            String theithquestion = sc.nextLine();
            questionArrayList.add(theithquestion);
        }
        //kaishijieda
        for(int i = 0; i < howmanyquestions; i ++){
            String currentQuestion = questionArrayList.get(i);
            String[] questionelements = currentQuestion.split(" ");
            int howmanyarraystocombine = Integer.valueOf(questionelements[0]);
            String combinedString = "";
            for(int j = 0; j < howmanyarraystocombine; j++){
                combinedString = combinedString + questionArrayList.get( j + 1 ) + " ";
                System.out.println(combinedString);
            }
            String[] combinedStringElements = combinedString.split(" ");
            int whichtofind = Integer.valueOf(questionelements[0] + 1);
            ArrayList ints = new ArrayList();
            for(int k = 0; k < combinedStringElements.length; k ++){
                ints.add(Integer.valueOf(combinedStringElements[k]));

            }
            Collections.sort(ints);
            System.out.println(ints.get(whichtofind));


        }
    }
}
