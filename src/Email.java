package com.test.emailvalidation;

public class Email
{
    static Boolean Validate(String Addr)
    {
        Boolean HasUsername = false;
        Boolean HasAt = false;
        Boolean HasDomain = false;
        Boolean HasDot = false;

        String[] AddrParts = Addr.split("[@]");

        HasUsername = (AddrParts[0].length() > 0);
        HasAt = (AddrParts.length==2);
        if (AddrParts.length!=2)
            return false;

        String Domain = AddrParts[1];
        String[] DomainParts = Domain.split("[.]");
        if (DomainParts.length == 2)
        {
            HasDot = true;
            HasDomain = (DomainParts[0].length() > 0 && DomainParts[1].length() > 0);
        }

        return (HasUsername && HasAt && HasDomain && HasDot);
    }
}