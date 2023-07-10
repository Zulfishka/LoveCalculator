package com.example.lovecalculator

import javax.inject.Inject

class DuckQuakeImpl @Inject constructor() : MakeVoice {

    override fun birdQuake(): String {
        return "Кря-кря"
    }


}