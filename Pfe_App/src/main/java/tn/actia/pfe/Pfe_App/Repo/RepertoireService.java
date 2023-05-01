package tn.actia.pfe.Pfe_App.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepertoireService {
    @Autowired
    private RepertoireRepository repertoireRepository;

    public List<Repertoire> getAllRepertoires() {
        return repertoireRepository.findAll();
    }

    public Repertoire getRepertoireById(long id) {
        return repertoireRepository.findById(id).orElse(null);
    }

    public void addRepertoire(Repertoire repertoire) {
        repertoireRepository.save(repertoire);
    }

    public void updateRepertoire(long id, Repertoire repertoire) {
        Repertoire existingRepertoire = repertoireRepository.findById(id).orElse(null);
        if (existingRepertoire != null) {
            existingRepertoire.setNom(repertoire.getNom());
            existingRepertoire.setDescription(repertoire.getDescription());
            existingRepertoire.setVisibility(repertoire.getVisibility());
            existingRepertoire.setType(repertoire.getType());
            repertoireRepository.save(existingRepertoire);
        }
    }

    public void deleteRepertoire(long id) {
        repertoireRepository.deleteById(id);
    }
}
