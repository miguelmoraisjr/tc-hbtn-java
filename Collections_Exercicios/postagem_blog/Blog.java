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
                } else {
                    postagens.add(postagem);
                    break;
                }
            }
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

    public TreeMap<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        TreeMap<Categorias, Set<Post>> postCategorias = new TreeMap<Categorias, Set<Post>>();
        Set<Post> posts = new HashSet<>();
        for (Post post : postagens) {
            if (postCategorias.isEmpty()) {
                posts.add(post);
                postCategorias.put(post.getCategoria(),posts);
            } else {
                if (postCategorias.containsKey(post.getCategoria())){
                    posts.add(post);
                    postCategorias.replace(post.getCategoria(),posts);
                } else {
                    posts.add(post);
                    postCategorias.put(post.getCategoria(),posts);
                }
            }
        }
        return postCategorias;
    }

    public TreeMap<Autor, Set<Post>> obterTodosPostsPorAutor(){
        TreeMap<Autor,Set<Post>> postAutor = new TreeMap<Autor, Set<Post>>();
        Set<Post> posts = new HashSet<>();
        for (Post post : postagens) {
            if (postAutor.isEmpty()) {
                posts.add(post);
               postAutor.put(post.getAutor(),posts);
            } else {
                if (postAutor.containsKey(post.getAutor())) {
                    posts.add(post);
                    postAutor.replace(post.getAutor(), posts);
                } else {
                    posts.add(post);
                    postAutor.put(post.getAutor(),posts);
                }
            }
        }
        return postAutor;
    }
}
