package br.com.dominio.api.pessoas.dados.ProfissionaisSaude.crf;


import java.util.Date;

import br.com.dominio.api.pessoas.Funcionario;

import br.com.dominio.api.pessoas.dados.*;

//Fim dos Imports / End of Imports;


public final class ProfissionalFarmacia extends Funcionario
{
    private String crf;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public ProfissionalFarmacia()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;


    public ProfissionalFarmacia(String nome, long cpf, Date dataNascimento, Endereco endereco,

                                float salarioFixo, short expedienteSemanal, String setor, String funcao, String cargo, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone,

                                String crf)

    {
        super(nome, cpf, dataNascimento, endereco,

                salarioFixo, expedienteSemanal, setor, funcao, cargo, email, sexualidade, sexo, dataAdmissao, telefone);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;


        this.crf = crf;
    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;


    public final String retornarCrf()
    {
        return crf;
    }
    //Fim dos Métodos Retornadores / End of Getters Methods;

}
//Fim da Classe / End of Class;
