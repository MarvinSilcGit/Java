package br.com.dominio.api.pessoas.dados.ProfissionaisSaude.crp;


import java.util.Date;

import br.com.dominio.api.pessoas.Funcionario;

import br.com.dominio.api.pessoas.dados.Endereco;

import br.com.dominio.api.pessoas.dados.TelefonePessoaFisica;

//Fim dos Imports / End of Imports;


public final class ProfissionalPsicologia extends Funcionario
{
    private String crp;

    //Fim do Campo de Declaração de Atributos / End of Attribute Declaration Field;


    public ProfissionalPsicologia()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;


    public ProfissionalPsicologia(String nome, long cpf, Date dataNascimento, Endereco endereco,

                                  float salarioFixo, short expedienteSemanal, String setor, String funcao, String cargo, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone,

                                  String crp)

    {
        super(nome, cpf, dataNascimento, endereco,

                salarioFixo, expedienteSemanal, setor, funcao, cargo, email, sexualidade, sexo, dataAdmissao, telefone);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;


        this.crp = crp;
    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;

    public ProfissionalPsicologia(String nome, long cpf, Date dataNascimento, Endereco endereco,

                                  float valorConsulta, String setor, String funcao, String cargo, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone, short expedienteSemanal,

                                  String crp)

    {
        super(nome, cpf, dataNascimento, endereco,

                valorConsulta, setor, funcao, cargo, email, sexualidade, sexo, dataAdmissao, telefone, expedienteSemanal);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;


        this.crp = crp;
    }
    //Fim do Métodos Modificadores / End of Setters Methods;


    public final String retornarCrp()
    {
        return crp;
    }
    //Fim dos Métodos Retornadores / End of Getters Methods;

}
//Fim da Classe / End of Class;
