package br.com.dominio.hospital;


import java.util.ArrayList;

import br.com.dominio.api.empresa.Empresa;

import br.com.dominio.api.pessoas.Funcionario;

import br.com.dominio.api.pessoas.dados.Endereco;

import br.com.dominio.api.pessoas.dados.TelefonePessoaJuridica;

import br.com.dominio.api.empresa.departamento.Departamento;

//Fim dos Imports / End of Imports;


public final class HospitalCardial extends Empresa
{
    private ArrayList<Departamento> listaAlas = new ArrayList<>();

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public HospitalCardial()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;

    public HospitalCardial(String razaoSocial, String nomeFantasia, double capitalSocial, long cnpj, Funcionario presidente, Funcionario vicePresidente,

                           Endereco endereco, TelefonePessoaJuridica telefone)

    {
        super(razaoSocial, nomeFantasia, capitalSocial, cnpj, presidente, vicePresidente, endereco, telefone);

        //Fim do Método Super da classe mãe / End of Parent Class's Super Method;

    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;

}
//Fim da Classe / End of Class;
