package cz.upce.eshop.entity;

import javax.persistence.*;

@Entity
public class Kosik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private Integer objednavka;
    @Column(nullable = false)
    private Boolean stav;
    @ManyToOne
    private Uzivatel uzivatel;
    @ManyToOne
    private Produkt produkt;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Integer getObjednavka() {
        return objednavka;
    }

    public void setObjednavka(Integer objednavka) {
        this.objednavka = objednavka;
    }

    public Boolean getStav() {
        return stav;
    }

    public void setStav(Boolean stav) {
        this.stav = stav;
    }

    public Uzivatel getUzivatel() {
        return uzivatel;
    }

    public void setUzivatel(Uzivatel uzivatel) {
        this.uzivatel = uzivatel;
    }

    public Produkt getNakoupenaPolozka() {
        return produkt;
    }

    public void setNakoupenaPolozka(Produkt nakoupenaPolozka) {
        this.produkt = nakoupenaPolozka;
    }

}
