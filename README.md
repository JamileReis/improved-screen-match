# 🎬 New ScreenMatch  

API REST desenvolvida em **Java + Spring Boot** para gerenciar séries, episódios e categorias.  
Permite consultar séries, lançamentos, top 5, buscar por categoria, além de listar temporadas e episódios.  

📋 Descrição
O ScreenMatch é uma API que permite consultar informações sobre séries televisivas, incluindo detalhes das séries, temporadas, episódios, e realizar buscas por diversos critérios como categoria, melhores avaliações e lançamentos recentes.

## 🚀 Tecnologias Utilizadas  

- **Java 21**  
- **Spring Boot 3**  
- **Spring Data JPA**  
- **Hibernate**  
- **PostgreSQL**  
- **OpenAI API** (para tradução de textos)  
- **HttpClient (Java)** – Consumo de APIs externas  
- **Jackson** – Conversão de JSON  
- **Maven** – Gerenciamento de dependências  

## 🚀 Funcionalidades

* **Listagem de Séries:** Retorna uma lista completa de todas as séries cadastradas.
* **Top 5:** Obtém as 5 séries mais bem avaliadas.
* **Lançamentos:** Retorna as 5 séries com os episódios mais recentes.
* **Busca por ID e Categoria:** Permite buscar séries específicas por seu ID ou por categoria (gênero).
* **Busca de Episódios:** Oferece endpoints para listar todos os episódios de uma série ou filtrar por temporada.
* **Serviço de Tradução:** Utiliza a API do ChatGPT para traduzir sinopses de séries.




