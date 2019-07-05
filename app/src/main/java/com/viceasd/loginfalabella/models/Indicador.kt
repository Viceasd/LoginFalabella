package com.viceasd.loginfalabella.models

data class Indicador(val ivp: Ivp,
                     val euro: Euro,
                     val dolarIntercambio: DolarIntercambio,
                     val dolar: Dolar,
                     val version: String = "",
                     val libraCobre: LibraCobre,
                     val autor: String = "",
                     val utm: Utm,
                     val tpm: Tpm,
                     val fecha: String = "",
                     val uf: Uf,
                     val tasaDesempleo: TasaDesempleo,
                     val ipc: Ipc,
                     val imacec: Imacec,
                     val bitcoin: Bitcoin)