package hello.core.order;

public class Order {
    //저는 itemPrice를 회원 purchase_amount에 더하여 등급을 업그레이드 하여 줍니다.
    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    public Long getMemberId() {
        return memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public Order(Long memberId, String itemName, int itemPrice, int discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    public int caluculatePrice(){
        return itemPrice- discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" + "memberId= " + memberId + ", itemName= '" + itemName +
        ", itemPrice=" + itemPrice + ", discountPrice=" + discountPrice + '}';
    }



}
