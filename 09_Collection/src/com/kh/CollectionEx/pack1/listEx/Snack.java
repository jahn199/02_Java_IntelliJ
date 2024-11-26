package com.kh.CollectionEx.pack1.listEx;

public class Snack {
    private String snackName;
    private int snackPrice;
    private int snackQuality;

    public Snack() {
    }

    public Snack(String snackName, int snackPrice, int snackQuality) {
        this.snackName = snackName;
        this.snackPrice = snackPrice;
        this.snackQuality = snackQuality;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public int getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(int snackPrice) {
        this.snackPrice = snackPrice;
    }

    public int getSnackQuality() {
        return snackQuality;
    }

    public void setSnackQuality(int snackQuality) {
        this.snackQuality = snackQuality;
    }

    @Override
    public String toString() {
        return "snackName='" + snackName + '\'' +
                ", snackPrice=" + snackPrice +
                ", snackQuality=" + snackQuality;
    }
}
