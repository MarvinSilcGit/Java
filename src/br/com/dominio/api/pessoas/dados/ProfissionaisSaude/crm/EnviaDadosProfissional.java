package br.com.dominio.api.pessoas.dados.ProfissionaisSaude.crm;


import br.com.dominio.api.pessoas.dados.regulador.crm.IRecebeDadosProfissional;

//Fim dos Imports / End of Imports;


public final class EnviaDadosProfissional implements IRecebeDadosProfissional
{
    private ProfissionalMedicina profissionalMedicina;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    @Override
    public String nomeProfissional()
    {
        return profissionalMedicina.retornarNome();
    }

    @Override
    public long cpfProfissional()
    {
        return profissionalMedicina.retornarCpf();
    }

    @Override
    public String enderecoProfissional()
    {
        return profissionalMedicina.retornarEndereco();
    }

    @Override
    public String setorProfissional()
    {
        return profissionalMedicina.retornarSetor();
    }

    @Override
    public String funcaoProfissional()
    {
        return profissionalMedicina.retornarFuncao();
    }

    @Override
    public String cargoProfissional()
    {
        return profissionalMedicina.retornarCargo();
    }

    @Override
    public String emailProfissional()
    {
        return profissionalMedicina.retornarEmail();
    }

    @Override
    public String sexualidadeProfissional()
    {
        return profissionalMedicina.retornarSexualidade();
    }

    @Override
    public String sexoProfissional()
    {
        return profissionalMedicina.retornarSexo();
    }

    @Override
    public String telefoneProfissional()
    {
        return profissionalMedicina.retornarTelefonePessoaFisica().retornarNumeroCompleto();
    }
    //Fim do Métodos Override / End of Override Methods;

}
//Fim da Classe / End of Class;