package service.user;

import domain.user.Seller;
import service.IService;

import java.util.List;

public interface SellerService extends IService<Seller,String>
{
    List<Seller>getAll();
}
