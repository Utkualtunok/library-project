package com.libraryproject.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id", columnDefinition = "serial")
    private int id;

    @Column(name = "author_name", nullable = false)
    private String authorName;

    @Temporal(TemporalType.DATE)
    @Column(name="author_birthday",nullable = false)
    LocalDate authorBirthday;

    @Column(name="author_country", nullable = false)
    private String country;

    @OneToMany(mappedBy = "author",cascade = CascadeType.REMOVE)
    private List<Book> bookList;

    public Author() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getAuthorBirthday() {
        return authorBirthday;
    }

    public void setAuthorBirthday(LocalDate authorBirthday) {
        this.authorBirthday = authorBirthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Author{" +
                "country='" + country + '\'' +
                ", authorBirthday=" + authorBirthday +
                ", authorName='" + authorName + '\'' +
                ", id=" + id +
                '}';
    }
}
