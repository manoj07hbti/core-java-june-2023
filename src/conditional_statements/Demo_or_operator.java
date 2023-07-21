package conditional_statements;

import sun.nio.cs.ext.IBM037;

public class Demo_or_operator {
    public static void main(String[] args) {
        String company="ibm";
        int ram=128;

        if(company=="ibm" || ram>=8) {
            System.out.println("laptop is good configuration");
        }else{
            System.out.println("laptop is average configuration");
        }
        ram=4;
        if(company=="ibm" || ram>=8) {
            System.out.println("laptop is good configuration");
        }else{
            System.out.println("laptop is average configuration");
        }
        company="hcl";
        ram=256;
        if(company=="ibm" || ram>=8) {
            System.out.println("laptop is good configuration");
        }else{
            System.out.println("laptop is average configuration");
        }
        company="hcl";
        ram=8;
        if(company=="ibm" || ram>=8) {
            System.out.println("laptop is good configuration");
        }else{
            System.out.println("laptop is average configuration");
        }


        }
    }

