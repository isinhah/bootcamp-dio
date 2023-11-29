package src.list_interface.OperacoesBasicas.ListaDeTarefas;

public class Tarefa {

    //atributo
    private String descricao;

    //construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //método
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
