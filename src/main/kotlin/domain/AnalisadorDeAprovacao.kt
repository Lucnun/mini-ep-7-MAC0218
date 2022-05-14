package domain

import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao() {
    lateinit var criterio:CriterioDeAprovacao
    fun defineCriterio(criterioNovo: CriterioDeAprovacao){
        criterio=criterioNovo
    }
    fun fechaBoletim(boletim: Boletim): BoletimFechado {
        var mediaEps=boletim.mediaEPs
        var mediaMiniEps=boletim.mediaMiniEPs
        var mediaFinal=criterio.mediaFinal(boletim)
        var foiAprovado=criterio.estaAprovado(boletim)
        var boletimFechado= BoletimFechado(mediaEps,mediaMiniEps,mediaFinal,foiAprovado)
        return boletimFechado
    }
    // ---------------------------------
    //
    //      Seu código deve vir aqui
    //
    //      Defina atributos e métodos conforme especificado
    //      no arquivo de teste encontrado em
    //      'src/test/kotlin/domain/AnalisadorDeAprovacaoTest'
    //
    // ---------------------------------

}