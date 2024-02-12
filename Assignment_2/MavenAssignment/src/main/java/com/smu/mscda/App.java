package com.smu.mscda;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print("This program will capitalize the input string and Generate MD5 hex\n ");
        System.out.print("Enter the input string: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.print("\nCapitalized string is:  " + Capitalize(input));
        System.out.print("\nMD5 hex is: " + GenerateMD5hex(input));
    }
    public static String Capitalize(String input){
        String capitalizedString = StringUtils.capitalize(input);
        return capitalizedString;
    }
    public static String GenerateMD5hex(String input){
        String md5Hex = DigestUtils.md5Hex(input);
        return md5Hex;
    }
}

