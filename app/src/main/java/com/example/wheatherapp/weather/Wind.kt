package com.example.wheatherapp.weather

import java.io.Serializable

data class Wind(
    val speed: Double,
    val deg: Int
): Serializable
