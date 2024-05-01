package br.com.dominio.api.pessoas.dados.ProfissionaisSaude.crm;


import java.util.Date;

import java.util.ArrayList;

import br.com.dominio.api.pessoas.Cidadao;

import br.com.dominio.api.pessoas.Funcionario;

import br.com.dominio.api.pessoas.dados.*;

//Fim dos Imports / End of Imports;


public final class ProfissionalMedicina extends Funcionario
{
    IRecebeCrm codigoCrm;

    private static String crm;

    private ArrayList<Cidadao> listaPacientes = new ArrayList<>();

    //Fim do Campo de Declaração de Atributos / End of Attribute Declaration Field;


    public ProfissionalMedicina()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;

    public ProfissionalMedicina(String nome, long cpf, Date dataNascimento, Endereco endereco,

                                float salarioFixo, short expedienteSemanal, String setor, String funcao, String cargo, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone)

    {
        super(nome, cpf, dataNascimento, endereco,

                salarioFixo, expedienteSemanal, setor, funcao, cargo, email, sexualidade, sexo, dataAdmissao, telefone);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;

    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;

    public ProfissionalMedicina(String nome, long cpf, Date dataNascimento, Endereco endereco,

                                float valorConsulta, String setor, String funcao, String cargo, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone, short expedienteSemanal)
    {
        super(nome, cpf, dataNascimento, endereco,

                valorConsulta, setor, funcao, cargo, email, sexualidade, sexo, dataAdmissao, telefone, expedienteSemanal);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;

    }
    //Fim do Construtor Personalizado / Ends of Personalized Constructor;


    public String retornarCrm()
    {
        return codigoCrm.receberCrm();
    }

    public ArrayList<Cidadao> retornarListaPacientes()
    {
        return listaPacientes;
    }

    //Fim dos Métodos Retornadores / End of Getters Methods;


    public void inserirPacienteLista(Cidadao novoPaciente)
    {
        if (listaPacientes.contains(novoPaciente))
        {
            System.out.println("Já existe esse Paciente / Already exists this Paciente");
        }

        else
        {
            listaPacientes.add(novoPaciente);
        }
    }

    public void removerPacienteLista(Cidadao removerPaciente)
    {
        if (listaPacientes.contains(removerPaciente))
        {
            listaPacientes.remove(removerPaciente);
        }

        else
        {
            System.out.println("Esse Paciente não existe / This Paciente don't exists");
        }
    }
    //Fim do Métodos Modificadores / End of Setters Methods;

}
//Fim da Classe / End of Class;
