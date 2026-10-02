package org.example.project.models
data class GaleriaArte(
    val id: Int,
    val titulo: String,
    val artista: String,
    val añoCreacion: Int,
    val descripcion: String

){
    fun categoriaObra():String{
        if (añoCreacion < 1900){
            return "la obra es historica"
        }else
            return "La obra es antigua"
    }
}