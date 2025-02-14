import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class EstoqueApp extends Application {

    @Override
    public void start(Stage stage) {
        Label lblCentroDeCusto = new Label("Centro de Custo");
        ComboBox<String> cbCentroDeCusto = new ComboBox<>();
        cbCentroDeCusto.getItems().addAll("Marketing", "Financeiro", "TI");

        Label lblProduto = new Label("Produto");
        TextField txtProduto = new TextField();

        Label lblQuantidade = new Label("Quantidade");
        TextField txtQuantidade = new TextField();

        Label lblPreco = new Label("Preço");
        TextField txtPreco = new TextField();

        Button btnAdicionar = new Button("Adicionar Produto");

        VBox layout = new VBox(10, lblCentroDeCusto, cbCentroDeCusto, lblProduto, txtProduto,
                lblQuantidade, txtQuantidade, lblPreco, txtPreco, btnAdicionar);

        Scene scene = new Scene(layout, 400, 300);
        stage.setTitle("Gerenciador de Estoque");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
