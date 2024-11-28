import javax.smartcardio.Card;

enum CardType{
    DEBIT, CREDIT, PREPAID
}
public class EnumExample {
    public static void main(String[] args) {
        CardType myCardType = CardType.DEBIT;

        switch (myCardType){
            case DEBIT:
                System.out.println("직불 카드를 선택");
                break;
            case CREDIT:
                System.out.println("신용 카드를 선택");
                break;
            case PREPAID:
                System.out.println("선불 카드를 선택");
                break;
            default:
                System.out.println("알 수 없는 카드 타입");
                break;
        }
    }
}
