package arrays_demo_class;

public class ArraysNewClass {
    public static void main(String[]args) {

        String[] Name = {"uday","chandan","santosh","mahesh","suresh"};

        for (int i = 0; i < 5; i++) {

            System.out.println("print deta for loops:" + Name[i]);
        }
            int[] marks = {20,30,49,60,70,};

           int i = 0;
            do {
                System.out.println("print :" + i + " :" + marks[i]);
                i++;
            } while (i < 5);

            int A=0;

            while (A<5){

                System.out.println("print marks: "+marks [A]);

                A++;
            }
for (int var:marks){

    System.out.println("print marks: "+var);
        }

        int[] number ={54,23,76,87,56,34,76,88};

int j=0;

while (j<8){

    System.out.println("print number:"+ number[j]);
    j++;
}
int l=0;

do {

    System.out.println("print number:"+ number[l]);
    l++;
} while (l>8);

        }
    }


