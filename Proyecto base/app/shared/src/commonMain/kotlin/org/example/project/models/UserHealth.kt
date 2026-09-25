package org.example.project.models
data class UserHealth(
    val peso: Double,
    val altura: Double,
    var nPasos: Int,
){
    fun imc() : Double {
        return peso * (altura * altura)
    }
}