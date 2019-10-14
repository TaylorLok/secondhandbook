package domain.book;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Author
{
    @Column(name = "name",columnDefinition = "VARCHAR(35)",nullable = false)
    private String name;
    @Column(name = "bio",columnDefinition = "VARCHAR(100)",nullable = false)
    private String bio;
    @Id
    @Column(name = "authorRegNum",columnDefinition = "VARCHAR(35)",nullable = false)
    private String authorRegNum;

    private Author()
    {

    }

    public Author(Builder builder)
    {
        this.name = builder.name;
        this.bio = builder.bio;
        this.authorRegNum =builder.authorRegNum;

    }

    public String getName()
    {
        return name;
    }

    public String getBio()
    {
        return bio;
    }

    public String getAuthorRegNum() {
        return authorRegNum;
    }


    public static class Builder {
        private String name;
        private String bio;
        private String authorRegNum;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder bio(String bio) {
            this.bio = bio;
            return this;
        }

        public Builder authorRegNum(String authorRegNum) {
            this.authorRegNum = authorRegNum;
            return this;
        }


        public Author build() {

            return new Author(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return authorRegNum.equals(author.authorRegNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorRegNum);
    }

    @Override
    public String toString() {
        return "Author{" + "name='" + name + '\'' + ", bio='" + bio + '\'' + ", authorRegNum='" + authorRegNum + '\'' + '}';
    }
}
