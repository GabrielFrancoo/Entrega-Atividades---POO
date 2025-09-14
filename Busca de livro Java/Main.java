public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899, 50.0);
        Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937, 70.0);
        Livro livro3 = new Livro("O Homem que Calculava ", "Malba Tahan", 1998, 80.0);
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.listarLivrosDisponiveis();

        livro1.emprestar();

        biblioteca.listarLivrosDisponiveis();

        double total = biblioteca.calcularValorTotal();
        System.out.println("Valor total dos livros: R$ " + total);
    }
}