package com.example.currencyapp.main

import com.example.currencyapp.data.models.CurrencyResponse
import com.example.currencyapp.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>

}