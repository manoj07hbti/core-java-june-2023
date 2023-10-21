package method;

public class CalcInput {
    public void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition is:" + result);
    }


        public static void main (String args[]){
            CalcInput obj = new CalcInput();
            obj.add(5, 4);

        }
    }

