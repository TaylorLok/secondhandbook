package com.secondhandbook.org.secondhandbook.util;

import java.util.UUID;

public class Misc
{
    public static String generateId()
    {
        return UUID.randomUUID().toString();
    }
}
