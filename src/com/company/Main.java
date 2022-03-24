package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int i,j;
       /* System.out.println("Enter Country Code");
	Scanner scanner = new Scanner(System.in);
   int countryCode =scanner.nextInt();
    switch(countryCode)
    {
        case 91:
            System.out.println("INDIA");
            break;
        case 01:
            System.out.println("CANADA & USA");
            break;
        case 62:
            System.out.println("Malaysia");
        default:
            System.out.println("invaild code");

    }*/
        for(i=0;i<=10;i++)
        {
            System.out.println("hello every body");


        }
        for(i=0,j=0;i<9 &&j<4;i++,j++ )
        {
            System.out.println("i is "+i+" j is " +j);
        }
        for(i=0;i<=5;i++)
        {
            for(j=0;j<=4;j++)
            {
                System.out.println("Inner loop");
                for(int k=0;k<=2;k++)
                    System.out.println("Inner Inner");
            }

        }
        int count=0;
        boolean runLoop=true;
        while(count<5&&runLoop)
        {
            System.out.println("count is "+count);
            count ++;
        }
        int x=1,sum=0;
        do{

            sum=sum+x;
            System.out.println("Sum is "+sum);
            x++;
        }while(x<=100);
        System.out.println("Sum is "+sum);
    }
}

