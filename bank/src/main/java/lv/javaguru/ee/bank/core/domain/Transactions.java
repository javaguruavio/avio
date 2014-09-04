package lv.javaguru.ee.bank.core.domain;

/**
 * Created by artyom on 9/4/14.
 */
public class Transactions {

    private long id;
    private long client_id;
    private long recipient_bank_id;
    private String recipient_account;
    private String recipient_name;
    private String recipient_surname;
    private long recipient_personal_code;
    private String date;
    private float sum;
    private String transaction_details;
    private String remarks;

    public Transactions(long client_id,
                        long recipient_bank_id,
                        String recipient_account,
                        String recipient_name,
                        String recipient_surname,
                        long recipient_personal_code,
                        String date,
                        float sum,
                        String transaction_details,
                        String remarks) {

        this.client_id = client_id;
        this.recipient_bank_id = recipient_bank_id;
        this.recipient_account = recipient_account;
        this.recipient_name = recipient_name;
        this.recipient_surname = recipient_surname;
        this.recipient_personal_code = recipient_personal_code;
        this.date = date;
        this.sum = sum;
        this.transaction_details = transaction_details;
        this.remarks = remarks;
    }

    public long getId() {
        return id;
    }

    public long getClient_id() {
        return client_id;
    }

    public void setClient_id(long client_id) {
        this.client_id = client_id;
    }

    public long getRecipient_bank_id() {
        return recipient_bank_id;
    }

    public void setRecipient_bank_id(long recipient_bank_id) {
        this.recipient_bank_id = recipient_bank_id;
    }

    public String getRecipient_account() {
        return recipient_account;
    }

    public void setRecipient_account(String recipient_account) {
        this.recipient_account = recipient_account;
    }

    public String getRecipient_name() {
        return recipient_name;
    }

    public void setRecipient_name(String recipient_name) {
        this.recipient_name = recipient_name;
    }

    public String getRecipient_surname() {
        return recipient_surname;
    }

    public void setRecipient_surname(String recipient_surname) {
        this.recipient_surname = recipient_surname;
    }

    public long getRecipient_personal_code() {
        return recipient_personal_code;
    }

    public void setRecipient_personal_code(long recipient_personal_code) {
        this.recipient_personal_code = recipient_personal_code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public String getTransaction_details() {
        return transaction_details;
    }

    public void setTransaction_details(String transaction_details) {
        this.transaction_details = transaction_details;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
