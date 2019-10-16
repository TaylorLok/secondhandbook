package controller.user;

import domain.ResponseObject;
import domain.user.Seller;
import factory.ResponseObjectFactory;
import factory.user.SellerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.user.SellerServiceImpl;

@RestController
@RequestMapping("/secondhandbook/seller")
public class SellerController
{
    @Autowired
    SellerServiceImpl sellerService;

    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createSeller(@RequestBody Seller seller)
    {
        System.out.println(seller);
        ResponseObject responseObject = ResponseObjectFactory.buildGenericResponseObject(HttpStatus.OK.toString(),"New seller!");
        if(seller.getName()==null|| seller.getSurname()==null || seller.getStudentNo()==null)
        {
            responseObject.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObject.setResponseDescription("Please Enter credentials");
        }else
        {
            Seller savedSeller = seller;
            responseObject.setResponse(savedSeller);

            if(seller!= null)
            {
                sellerService.create(seller);
                sellerService.update(savedSeller);
                sellerService.read(savedSeller);
                sellerService.delete(savedSeller);
                sellerService.getAll();
            }
              else {
                responseObject.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
                String message = seller == null ? "buyer not found|" : "";
                responseObject.setResponseDescription(message);
            }
    }
        return ResponseEntity.ok(responseObject);
    }
}
