package com.viceasd.loginfalabella.data.dto

class IndicadorDto {
    var nombre: String = ""
    var valor: String = ""

    constructor() {}

    constructor(nombre: String, valor: String) {
        this.nombre = nombre
        this.valor = valor
    }
}