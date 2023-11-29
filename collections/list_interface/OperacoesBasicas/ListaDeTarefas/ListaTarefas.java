package src.list_interface.OperacoesBasicas.ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    //lista de tarefas como atributo, list com o elemento Tarefa e o nome do atributo é tarefaList
    private List<Tarefa> tarefaList;

    //list vazio para receber novos elementos
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    //métodos
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {

        //se tiver elementos duplicados
        //criacao da lista que representa todos oe elementos que quero remover
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        // laço de repeticao para pegar cada tarefa da tarefaList, se a descricao for = a daqui, remove a tarfa
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("O numero total de elementos na lista: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("tarefa 1");
        listaTarefas.adicionarTarefa("tarefa 2");
        listaTarefas.adicionarTarefa("tarefa 3");

        System.out.println("O numero total de elementos na lista: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("tarefa 1");

        System.out.println("O numero total de elementos na lista: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}
