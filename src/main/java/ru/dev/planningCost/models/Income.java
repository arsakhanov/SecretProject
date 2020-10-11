package ru.dev.planningCost.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "income_tbl")
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int summa;
    private String commit;
    @Column(name = "income_dt")
    private Date incomeDt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "catogory_id")
    private Category category;

    public Income(){}

    public Income(int summa, String commit, Date incomeDt) {
        this.summa = summa;
        this.commit = commit;
        this.incomeDt = incomeDt;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public Date getIncomeDt() {
        return incomeDt;
    }

    public void setIncomeDt(Date incomeDt) {
        this.incomeDt = incomeDt;
    }
}
