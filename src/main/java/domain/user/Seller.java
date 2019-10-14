package domain.user;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Seller
{
    @Column(name="name",columnDefinition = "VARCHAR(35)",nullable = false)
    private String name;
    @Column(name="surname",columnDefinition = "VARCHAR(35)",nullable = false)
    private String surname;
    @Id
    @Column(name="studentNo",columnDefinition = "",nullable = false)
    private String studentNo;


    public Seller(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.studentNo = builder.studentNo;
    }

    public String getName() {
        return name;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public String getSurname() {
        return surname;
    }

    public static class Builder {
        private String name;
        private String surname;
        private String studentNo;

        public Builder getName(String name) {
            this.name = name;
            return this;
        }

        public Builder getSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder getStudentNo(String studentNo) {
            this.studentNo = studentNo;
            return this;
        }


        public Seller build() {
            return new Seller(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seller)) return false;
        Seller seller = (Seller) o;
        return studentNo.equals(seller.studentNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNo);
    }

    @Override
    public String toString() {
        return "Seller{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", studentNo='" + studentNo + '\'' + '}';
    }
}
