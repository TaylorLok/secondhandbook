package factory.user;

import domain.user.Buyer;

public class BuyerFactory
{
    public static Buyer getBuyer(String name ,String surname,String studentNo)
    {
        return new Buyer.Builder()
                        .getName(name)
                        .getSurname(surname)
                        .getStudentNo(studentNo)
                        .build();
    }
}
