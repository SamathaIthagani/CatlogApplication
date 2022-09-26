package com.dir.category.cat;

public class Sale {

    private Integer productId;
    private Integer leafCategoryId;
    private Integer primaryCategoryId;
    private Double amount;
    private Long quantity;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getLeaafCategoryId() {
        return leafCategoryId;
    }

    public void setLeafCategoryId(Integer leafCategoryId) {
        this.leafCategoryId = leafCategoryId;
    }

    public Integer getPrimaryCategoryId() {
        return primaryCategoryId;
    }

    public void setPrimaryCategoryId(Integer primaryCategoryId) {
        this.primaryCategoryId = primaryCategoryId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Sale(Integer productId, Integer leafCategoryId, Integer primaryCategoryId, Double amount, Long quantity) {
        this.productId = productId;
        this.leafCategoryId = leafCategoryId;
        this.primaryCategoryId = primaryCategoryId;
        this.amount = amount;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "productId=" + productId +
                ", leafCategoryId=" + leafCategoryId +
                ", primaryCategoryId=" + primaryCategoryId +
                ", amount=" + amount +
                ", quantity=" + quantity +
                '}';
    }
}