# Estoque---POO_N3

Projeto final de Orientação a Objeto em Java.

Controle de Estoque - 

Este projeto é uma aplicação para gerenciar **Centros de Custo** e **Produtos** com uma API REST usando **Spring Boot** e uma interface gráfica construída com **JavaFX**.

Funcionalidades:
- Cadastro de Centros de Custo**: Adicionar e listar centros de custo.
- Cadastro de Produtos**: Associar produtos a centros de custo.
- Remoção de Produtos**: Excluir produtos cadastrados.
- Interface Gráfica**: Interface simples para gerenciar produtos e centros de custo.

Tecnologias:
- Spring Boot** (para API REST)
- JPA** (para persistência de dados)
- JavaFX** (para interface gráfica)

Endpoints da API:
- Centros de Custo**: `GET /centros-de-custo`, `POST /centros-de-custo`
- Produtos**: `GET /produtos`, `POST /produtos/{centroDeCustoId}`, `DELETE /produtos/{id}`

Como Executar:
1. Clone o repositório e execute o backend com **Maven**.
2. Use a interface JavaFX para adicionar produtos ao sistema.
3. Configure o banco de dados H2 ou MySQL conforme desejado.

Este sistema oferece uma maneira prática de gerenciar centros de custo e produtos de forma simples e eficiente.
