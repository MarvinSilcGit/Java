package br.com.dominio.api.empresa.departamento;



 final class Equipamento
{
    private String nome,
            forma,
            funcao,
            caracteristicaPrincipal;

    private float valor,
            profundidade,
            altura,
            largura;

    private int quantidade;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public Equipamento()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;

    public Equipamento(String nome, String forma, String funcao, float profundidade, float altura, float largura, String caracteristicaPrincipal, float valor, int quantidade)
    {
        this.nome = nome;

        this.forma = forma;

        this.funcao = funcao;

        this.profundidade = profundidade;

        this.altura = altura;

        this.largura = largura;

        this.caracteristicaPrincipal = caracteristicaPrincipal;

        this.valor = valor;

        this.quantidade = quantidade;
    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;

    public String retornarNome()
    {
        return nome;
    }

    public String retornarForma()
    {
        return forma;
    }

    public String retornarFuncao()
    {
        return funcao;
    }

    public String retonarCaracteristicaPrincipais()
    {
        return caracteristicaPrincipal;
    }

    public float retornarValor()
    {
        return valor;
    }

    public float retornarProfundidade()
    {
        return profundidade;
    }

    public float retornarAltura()
    {
        return altura;
    }

    public float retornarLargura()
    {
        return largura;
    }

    public int retornarQuantidade()
    {
        return quantidade;
    }
    //Fim do Métodos Retornadores / End of Getter Methods;


    public void alterarNome(String novoNome)
    {
        nome = novoNome;
    }

    public void alterarForma(String novaForma)
    {
        forma = novaForma;
    }

    public void alterarFuncao(String novaFuncao)
    {
        funcao = novaFuncao;
    }

    public void alterarCaracteristicaPrincipal(String novaCaracteristica)
    {
        caracteristicaPrincipal = novaCaracteristica;
    }

    public void alterarValor(float novoValor)
    {
        valor = novoValor;
    }

    public void alterarProfundidade(float novaProfundidade)
    {
        profundidade = novaProfundidade;
    }

    public void alterarAltura(float novaAltura)
    {
        altura = novaAltura;
    }

    public void alterarLargura(float novaLargura)
    {
        largura = novaLargura;
    }

    public void alterarQuantidade(int novaQuantidade)
    {
        quantidade = novaQuantidade;
    }
    //Fim do Métodos Modificadores / End of Setters Methods;

}
//Fim da Classe / End of Class;