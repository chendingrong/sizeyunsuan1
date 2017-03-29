package com.company;
import java.math.*;
import java.util.*;
public class Main {
        public static String yuefen(int a,int b){
            int y = 1;
            for(int i=a;i>=1;i--){
                if(a%i==0&&b%i==0){
                    y = i;
                    break;
                }
            }
            int z = a/y;
            int m = b/y;
            if(z==0) {
                return "0";
            }
            return ""+z+"/"+m;
        }

        public static void main(String[] args) {
            int k=0,result=0;
            int Z=0,M=0;
            String d = null;

            for(int i = 0; i < 5;i++) {
                int a=1+(int)(Math.random()*10);
                int b=1+(int)(Math.random()*10);
                int f=1+(int)(Math.random()*4);
                if(f==1) {
                    result = a + b;
                    System.out.print(a + "+" + b + "=");
                }
                else if(f==2){
                    result=a-b;
                    System.out.print(a+"-"+b+"=");
                }

                else if(f==3) {
                    result = a * b;
                    System.out.print(a + "*" + b + "=");
                }
                else{
                    result=a/b;
                    System.out.print(a+"/"+b+"=");
                }

                Scanner input=new Scanner(System.in);
                int answer=input.nextInt();

                if (answer == result)
                    k++;
            }

            for(int j=0;j<5;j++) {
                int m1 = 1 + (int) (Math.random() * 10);
                int x1 = 1 + (int) (Math.random() * m1);
                int m2 = 1 + (int) (Math.random() * 10);
                int x2 = 1 + (int) (Math.random() * m2);
                int c = (int) (Math.random() * 4);
                if (c == 0) {
                    Z = x1 * m2 + x2 * m1;
                    M = m1 * m2;
                    d = yuefen(Z, M);
                    System.out.print(x1 + "/" + m1 + "+" + x2 + "/" + m2 + "=");
                }
                else if (c == 1) {
                    Z = x1 * m2 - x2 * m1;
                    M = m1 * m2;
                    d = yuefen(Z, M);
                    System.out.print(x1 + "/" + m1 + "-" + x2 + "/" + m2 + "=");
                }
                else if (c == 2) {
                    Z = x1 * x2;
                    M = m1 * m2;
                    d = yuefen(Z, M);
                    System.out.print(x1 + "/" + m1 + " * " + x2 + "/" + m2 + "=");
                }
                else {
                    Z = m1 * x2;
                    M = m2 * x1;
                    d = yuefen(Z, M);
                    System.out.print(x1 + "/" + m1 + " / " + x2 + "/" + m2 + "=");
                }
                Scanner input=new Scanner(System.in);
                String answer1=input.next();

                if (answer1.equals(d))
                    k++;
            }

            System.out.println("共答对"+k+"题");
            System.out.println("共答错"+(10-k)+"题");
            System.out.println("正确率为"+k/10.0);
        }
}

