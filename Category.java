package com.dir.category.cat;
import java.util.List;

public class Category {
    private Integer id;
    private String name;
    private List<Category> category;
    private Long totalSales;
    private Long totalQuantity;

    public Category(Integer id, String name, List<Category> category){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public Long getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Long totalSales) {
        this.totalSales = totalSales;
    }

    public Long getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Long totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Category(Integer id, String name, List<Category> category, Long totalSales, Long totalQuantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.totalSales = totalSales;
        this.totalQuantity = totalQuantity;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", totalSales=" + totalSales +
                ", totalQuantity=" + totalQuantity +
                '}';
    }

}
