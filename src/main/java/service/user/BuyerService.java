package service.user;

import domain.user.Buyer;
import org.apache.catalina.LifecycleState;
import service.IService;

import java.util.List;
import java.util.Set;

public interface BuyerService extends IService<Buyer,String>
{
    List<Buyer> getAll();
}
