package com.example.secondhomeworkoyaer.entity;

import javax.persistence.*;
import java.util.Date;


//UrunYorum için oluşturulmuş entity.
@Entity
@Table(name = "URUN_YORUM")
public class ProductComment {

    @SequenceGenerator(name = "generator", sequenceName = "URUN_YORUM_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "YORUM", nullable = false, length = 500)
    private String comment;

    @Temporal(TemporalType.DATE)
    @Column(name = "YORUM_TARIHI", nullable = false, length = 500)
    private Date commentDate;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            optional = false
    )
    @JoinColumn(name = "URUN_ID", foreignKey = @ForeignKey(name = "FK_URUN_URUN_YORUM_ID"))
    private Product productId;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            optional = false
    )
    @JoinColumn(name = "KULLANICI_ID", foreignKey = @ForeignKey(name = "FK_KULLANICI_URUN_YORUM_ID"))
    private User userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }


    @Override
    public String toString() {
        return "UrunYorum{" +
                "id=" + id +
                ", yorum='" + comment + '\'' +
                ", yorumTarihi=" + commentDate +
                '}';
    }


}
