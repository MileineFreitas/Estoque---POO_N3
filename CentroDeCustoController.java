import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/centros-de-custo")
public class CentroDeCustoController {

    @Autowired
    private CentroDeCustoRepository centroDeCustoRepository;

    @GetMapping
    public List<CentroDeCusto> listar() {
        return centroDeCustoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<CentroDeCusto> criar(@RequestBody CentroDeCusto centroDeCusto) {
        return ResponseEntity.ok(centroDeCustoRepository.save(centroDeCusto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CentroDeCusto> buscarPorId(@PathVariable Long id) {
        return centroDeCustoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
