package org.launchcode.java.studios;

import java.util.Scanner;
public class Area
{
    public static void main(String[] args)
    {
        float r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of cirlce:");
        r = s.nextFloat();

        while( r < 0)
        {
            System.out.print("Please enter a positive number:");
            r = s.nextFloat();
        }


        if( r >= 0)
        { area = pi * r * r;
         System.out.println("The area of a circle of radius: "+r+" is: "+area); }
    }
}


