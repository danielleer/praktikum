package de.hfu;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.toUpperCase();
		System.out.println(s);
		
    }
}
