package br.com.dominio.api.empresa;


import java.util.ArrayList;

import br.com.dominio.api.pessoas.Funcionario;

import br.com.dominio.api.pessoas.dados.TelefonePessoaJuridica;

import br.com.dominio.api.pessoas.dados.Endereco;

import br.com.dominio.api.empresa.departamento.Departamento;

//Fim dos Imports / End of Imports;


public abstract class Empresa
{
    private String razaoSocial,
            nomeFantasia;

    private ArrayList<Departamento> listaDepartamentos = new ArrayList<>(10);

    private ArrayList<String> listaFundadores = new ArrayList<>(10);

    private double capitalSocial;

    private long cnpj;

    private Funcionario presidente,
            vicePresidente;

    private Endereco endereco;

    private TelefonePessoaJuridica telefone;


    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;

    public Empresa()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;


    public Empresa(String razaoSocial, String nomeFantasia, double capitalSocial, long cnpj, Funcionario presidente, Funcionario vicePresidente,

                   Endereco endereco, TelefonePessoaJuridica telefone)

    {
        this.razaoSocial = razaoSocial;

        this.nomeFantasia = nomeFantasia;

        this.capitalSocial = capitalSocial;

        this.cnpj = cnpj;

        this.presidente =  presidente;

        this.vicePresidente = vicePresidente;

        this.endereco = endereco;

        this.telefone = telefone;
    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;


    public final String retornarRazaoSocial()
    {
        return razaoSocial;
    }

    public final String retornarNomeFantasia()
    {
        return nomeFantasia;
    }

    public final double retornarCapitalSocial()
    {
        return capitalSocial;
    }

    public final long retornarCnpj()
    {
        return cnpj;
    }

    public final String retornarPresidente()
    {
        return presidente.retornarNome();
    }

    public final String retornarVicePresidente()
    {
        return vicePresidente.retornarNome();
    }

    public final String retornarEndereco()
    {
        return endereco.retornarEnderecoCompleto();
    }

    public final String retornarTelefone()
    {
        return telefone.retornarNumeroCompleto();
    }

    public final ArrayList retornarListaDepartamentos()
    {
        return listaDepartamentos;
    }

    public final ArrayList retornarListaFundadores()
    {
        return listaFundadores;
    }
    //Fim dos Métodos Retornadores / End of Getters Methods;


    public final void inserirDepartamentoLista(Departamento novoDepartamento)
    {
        if (listaDepartamentos.size() == 10)
        {
            System.out.println("Não é mais possível inserir Departamento / Is no longer possible insertDepartamento");
        }

        else
        {
            listaDepartamentos.add(novoDepartamento);
        }
    }

    public final void removerDepartmanetoLista(Departamento removerDepartamentoLista)
    {
        if (listaDepartamentos.size() == 0)
        {
            System.out.println("Não é mais possível remover Departamento / Is no longer remove Departamento");
        }

        else
        {
            listaDepartamentos.remove(removerDepartamentoLista);
        }
    }

    public final void inserirFundadoresLista(String nomeFundador)
    {
        if (listaFundadores.size() == 10)
        {
            System.out.println("Não é mais possivel inserir Fundador / Is no longer insert Founder");
        }

        else
        {
            listaFundadores.add(nomeFundador);
        }
    }

    public final void removerFundadoresList(String nomeFundador)
    {
        if (listaFundadores.size() == 0)
        {
            System.out.println("Não é mais possível remover Fundador / Is no longer remove Founder");
        }

        else
        {
            listaFundadores.remove(nomeFundador);
        }
    }
    //Fim do Métodos Modificadores / Enf of Setters Methods;


}//Fim da Classe / End of Class;
