package cz.upce.eshop.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Produkt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Integer mnozstvi;
    @Column(nullable = false)
    private Boolean platnost;
    @OneToMany(mappedBy = "id")
    private Set<Kosik> kosik;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Integer getMnozstvi() {
        return mnozstvi;
    }

    public void setMnozstvi(Integer mnozstvi) {
        this.mnozstvi = mnozstvi;
    }

    public Boolean getPlatnost() {
        return platnost;
    }

    public void setPlatnost(Boolean platnost) {
        this.platnost = platnost;
    }

    public Set<Kosik> getNakup() {
        return kosik;
    }

    public void setNakup(Set<Kosik> nakup) {
        this.kosik = nakup;
    }
}
