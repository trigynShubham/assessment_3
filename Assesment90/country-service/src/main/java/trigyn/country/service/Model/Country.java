package trigyn.country.service.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Country {
     @Id
     @GeneratedValue
    private Integer id;
    private String countryname;
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Double getCurrency() {
        return currency;
    }

    public void setCurrency(Double currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countryname='" + countryname + '\'' +
                ", language='" + language + '\'' +
                ", currency=" + currency +
                '}';
    }

    private Double currency;

    public String getCountryname() {
        return countryname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }
}
