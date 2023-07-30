package array;

public class ArrayNamesWhileLoop {
    public static void main(String[] args) {
        String ArrayNames[]= {"Vandana","Ojal","Mukul","Jatin","Mohit"};
        int Names=0;
        while (Names<ArrayNames.length){
            System.out.println("Names Inside the While Loop :"+ArrayNames[Names]);
            Names++;
        }
    }
}
