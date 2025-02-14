import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CentroDeCustoRepository centroDeCustoRepository;

    @GetMapping
    public List<Produto> listar() {
        return produtoRepository.findAll();
    }

    @PostMapping("/{centroDeCustoId}")
    public ResponseEntity<Produto> criar(@PathVariable Long centroDeCustoId, @RequestBody Produto produto) {
        return centroDeCustoRepository.findById(centroDeCustoId)
                .map(centroDeCusto -> {
                    produto.setCentroDeCusto(centroDeCusto);
                    return ResponseEntity.ok(produtoRepository.save(produto));
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
