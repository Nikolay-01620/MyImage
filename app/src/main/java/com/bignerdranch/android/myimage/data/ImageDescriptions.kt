package com.bignerdranch.android.myimage.data

data class ImageDescription(
    val topDescription: String,
    val bottomDescription: String
)

val descriptions = listOf(
    ImageDescription("Верхнее описание 1", "Нижнее описание 1"),
    ImageDescription("Верхнее описание 2", "Нижнее описание 2"),
    ImageDescription("Верхнее описание 3", "Нижнее описание 3"),
    ImageDescription("Верхнее описание 4", "Нижнее описание 4"),
    ImageDescription("Верхнее описание 5", "Нижнее описание 5"),
    ImageDescription("Верхнее описание 6", "Нижнее описание 6")
)

