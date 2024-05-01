package br.com.dominio.api.empresa.departamento;


import java.util.ArrayList;

import java.util.Hashtable;

import br.com.dominio.api.empresa.departamento.funcionarios.Diretor;

//Fim dos Imports / End of Imports;


public final class Departamento
{
    private String nome,
            funcao;

    private Diretor diretor;

    private double orcamentoTrimestral;

    private final Hashtable<String, Double> listaDespesas = new Hashtable<>();

    private ArrayList<Equipamento> listaEquipamentos = new ArrayList<>();

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public Departamento()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;


    public Departamento(String nome, String funcao, Diretor diretor, double orcamentoTrimestral)
    {
        this.nome = nome;

        this.funcao = funcao;

        this.diretor = diretor;

        this.orcamentoTrimestral = orcamentoTrimestral;
    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;


    public String retornarNome()
    {
        return nome;
    }

    public String retornarFuncao()
    {
        return funcao;
    }

    public String retornarDiretor()
    {
        return diretor.retornarNome();
    }

    public double retornarOrcamentoTrimestral()
    {
        return orcamentoTrimestral;
    }

    public Hashtable<String, Double> retornarListaDespesas()
    {
        return listaDespesas;
    }

    public ArrayList<Equipamento> retornarListaEquipamentso()
    {
        return listaEquipamentos;
    }
    //Fim do Métodos Retornadores / End of Getter Methods;


    public void alterarNome(String novoNome)
    {
        nome = novoNome;
    }

    public void alterarFuncao(String novaFuncao)
    {
        funcao = novaFuncao;
    }

    public void alterarDiretor(Diretor novoDiretor)
    {
        diretor = novoDiretor;
    }

    public void alterOrcamentoTrimestral(double novoOrcamentoTrimestral)
    {
         orcamentoTrimestral = novoOrcamentoTrimestral;
    }

    public void inserirDespesaLista(String titulo, Double valor)
    {
        if (listaDespesas.contains(titulo))
        {
            System.out.println("Já existe essa Depesa / Already exists this Expense");
        }

        else
        {
            listaDespesas.put(titulo, valor);
        }
    }

    public void removerDespesaLista(String titulo)
    {
        if (listaDespesas.contains(titulo))
        {
            listaDespesas.remove(titulo);
        }

        else
        {
            System.out.println("Essa Despesa não existe / This Expense don't exists");
        }
    }

    public void inserirEquipamentoLista(Equipamento novoEquipamento)
    {
        if (listaEquipamentos.contains(novoEquipamento))
        {
            System.out.println("Já existe esse Equipamento / Already exists this Equipamento");
        }

        else
        {
            listaEquipamentos.add(novoEquipamento);
        }
    }

    public void removerDespesaLista(Equipamento equipamento)
    {
        if (listaDespesas.contains(equipamento))
        {
            listaDespesas.remove(equipamento);
        }

        else
        {
            System.out.println("Essa Equipamento não existe / This Equipamento don't exists");
        }
    }
    //Fim do Métodos Modificadores / End of Setters Methods;

}
//Fim da Classe / End of Class;
