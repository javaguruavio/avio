package lv.javaguru.ee.bank.core.domain;

/**
 * Created by artyom on 9/4/14.
 */
public class Clients {

    private long id;
    private String name;
    private String surname;
    private String personal_code;
    private String citizenship;

    public Clients(String name,
                   String surname,
                   String personal_code,
                   String citizenship) {

        this.name = name;
        this.surname = surname;
        this.personal_code = personal_code;
        this.citizenship = citizenship;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonal_code() {
        return personal_code;
    }

    public void setPersonal_code(String personal_code) {
        this.personal_code = personal_code;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }
}
