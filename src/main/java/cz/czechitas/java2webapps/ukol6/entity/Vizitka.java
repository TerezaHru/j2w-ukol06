package cz.czechitas.java2webapps.ukol6.entity;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Vizitka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Length(max = 100)
    @NotBlank
    private String celejmeno;
    @Length(max = 100)
    @NotBlank
    private String firma;
    @Length(max = 100)
    @NotBlank
    private String ulice;

    @Length(max = 100)
    @NotBlank
    private String obec;

    @Length(max = 5)
    @NotBlank
    private String psc;

    //@Length(max = 200)
    //private String celaAdresa;


    @Length(max = 100)
    private String email;
    @Length(max = 20)
    private String telefon;
    @Length(max = 100)
    private String web;

    public Vizitka() {
    }

    public Vizitka (Long id, String celejmeno, String firma, String ulice, String obec, String psc, String email, String telefon, String web) {
        this.id = id;
        this.celejmeno = celejmeno;
        this.firma = firma;
        this.ulice = ulice;
        this.obec = obec;
        this.psc = psc;
        this.email = email;
        this.telefon = telefon;
        this.web = web;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }


    public String getObec() {
        return obec;
    }

    public void setObec(String obecPsc) {
        this.obec = obecPsc;
    }

    //public String getCelaAdresa() {return celaAdresa; }

    //public void setCelaAdresa(String celaAdresa) {this.celaAdresa = celaAdresa;}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getCelejmeno() {
        return celejmeno;
    }

    public void setCelejmeno(String celejmeno) {
        this.celejmeno = celejmeno;
    }
}