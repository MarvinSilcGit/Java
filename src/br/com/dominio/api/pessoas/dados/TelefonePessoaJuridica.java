package br.com.dominio.api.pessoas.dados;


public final class TelefonePessoaJuridica extends Telefone
{
    private long cnpjVinculado;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public TelefonePessoaJuridica()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;


    public TelefonePessoaJuridica(short ddd, short ddi, long numero, String operadora,

                                  long cnpjVinculado)

    {
        super(ddi, ddd, numero, operadora);

        //Fim do Método Super da Classe Mãe / Enf of Parent Class's Super Method;


        this.cnpjVinculado = cnpjVinculado;
    }
    //Fim do Construtor personalizado / End of Personalized Constructor;


    public long retonarCnpjVinculado()
    {
        return cnpjVinculado;
    }

    //Fim dos Métodos Retornadores / End of Getters Methods;


    public void alterarCnpjVinculado(long novoCnpj)
    {
        cnpjVinculado = novoCnpj;
    }
    //Fim do Métodos Modificadores / End of Setters Methods;

}
//Fim da Classe  / End of Class;
