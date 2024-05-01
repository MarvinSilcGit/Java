package br.com.dominio.api.empresa.departamento.funcionarios;


import java.util.Date;

import java.util.ArrayList;

import br.com.dominio.api.pessoas.Funcionario;

import br.com.dominio.api.pessoas.dados.Endereco;

import br.com.dominio.api.pessoas.dados.TelefonePessoaFisica;

//Fim dos Imports / End of Imports;


public final class ChefeEquipe extends Funcionario
{
    private static final ArrayList<Funcionario> listaFuncionarios = new ArrayList<>(1);

    //Fim do Campo de Declaração de Atributos  / End of Attributes Declaration Field;


    public ChefeEquipe()
    {

    }
    //Fim do Construtor Padrão / End of Default Construtor;

    public ChefeEquipe(String nome, long cpf, Date dataNascimento, Endereco endereco,

                       float salarioFixo, short expedienteSemanal, String setor, String funcao, String cargo, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone)

    {
        super(nome, cpf, dataNascimento, endereco,

                salarioFixo, expedienteSemanal, setor, funcao, cargo, email, sexualidade, sexo, dataAdmissao, telefone);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;

    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;


    public final ArrayList<Funcionario> retornarListaEquipe()
    {
        return listaFuncionarios;
    }
    //Fim dos Métodos Retornadores / End of Getters Methods;


    public final void inserirEquipe(Funcionario novaFuncionario)
    {
        if (listaFuncionarios.size() == 0)
        {
            if (listaFuncionarios.contains(novaFuncionario))
            {
                System.out.println("Já existe essa Equipe");
            }

            else
            {
                listaFuncionarios.add(novaFuncionario);
            }
        }

        else
        {
            System.out.println("Não pode adicionar mais Equipe / Can't add more Equipe");
        }
    }

    public final void removerEquipe(Funcionario removerFuncionario)
    {
        if (listaFuncionarios.contains(removerFuncionario))
        {
            listaFuncionarios.remove(removerFuncionario);
        }

        else
        {
            System.out.println("Essa Equipe não existe / This Equipe don't exists");

        }
    }
    //Fim do Métodos Modificadores / End of Setters Methods;

}
//Fim da Classe;
