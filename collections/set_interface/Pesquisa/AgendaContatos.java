package src.set_interface.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println("Todos os contatos: " + "\n" + contatoSet);
    }

    //todo contato que começar com o mesmo nome
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null; //criacao da variavel
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("isabel henrique", 123456);
        agendaContatos.adicionarContato("mateus", 1235256);
        agendaContatos.adicionarContato("joao", 233);
        agendaContatos.adicionarContato("julia", 6564);
        agendaContatos.adicionarContato("pedro", 123456);
        agendaContatos.adicionarContato("isabel silva", 123456);

        agendaContatos.exibirContatos();

        System.out.println("Pesquisa por nome: " + agendaContatos.pesquisarPorNome("isabel"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("isabel silva", 555));

        System.out.println("Pesquisa por nome: " + agendaContatos.pesquisarPorNome("isabel"));
    }
}
