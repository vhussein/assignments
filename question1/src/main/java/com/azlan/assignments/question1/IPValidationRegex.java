package com.azlan.assignments.question1;

/**
 * Created by Azlan on 10/7/2017.
 */
public class IPValidationRegex {

    public static void main (String[] args)
    {

        IPAddressValidator ipValidate = new IPAddressValidator();

        String ipAdd = "10.5.6.";

        if(ipValidate.validate(ipAdd))
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }

    }

    /*
    *   1. Read the text file
    *   2. Filter out invalid IP's
     */

    private void readFile()
    {

    }

}
