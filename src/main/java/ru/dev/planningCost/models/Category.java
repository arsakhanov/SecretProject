package ru.dev.planningCost.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category_tbl")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "category_type")
    private boolean categoryType;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cost> costList;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Income> incomeList;

    public Category() {
    }

    public Category(String categoryName, boolean categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public List<Income> getIncomeList() {
        return incomeList;
    }

    public void setIncomeList(List<Income> incomeList) {
        this.incomeList = incomeList;
    }

    public List<Cost> getCostList() {
        return costList;
    }

    public void setCostList(List<Cost> costList) {
        this.costList = costList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public boolean isCategoryType() {
        return categoryType;
    }

    public void setCategoryType(boolean categoryType) {
        this.categoryType = categoryType;
    }
}

