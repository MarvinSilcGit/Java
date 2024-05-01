package br.com.dominio.api.pessoas;


import java.util.Date;

import br.com.dominio.api.pessoas.dados.TelefonePessoaFisica;

import br.com.dominio.api.pessoas.dados.Endereco;

//Fim dos imports / End of imports;


public abstract class Funcionario extends Cidadao
{
    private float salarioFixo,
            salarioProdutividade;

    private short expedienteSemanal;

    private String setor,
            funcao,
            cargo,
            email,
            sexualidade,
            sexo;

    private Date dataAdmissao;

    private TelefonePessoaFisica telefone;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public Funcionario ()
    {

    }
    //Fim do Construtor padrão / End of Default Constructor;


    public Funcionario (String nome, long cpf, Date dataNascimento, Endereco endereco,

                        float salarioFixo, short expedienteSemanal, String setor, String funcao, String cargo, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone)

    {
        super (nome, cpf, dataNascimento, endereco);

        //Fim do Método Super da classe mãe / End of Parent Class's Super Method;


        this.salarioFixo = salarioFixo;

        this.expedienteSemanal = expedienteSemanal;

        this.setor = setor;

        this.funcao = funcao;

        this.cargo = cargo;

        this.email = email;

        this.sexualidade = sexualidade;

        this.sexo = sexo;

        this.dataAdmissao = dataAdmissao;

        this.telefone = telefone;
    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;


    public Funcionario (String nome, long cpf, Date dataNascimento, Endereco endereco,

                        float salarioProdutividade, String setor, String funcao, String cargo, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone, short expedienteSemanal)

    {
        super(nome, cpf, dataNascimento, endereco);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;


        this.salarioProdutividade = salarioProdutividade;

        this.expedienteSemanal = expedienteSemanal;

        this.setor = setor;

        this.funcao = funcao;

        this.cargo = cargo;

        this.email = email;

        this.sexualidade = sexualidade;

        this.sexo = sexo;

        this.dataAdmissao = dataAdmissao;

        this.telefone = telefone;
    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;


    public final float retornarSalarioFixo()
    {
        return salarioFixo;
    }

    public final float retornarSalarioProdutividade()
    {
        return salarioProdutividade;
    }

    public final short retornarExpedienteSemanal()
    {
        return expedienteSemanal;
    }

    public final String retornarSetor()
    {
        return setor;
    }

    public final String retornarFuncao()
    {
        return funcao;
    }

    public final String retornarCargo()
    {
        return cargo;
    }

    public final String retornarEmail()
    {
        return email;
    }

    public final String retornarSexualidade()
    {
        return sexualidade;
    }

    public final String retornarSexo()
    {
        return sexo;
    }

    public final Date retornarDataAdmissao()
    {
        return dataAdmissao;
    }

    public final TelefonePessoaFisica retornarTelefonePessoaFisica()
    {
        return telefone;
    }
    //Fim dos Métodos Retornadores / End of Getters Methods;


    public final void alterarSalarioFixo(float novoSalario)
    {
        salarioFixo = novoSalario;
    }

    public final void alterarSalarioProdutividade(float novoSalario)
    {
        salarioProdutividade = novoSalario;
    }

    public final void alterarExpedienteSemanal(short novoHorario)
    {
        expedienteSemanal = novoHorario;
    }

    public final void alterarSetor(String novoSetor)
    {
        setor = novoSetor;
    }

    public final void alterarFuncao(String novaFuncao)
    {
        funcao = novaFuncao;
    }

    public final void alterarCargo(String novoCargo)
    {
        cargo = novoCargo;
    }

    public final void alterarEmail(String novoEmail)
    {
        email = novoEmail;
    }

    public final void alterarTelefone(TelefonePessoaFisica novoTelefone)
    {
        telefone = novoTelefone;
    }
    //Fim do Métodos Modificadores / End of Setters Methods;

}
//Fim da Classe / End of Class;
