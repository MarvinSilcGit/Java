package br.com.dominio.api.pessoas.dados;


public abstract class Telefone
{
    private short ddi,
            ddd;

    private long numero;

    private String operadora;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public Telefone()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;

    public Telefone(short ddi, short ddd, long numero, String operadora)
    {
        this.ddi = ddi;

        this.ddd = ddd;

        this.numero = numero;

        this.operadora = operadora;
    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;


    public final String retornarNumeroCompleto()
    {
        return "DDI: " + ddi + ", DDD: " + ddd + ", Número: " + numero;
    }

    public final String retornarOperadora()
    {
        return operadora;
    }
    //Fim dos Métodos Retornadores / End of Getters Methods;


    public final void alterarOperadora(String novaOperadora)
    {
        operadora = novaOperadora;
    }

    public final void alterarNumero(short novoDdd, long novoNumero)
    {
        ddd = novoDdd;

        numero = novoNumero;
    }

    public final void alterarTelefone(short novoDdd, long novoNumero, String novaOperadora)
    {
        ddd = novoDdd;

        numero = novoNumero;

        operadora = novaOperadora;
    }
    //Fim do Métodos Modificadores / End of Setters Methods;

}
//Fim da Classe / End of Class;

