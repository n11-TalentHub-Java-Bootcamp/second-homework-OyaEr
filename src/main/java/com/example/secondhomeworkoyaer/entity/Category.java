package com.example.secondhomeworkoyaer.entity;

import javax.persistence.*;

//Derste yapılmış olan Kategori Entity'si.

@Entity
@Table(name = "KATEGORI")
public class Category {

    @SequenceGenerator(name = "generator", sequenceName = "KATEGORI_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ADI", nullable = false, length = 50)
    private String name;

    @Column(name = "KIRILIM")
    private Long kirilim;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UST_KATEGORI")
    private Category ustCategory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getKirilim() {
        return kirilim;
    }

    public void setKirilim(Long kirilim) {
        this.kirilim = kirilim;
    }

    public Category getUstCategory() {
        return ustCategory;
    }

    public void setUstCategory(Category ustCategory) {
        this.ustCategory = ustCategory;
    }


    @Override
    public String toString() {
        return "Kategori{" +
                "id=" + id +
                ", adi='" + name + '\'' +
                ", kirilim=" + kirilim +
                ", ustKategori=" + ustCategory +
                '}';
    }
}