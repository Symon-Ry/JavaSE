package atguigu.day10homework.test9;

public enum Payment implements Payable{
    ALIPAY,WECHAT,CREDIT_CARD,DEPOSIT_CARD;

    @Override
    public void pay() {
        if (this == ALIPAY || this == WECHAT) {
            System.out.println("扫码支付");
        }
        if (this == CREDIT_CARD || this == DEPOSIT_CARD) {
            System.out.println("输入卡号支付");
        }
    }
}
