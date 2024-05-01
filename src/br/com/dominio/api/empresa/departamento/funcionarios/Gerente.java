package br.com.dominio.api.empresa.departamento.funcionarios;


import java.util.Date;

import java.util.ArrayList;

import br.com.dominio.api.pessoas.Funcionario;

import br.com.dominio.api.pessoas.dados.TelefonePessoaFisica;

import br.com.dominio.api.pessoas.dados.Endereco;

//Fim dos Imports / End of Imports;


public final class Gerente extends Funcionario
{
    private ArrayList<ChefeEquipe> listaChefesEquipes = new ArrayList<>();

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public Gerente()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;


    public Gerente(String nome, long cpf, Date dataNascimento, Endereco endereco,

                   float salarioFixo, short expedienteSemanal, String setor, String funcao, String cargo, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone)

    {
        super(nome, cpf, dataNascimento, endereco,

                salarioFixo, expedienteSemanal, setor, funcao, cargo, email, sexualidade, sexo, dataAdmissao, telefone);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;

    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;


    public ArrayList<ChefeEquipe> retornarChefesEquipes()
    {
        return listaChefesEquipes;
    }
    //Fim dos Métodos Retornadores / End of Getters Methods;


    public void inserirChefeEquipe(ChefeEquipe novoChefeEquipe)
    {
        if (listaChefesEquipes.contains(novoChefeEquipe))
        {
            System.out.println("Já existe esse ChefeEquipe / Already exists this ChefeEquipe");
        }

        else
        {
            listaChefesEquipes.add(novoChefeEquipe);
        }
    }

    public void removerChefeEquipe(ChefeEquipe chefeEquipe)
    {
        if (listaChefesEquipes.contains(chefeEquipe))
        {
            listaChefesEquipes.remove(chefeEquipe);
        }

        else
        {
            System.out.println("Esse ChefeEquipe não existe / This ChefeEquipe don't exists");
        }
    }
    //Fim do Métodos Modificadores / End of Setters Methods;

}
//Fim da Classe / End of Class;
