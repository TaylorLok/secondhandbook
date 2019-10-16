package factory;

import domain.ResponseObject;

public class ResponseObjectFactory
{
    public static ResponseObject buildGenericResponseObject(String responseCode, String responseDescription)
    {
        return new ResponseObject(responseCode,responseDescription);
    }
}
