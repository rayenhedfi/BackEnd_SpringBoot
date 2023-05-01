package tn.actia.pfe.Pfe_App.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepertoireRepository extends JpaRepository<Repertoire, Long> {
}
