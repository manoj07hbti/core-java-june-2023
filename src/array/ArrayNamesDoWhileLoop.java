package array;

public class ArrayNamesDoWhileLoop {
    public static void main(String[] args) {
        String ArrayNames[]= {"Vandana","Ojal","Mukul","Jatin","Mohit"};
        int Names=0;
        do {
            System.out.println("Names Inside The Do While Loop :"+ArrayNames[Names]);
            Names++;
        }while (Names<ArrayNames.length);
    }
}
