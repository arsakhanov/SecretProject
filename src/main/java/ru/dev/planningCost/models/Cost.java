package ru.dev.planningCost.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cost_tbl")
public class Cost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int summa;
    private String commit;
    @Column(name = "cost_dt")
    private Date costDt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "catogory_id")
    private Category category;

    public Cost() {
    }

    public Cost(int summa, String commit, Date costDt) {
        this.summa = summa;
        this.commit = commit;
        this.costDt = costDt;
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

    public Date getCostDt() {
        return costDt;
    }

    public void setCostDt(Date costDt) {
        this.costDt = costDt;
    }
}
