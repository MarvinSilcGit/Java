package br.com.dominio.api.pessoas.dados.regulador.crm;



import br.com.dominio.api.pessoas.dados.ProfissionaisSaude.crm.IRecebeCrm;

//Fim dos Imports / End of Imports;


public final class EnviaCrm implements IRecebeCrm
{
    private IRecebeDadosProfissional crm;

    private String dadosCrm;

    //Fim do Campo de Declaração de Atributos / End of Attribute Declaration Field;


    @Override
    public String receberCrm()
    {

        return "s";
    }


}
//Fim da Classe / End of Class;