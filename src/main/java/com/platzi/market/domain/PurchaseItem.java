package com.platzi.market.domain;

public class PurchaseItem {
    private int productInt;
    private int quantity;
    private double total;
    private boolean active;

    public int getProductInt() {
        return productInt;
    }

    public void setProductInt(int productInt) {
        this.productInt = productInt;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
