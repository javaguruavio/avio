package lv.javaguru.ee.bank.core.domain;

/**
 * Created by artyom on 9/4/14.
 */
public class Banks {

    private long id;
    private String bank_name;
    private String country_of_origin;
    private String remarks;

    public enum is_active {yes, no};

    public Banks(String bank_name,
                 String country_of_origin,
                 String remarks) {

        this.bank_name = bank_name;
        this.country_of_origin = country_of_origin;
        this.remarks = remarks;
    }

    public long getId() {
        return id;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getCountry_of_origin() {
        return country_of_origin;
    }

    public void setCountry_of_origin(String country_of_origin) {
        this.country_of_origin = country_of_origin;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
