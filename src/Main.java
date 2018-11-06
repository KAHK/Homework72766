package com.test.emailvalidation;

public class Main
{
    public static void main(String[] args)
    {
        Boolean Result = com.test.emailvalidation.Email.Validate("anything@anything.anything");
        //validating email address written in (Addr: " ")
        String Answer;
        if (Result)
            Answer = "Address: Correct";

        else
        Answer = "Address: Incorrect";
        System.out.println(Answer);
    }
}