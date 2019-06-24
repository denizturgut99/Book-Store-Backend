package com.bookStore.bookStoreProj;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;
    private String bookName;
    private String bookDetail;
    private String bookPortrait;
    private String bookDescription;
    private String bookLang;

    public Books() {}

    public Books(String name, String detail, String portrait, String desc, String lang) {
        this.bookName = name;
        this.bookDetail = detail;
        this.bookPortrait = portrait;
        this.bookDescription = desc;
        this.bookLang = lang;
    }

    public String getName() {
        return this.bookName;
    }

    public String getDetail() {
        return this.bookDetail;
    }

    public String getPortrait() {
        return this.bookPortrait;
    }

    public String getDescription() {
        return this.bookDescription;
    }

    public String getLang() {
        return this.bookLang;
    }

    public Long getId() {
        return this.id;
    }
}
