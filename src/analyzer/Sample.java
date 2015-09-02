package analyzer;

/**
 * @author Viktor Bezditnyi
 */
public class Sample {
    private String firstName;
    private String lastName;
    private String sex;
    private String browser;

    public Sample(String firstName, String lastName, String sex, String browser) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.browser = browser;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public String getBrowser() {
        return browser;
    }
}
