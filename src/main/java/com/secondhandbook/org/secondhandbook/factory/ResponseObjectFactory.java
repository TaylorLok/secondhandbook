package com.secondhandbook.org.secondhandbook.factory;

import com.secondhandbook.org.secondhandbook.domain.ResponseObject;

public class ResponseObjectFactory
{
    public static ResponseObject buildGenericResponseObject(String responseCode, String responseDescription)
    {
        return new ResponseObject(responseCode,responseDescription);
    }
}
