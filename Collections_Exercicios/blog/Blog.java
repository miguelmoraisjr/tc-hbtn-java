import java.util.*;

public class Blog {

    private List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post postagem) {
        postagens.add(postagem);
    }

    public TreeSet<String> obterTodosAutores() {
        TreeSet<String> autores = new TreeSet<String>();
        for (Post post: postagens) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public TreeMap<String, Integer> obterContagemPorCategoria() {
        TreeMap<String, Integer> categorias = new TreeMap<String, Integer>();
        for (Post post: postagens) {
            if (categorias.isEmpty()) {
                categorias.put(post.getCategoria(), 1);
            } else {
                if (categorias.containsKey(post.getCategoria())) {
                    Integer aux = categorias.get(post.getCategoria());
                    categorias.replace(post.getCategoria(), aux + 1);
                } else {
                    categorias.put(post.getCategoria(), 1);
                }
            }
        }
        return categorias;
    }


}
