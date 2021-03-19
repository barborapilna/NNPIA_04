package cz.upce.eshop.repozitare;

import cz.upce.eshop.entity.Uzivatel;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UzivatelRepo extends JpaRepository<Uzivatel, Long> {

    @EntityGraph(attributePaths = "Kosik")
    Optional<Uzivatel> findById(Long id);

    Uzivatel getUzivatelByEmail(String email);

    void removeUzivatelById(Long id);
}
