package com.secondhandbook.org.secondhandbook.domain.user;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Buyer {

    @Column(name="name",columnDefinition = "VARCHAR(35)",nullable = false)
    private String name;
    @Column(name="surname",columnDefinition = "VARCHAR(35)",nullable = false)
    private String surname;
    @Id
    @Column(name="studentNo",columnDefinition = "",nullable = false)
    private String studentNo;

    private Buyer() {

    }

    public Buyer(Builder builder) {
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


        public Buyer build() {
            return new Buyer(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Buyer)) return false;
        Buyer buyer = (Buyer) o;
        return studentNo.equals(buyer.studentNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNo);
    }

    @Override
    public String toString() {
        return "Buyer{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", studentNo='" + studentNo + '\'' + '}';
    }
}
