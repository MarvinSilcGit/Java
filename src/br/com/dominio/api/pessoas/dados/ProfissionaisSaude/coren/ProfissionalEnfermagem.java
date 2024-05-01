package br.com.dominio.api.pessoas.dados.ProfissionaisSaude.coren;


import java.util.Date;

import br.com.dominio.api.pessoas.Funcionario;

import br.com.dominio.api.pessoas.dados.*;

//Fim dos imports / End of Imports;


public final class ProfissionalEnfermagem extends Funcionario
{
    private String coren;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public ProfissionalEnfermagem ()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;


    public ProfissionalEnfermagem (String nome, long cpf, Date dataNascimento, Endereco endereco,

                                   float salarioFixo, short expedienteSemanal, String setor, String funcao, String cargo, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone,

                                   String coren)

    {
        super(nome, cpf, dataNascimento, endereco,

                salarioFixo, expedienteSemanal, setor, funcao, cargo, email, sexualidade, sexo, dataAdmissao, telefone);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method


        this.coren = coren;
    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;


    public final String retornarCoren()
    {
        return coren;
    }
    //Fim dos Métodos Retornadores / End of Getters Methods;

}
//Fim da classe  / End of CLass;
