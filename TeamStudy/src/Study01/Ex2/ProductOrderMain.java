package Study01.Ex2;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] poArray = new ProductOrder[3];
        ProductOrder po1 = new ProductOrder();
        ProductOrder po2 = new ProductOrder();
        ProductOrder po3 = new ProductOrder();

        po1.productName = "두부";
        po1.price = 2000;
        po1.quantity = 2;

        po2.productName = "김치";
        po2.price = 5000;
        po2.quantity = 1;

        po3.productName = "콜라";
        po3.price = 1500;
        po3.quantity = 2;

        poArray[0] = po1;
        poArray[1] = po2;
        poArray[2] = po3;

/*        System.out.println("상품명 : " + po1.productName + " 가격 : " + po1.price + "수량 : " + po1.quantity );
        System.out.println("상품명 : " + po2.productName + " 가격 : " + po2.price + "수량 : " + po2.quantity );
        System.out.println("상품명 : " + po3.productName + " 가격 : " + po3.price + "수량 : " + po3.quantity );*/
        int totalPrice = 0;

        for(int i = 0; i < poArray.length; i++){
            System.out.println("상품명 : " + poArray[i].productName + ", 가격 : " + poArray[i].price + ", 수량 : " + poArray[i].quantity );
            totalPrice += poArray[i].price * poArray[i].quantity;
        }

        System.out.println("총 결제 금액 : " + totalPrice);
}
