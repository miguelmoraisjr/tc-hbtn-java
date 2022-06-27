package produtos;

public class Livro extends Produto{

    private int paginas;
    private String autor;
    private int edicao;

    public Livro(String titulo, int ano, String pais, double preçoBruto, int paginas, String autor, int edicao) {
        super(titulo, ano, pais, preçoBruto);
        this.paginas = paginas;
        this.autor = autor;
        this.edicao = edicao;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getAutor() {
        return autor;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public double obterPrecoLiquido() {
        return getPrecoBruto() + (getPrecoBruto() * 0.15);
    }
}
