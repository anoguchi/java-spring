package ProgramacaoFuncionalAndExpressoesLambda.predicate.v5.entities;

public class Product {
    private String ProductName;
    private Double ProductPrice;

    public Product(String productName, Double productPrice) {
        ProductName = productName;
        ProductPrice = productPrice;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(Double productPrice) {
        ProductPrice = productPrice;
    }

    public boolean nonStaticProductPredicate() {
        return getProductPrice() >= 100.00;
    }
    @Override
    public String toString() {
        return getProductName() + ", " + String.format("%.2f", getProductPrice());
    }
}
