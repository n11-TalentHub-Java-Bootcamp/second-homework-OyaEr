package com.example.secondhomeworkoyaer.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

//Derste yapılmış olan Ürün Entity'si.
@Entity
@Table(name = "URUN")
public class Product {

    @SequenceGenerator(name = "generator", sequenceName = "URUN_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(length = 50, name = "ADI")
    private String name;

    @Column(name = "FIYAT", precision = 19, scale = 2)
    private BigDecimal price;

    @Column(name = "KAYIT_TARIHI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_KATEGORI",
            foreignKey = @ForeignKey(name = "FK_URUN_KATEGORI_ID")
    )
    private Category category;


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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "id=" + id +
                ", adi='" + name + '\'' +
                ", fiyat=" + price +
                ", kayitTarihi=" + recordDate +
                ", kategori=" + category +
                '}';
    }
}
