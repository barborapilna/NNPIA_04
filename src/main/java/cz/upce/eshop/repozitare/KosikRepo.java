package cz.upce.eshop.repozitare;

import cz.upce.eshop.entity.Kosik;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface KosikRepo extends JpaRepository<Kosik, Long> {

    @EntityGraph(attributePaths = {"Produkt", "Uzivatel"})
    Optional<Kosik> findById(Long id);

    Kosik getKosikByObjednavka(Integer objednavka);

    void removeNakupById(Long id);
}
