package com.francisco.practica_doce_servicio_web_dog_api

import com.google.gson.annotations.SerializedName

data class ModeloDog(
    @SerializedName("message") var images:List<String>)
