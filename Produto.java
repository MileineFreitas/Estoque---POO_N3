import jakarta.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int quantidade;
    private double preco;

    @ManyToOne
    @JoinColumn(name = "centro_de_custo_id")
    private CentroDeCusto centroDeCusto;

    public Produto() {}

    public Produto(String nome, int quantidade, double preco, CentroDeCusto centroDeCusto) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.centroDeCusto = centroDeCusto;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public CentroDeCusto getCentroDeCusto() { return centroDeCusto; }
    public void setCentroDeCusto(CentroDeCusto centroDeCusto) { this.centroDeCusto = centroDeCusto; }
}
