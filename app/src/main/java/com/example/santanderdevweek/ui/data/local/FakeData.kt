package com.example.santanderdevweek.ui.data.local

import com.example.santanderdevweek.ui.data.Cartao
import com.example.santanderdevweek.ui.data.Cliente

import com.example.santanderdevweek.ui.data.Conta

class FakeData {
    fun getLocalData() : Conta {
        val cliente = Cliente( nome = "Igor")
        val cartao = Cartao( numeroCartao = "41111-11")
        return Conta(
            numero = "44456-5",
            agencia =  "6552-4",
            saldo =  "R$2.450,80",
            limite =  "R$4.120,00",
            cliente,
            cartao

        );

    }
}