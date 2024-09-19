package New_ScreenMatch.ScreenMatch.model;

    public enum Categoria {
        ACAO("Action", "Ação"),
        ROMANCE("Romance", "Romance"),
        COMEDIA("Comedy", "Comédia"),
        DRAMA("Drama", "Drama"),
        CRIME("Crime", "Crime"),
        SHORT("Short", "Curta-Metragem"),
        AVENTURA("Adventure", "Aventura"); // Adicionando a categoria "Aventura"

        private String categoriaOmdb;
        private String categoriaPortugues;

        Categoria(String categoriaOmdb, String categoriaPortugues) {
            this.categoriaOmdb = categoriaOmdb;
            this.categoriaPortugues = categoriaPortugues;
        }

        // Método para buscar a categoria a partir da string da OMDB (em inglês)
        public static Categoria fromString(String text) {
            for (Categoria categoria : Categoria.values()) {
                if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                    return categoria;
                }
            }
            throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
        }

        // Método para buscar a categoria a partir da string em português
        public static Categoria fromPortugues(String text) {
            for (Categoria categoria : Categoria.values()) {
                if (categoria.categoriaPortugues.equalsIgnoreCase(text)) {
                    return categoria;
                }
            }
            throw new IllegalArgumentException("Nenhuma categoria encontrada para a string especificada: " + text);
        }
    }