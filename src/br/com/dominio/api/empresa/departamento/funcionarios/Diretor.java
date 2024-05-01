package br.com.dominio.api.empresa.departamento.funcionarios;


import java.util.ArrayList;

import java.util.Date;

import br.com.dominio.api.pessoas.Funcionario;

import br.com.dominio.api.pessoas.dados.Endereco;

import br.com.dominio.api.pessoas.dados.TelefonePessoaFisica;

//Fim dos Imports / End of Imports;


public final class Diretor extends Funcionario
{
    private Assistente assistente;

    private ArrayList<Gerente> listaGerentes = new ArrayList<>();

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public Diretor()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;


    public Diretor(String nome, long cpf, Date dataNascimento, Endereco endereco,

                   float salarioFixo, short expedienteSemanal, String setor, String funcao, String cargo, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone, Assistente assistente)

    {
        super(nome, cpf, dataNascimento, endereco,

                salarioFixo, expedienteSemanal, setor, funcao, cargo,email, sexualidade, sexo, dataAdmissao, telefone);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;


        this.assistente = assistente;
    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;


    public String retornarAssistente()
    {
        return assistente.retornarNome();
    }//Colocar para retornar mais informações;

    public final ArrayList<Gerente> retornarListaGerentes()
    {
        return listaGerentes;
    }
    //Fim do Métodos Retornadores / End of Getters Methods;


    public final void inseriGerenteLista(Gerente novoGerente)
    {
        if (listaGerentes.contains(novoGerente))
        {
            System.out.println("Já existe esse Gerente / Already exists this Gerente");
        }

        else
        {
            listaGerentes.add(novoGerente);
        }
    }

    public void removerGerentesLista(Gerente removerGerente)
    {
        if (listaGerentes.contains(removerGerente))
        {
            listaGerentes.remove(removerGerente);
        }

        else
        {
            System.out.println("Este Gerente não exists / This Gerente don't exists");
        }
    }
    //Fim dos Métodos Modificadores / End of Setters Methods;

}
//Fim da Classe / End of Class;
