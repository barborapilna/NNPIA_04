package cz.upce.eshop.repozitare;

import cz.upce.eshop.entity.Produkt;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProduktRepo extends JpaRepository<Produkt,Long> {

    @EntityGraph(attributePaths = "Produkt")
    Optional<Produkt> findById(Long id);

    void removeNakoupenaPolozkaById(Long id);
}
