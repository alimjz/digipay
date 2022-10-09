package com.digipay.entity;

public class Product {
    private String prodId;
    private String prodName;
    private Category prodCategory;
    private SubCategory prodSubCategory;
    private String modelName;

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Category getProdCategory() {
        return prodCategory;
    }

    public void setProdCategory(Category prodCategory) {
        this.prodCategory = prodCategory;
    }

    public SubCategory getProdSubCategory() {
        return prodSubCategory;
    }

    public void setProdSubCategory(SubCategory prodSubCategory) {
        this.prodSubCategory = prodSubCategory;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
