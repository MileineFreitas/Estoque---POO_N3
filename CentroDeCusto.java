import jakarta.persistence.*;
import java.util.List;

@Entity
public class CentroDeCusto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "centroDeCusto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Produto> produtos;

    public CentroDeCusto() {}

    public CentroDeCusto(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public List<Produto> getProdutos() { return produtos; }
    public void setProdutos(List<Produto> produtos) { this.produtos = produtos; }
}
