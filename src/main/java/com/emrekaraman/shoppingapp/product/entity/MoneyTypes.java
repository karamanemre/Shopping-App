package com.emrekaraman.shoppingapp.product.entity;

public enum MoneyTypes {
    USD("Dolar","$"),
    EUR("Euro","£"),
    TL("Lira","₺");

    private String label; //Euro,Dollar,Tl
    private String symbol; //$

    MoneyTypes(String label,String symbol){
        this.label = label;
        this.symbol = symbol;
    }
}
