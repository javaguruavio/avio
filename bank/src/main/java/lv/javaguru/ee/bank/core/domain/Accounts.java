package lv.javaguru.ee.bank.core.domain;

/**
 * Created by artyom on 9/4/14.
 */
public class Accounts {

    private long client_id;
    private long number;
    private String created;
    private String cardsurname;
    private String cardnumber;
    private String carddate;
    private int cardcvv;
    private float ballance;
    private String remark;

    private enum type {card_debet, card_credit, settlement};
    private enum is_active {yes, no};

    public Accounts(long client_id,
                    long number,
                    String created,
                    String cardsurname,
                    String cardnumber,
                    String carddate,
                    int cardcvv,
                    float ballance,
                    String remark) {

        this.client_id = client_id;
        this.number = number;
        this.created = created;
        this.cardsurname = cardsurname;
        this.cardnumber = cardnumber;
        this.carddate = carddate;
        this.cardcvv = cardcvv;
        this.ballance = ballance;
        this.remark = remark;
    }

    public long getClient_id() {
        return client_id;
    }

    public void setClient_id(long client_id) {
        this.client_id = client_id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getCardsurname() {
        return cardsurname;
    }

    public void setCardsurname(String cardsurname) {
        this.cardsurname = cardsurname;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getCarddate() {
        return carddate;
    }

    public void setCarddate(String carddate) {
        this.carddate = carddate;
    }

    public int getCardcvv() {
        return cardcvv;
    }

    public void setCardcvv(int cardcvv) {
        this.cardcvv = cardcvv;
    }

    public float getBallance() {
        return ballance;
    }

    public void setBallance(float ballance) {
        this.ballance = ballance;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
