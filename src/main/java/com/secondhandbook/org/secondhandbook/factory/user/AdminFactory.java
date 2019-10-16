package com.secondhandbook.org.secondhandbook.factory.user;

import com.secondhandbook.org.secondhandbook.domain.user.Admin;

public class AdminFactory
{
    public static Admin getAdmin(String name, String surname, String Id)
    {
        return new Admin.Builder()
                .name(name)
                .surname(surname)
                .Id(Id)
                .build();


    }

}
