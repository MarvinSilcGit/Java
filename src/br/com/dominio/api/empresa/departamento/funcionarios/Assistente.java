package br.com.dominio.api.empresa.departamento.funcionarios;


import java.util.Date;

import java.util.Hashtable;

import br.com.dominio.api.pessoas.Funcionario;

import br.com.dominio.api.pessoas.dados.Endereco;

import br.com.dominio.api.pessoas.dados.TelefonePessoaFisica;

//Fim dos Imports / End of Imports;


public final class Assistente extends Funcionario
{
    private final Hashtable<String, String> agenda = new Hashtable<>();

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public Assistente()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;


    public Assistente(String nome, long cpf, Date dataNascimento, Endereco endereco,

                      float salarioFixo, short expedienteSemanal, String setor, String funcao, String cargo, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone)

    {
        super(nome, cpf, dataNascimento, endereco,

                salarioFixo, expedienteSemanal, setor, funcao, cargo, email, sexualidade, sexo, dataAdmissao, telefone);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;

    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;


    public final Hashtable<String, String> retornarAgenda()
    {
        return agenda;
    }
    //Fim dos Métodos Retornadores / Enf of Getters Methods;


    public final void agendarReuniao(String titulo, String resumo)
    {
        agenda.put(titulo, resumo);
    }

    public final void removerReuniao(String titulo)
    {
        agenda.remove(titulo);
    }
    //Fim dos Métodos Modificadores / End of Setters Methods;

}
//Fim da Classe / End of Class;
