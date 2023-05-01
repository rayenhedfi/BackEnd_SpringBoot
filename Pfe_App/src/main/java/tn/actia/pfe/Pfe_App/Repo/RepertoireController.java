package tn.actia.pfe.Pfe_App.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/repertoires")
public class RepertoireController {
    @Autowired
    private RepertoireService repertoireService;

    @GetMapping("")
    public ResponseEntity<List<Repertoire>> getAllRepertoires() {
        List<Repertoire> repertoires = repertoireService.getAllRepertoires();
        return new ResponseEntity<>(repertoires, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Repertoire> getRepertoireById(@PathVariable("id") long id) {
        Repertoire repertoire = repertoireService.getRepertoireById(id);
        if (repertoire != null) {
            return new ResponseEntity<>(repertoire, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("")
    public ResponseEntity<Repertoire> addRepertoire(@RequestBody Repertoire repertoire) {
        repertoireService.addRepertoire(repertoire);
        return new ResponseEntity<>(repertoire, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Repertoire> updateRepertoire(@PathVariable("id") long id, @RequestBody Repertoire repertoire) {
        repertoireService.updateRepertoire(id, repertoire);
        return new ResponseEntity<>(repertoire, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteRepertoire(@PathVariable("id") long id) {
        repertoireService.deleteRepertoire(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
