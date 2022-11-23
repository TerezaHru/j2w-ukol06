package cz.czechitas.java2webapps.ukol6.entity;

public class Vizitka {
    private String jmeno;
    private String firma;
    private String ulice;
    private String obecPsc;
    private String celaAdresa;
    private String email;
    private String telefon;
    private String web;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    public Vizitka() {
    }

    public Vizitka(String jmeno, String firma, String ulice, String obecPsc, String celaAdresa, String email, String telefon, String web, String id) {
        this.jmeno = jmeno;
        this.firma = firma;
        this.ulice = ulice;
        this.obecPsc = obecPsc;
        this.celaAdresa = celaAdresa;
        this.email = email;
        this.telefon = telefon;
        this.web = web;
        this.id = id;
    }

    public String getObecPsc() {
        return obecPsc;
    }

    public void setObecPsc(String obecPsc) {
        this.obecPsc = obecPsc;
    }

    public String getCelaAdresa() {
        return celaAdresa;
    }

    public void setCelaAdresa(String celaAdresa) {
        this.celaAdresa = celaAdresa;
    }

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

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    //celaAdresa (readonly property, ve tvaru „ulice, obecPsc“)

}


