package factory.user;

import domain.user.Seller;

public class SellerFactory
{
    public static Seller getSeller(String name, String surname,String studentNo)
    {
        return new Seller.Builder()
                         .getName(name)
                         .getSurname(surname)
                          .getStudentNo(studentNo)
                         .build();
    }
}
