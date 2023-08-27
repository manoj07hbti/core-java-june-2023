package methods;

public class Demo_Methods {

        public void findEvenOdd () {
            int number = 20;
            if (number % 4 == 0) {
                System.out.println("Even number found" + number);

            } else {
                System.out.println("odd number found" + number);
            }
        }
            public static void main(String[] args) {

            Demo_Methods obj = new Demo_Methods();
            obj.findEvenOdd();


    }
}