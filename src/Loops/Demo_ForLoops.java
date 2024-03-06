package Loops;

public class Demo_ForLoops {
    // loop is used to do repeat work. (लूप का प्रयोग कार्य को दोहराने के लिए किया जाता है)
    // We give start point to end point in loops and check in between.(हम लूप में आरंभ बिंदु से अंतिम बिंदु देते हैं/और बीच-बीच में जाँच करें है)
    // we use + operator in this.( As -> j ++ => j = 1+1) ,(j -- => j = 1-1),

    public static void main(String[] args) {

        for (int i = 1; i<=15;i++){
            System.out.println("This is my First java class "+i);//Increment..
        }

        for (int j = 20;j>0;j--){
            System.out.println("This is Decrement for  loops "+j);// Decrement..
        }


    }
}

