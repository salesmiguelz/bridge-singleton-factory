package org.example;

public interface Sale {
    String makeSale(double value);
}

class CreditCardSale implements Sale {
    @Override
    public String makeSale(double value) {
        return "Venda no cartão de crédito no valor de " + value;
    }
}

class DebitCardSale implements Sale {
    @Override
    public String makeSale (double value) {
        return "Venda no cartão de crédito no valor de " + value;
    }
}
