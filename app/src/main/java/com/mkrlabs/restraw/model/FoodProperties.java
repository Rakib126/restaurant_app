package com.mkrlabs.restraw.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FoodProperties {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("category_id")
    @Expose
    private Integer categoryId;
    @SerializedName("item_type")
    @Expose
    private String itemType;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("unit_id")
    @Expose
    private Integer unitId;
    @SerializedName("purchase_price")
    @Expose
    private Integer purchasePrice;
    @SerializedName("avg_pur_price")
    @Expose
    private Integer avgPurPrice;
    @SerializedName("opening_stock")
    @Expose
    private Integer openingStock;
    @SerializedName("vat_id")
    @Expose
    private Integer vatId;
    @SerializedName("discount")
    @Expose
    private Integer discount;
    @SerializedName("sale_price")
    @Expose
    private Integer salePrice;
    @SerializedName("low_stock_alert")
    @Expose
    private Object lowStockAlert;
    @SerializedName("is_stock_check")
    @Expose
    private Object isStockCheck;
    @SerializedName("image")
    @Expose
    private Object image;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("branch_id")
    @Expose
    private Integer branchId;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("deleted_at")
    @Expose
    private Object deletedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getAvgPurPrice() {
        return avgPurPrice;
    }

    public void setAvgPurPrice(Integer avgPurPrice) {
        this.avgPurPrice = avgPurPrice;
    }

    public Integer getOpeningStock() {
        return openingStock;
    }

    public void setOpeningStock(Integer openingStock) {
        this.openingStock = openingStock;
    }

    public Integer getVatId() {
        return vatId;
    }

    public void setVatId(Integer vatId) {
        this.vatId = vatId;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public Object getLowStockAlert() {
        return lowStockAlert;
    }

    public void setLowStockAlert(Object lowStockAlert) {
        this.lowStockAlert = lowStockAlert;
    }

    public Object getIsStockCheck() {
        return isStockCheck;
    }

    public void setIsStockCheck(Object isStockCheck) {
        this.isStockCheck = isStockCheck;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}