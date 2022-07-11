import java.util.*;

public class Blog {

    private List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post postagem) {
        if (postagens.isEmpty()) {
            postagens.add(postagem);
        } else {
            for (Post post : postagens) {
                if (post.getAutor().equals(postagem.getAutor()) && post.getTitulo().equals(postagem.getTitulo())) {
                    throw new IllegalArgumentException("Postagem jah existente");
                }
            }
            postagens.add(postagem);
        }
    }

    public TreeSet<Autor> obterTodosAutores() {
        TreeSet<Autor> autores = new TreeSet<Autor>();
        for (Post post: postagens) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public TreeMap<Categorias, Integer> obterContagemPorCategoria() {
        TreeMap<Categorias, Integer> categorias = new TreeMap<Categorias, Integer>();
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

    public TreeSet<Post> obterPostsPorAutor(Autor autor) {
        TreeSet<Post> postPorAutor = new TreeSet<Post>();
        for (Post post : postagens) {
            if (post.getAutor().getNome().equalsIgnoreCase(autor.getNome()) && post.getAutor().getSobrenome().equalsIgnoreCase(autor.getSobrenome())) {
                postPorAutor.add(post);
            }
        }
        return postPorAutor;
    }

    public TreeSet<Post> obterPostsPorCategoria(Categorias categoria) {
        TreeSet<Post> postPorCategoria = new TreeSet<Post>();
        for (Post post : postagens) {
            if (post.getCategoria().equals(categoria)) {
                postPorCategoria.add(post);
            }
        }
        return postPorCategoria;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias(){
        Map<Categorias, Set<Post>> listaDeCategoria = new TreeMap<>();
        Set<Post> postPorCategoria;
        for (int i = 0; i < postagens.size(); i++) {
            postPorCategoria = new TreeSet<>();
                for (Post post: postagens) {
                if (postagens.get(i).getCategoria().equals(post.getCategoria())){
                    postPorCategoria.add(post);
                }
            }
            listaDeCategoria.put((postagens.get(i).getCategoria()),postPorCategoria);

        }return listaDeCategoria;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> listaDeAutor = new TreeMap<>();
        Set<Post> postPorCategoria;
        for (int i = 0; i < postagens.size(); i++) {
            postPorCategoria = new TreeSet<>();
            for (Post post: postagens) {
                if (postagens.get(i).getAutor().equals(post.getAutor())){
                    postPorCategoria.add(post);
                }
            }
            listaDeAutor.put(postagens.get(i).getAutor(),postPorCategoria);

        }return listaDeAutor;
    }

}
