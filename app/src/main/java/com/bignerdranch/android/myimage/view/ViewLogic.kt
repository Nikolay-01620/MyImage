package com.bignerdranch.android.myimage.view


import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.bignerdranch.android.myimage.businessIogic.Buttons
import com.bignerdranch.android.myimage.businessIogic.ImageCompose
import com.bignerdranch.android.myimage.businessIogic.TextCompose
import com.bignerdranch.android.myimage.data.descriptions
import com.bignerdranch.android.myimage.data.imageResources

@Composable
fun ViewLogic() {

    var currentIndex by rememberSaveable { mutableStateOf(0) }
    var currentImageIndex by rememberSaveable { mutableStateOf(0) }
    var currentTopDescriptionIndex by rememberSaveable { mutableStateOf(0) }
    var currentBottomDescriptionIndex by rememberSaveable { mutableStateOf(0) }


    Column {

        ImageCompose(drawableResourceId = imageResources[currentImageIndex])

        TextCompose(

            topDescription = descriptions[currentTopDescriptionIndex].topDescription,
            bottomDescription = descriptions[currentBottomDescriptionIndex].bottomDescription

        )

        Buttons(

            // синие переменные - переменные функции Buttons,
            // а белые - переменные функции ViewLogic
            // '='  нужно для присваивания значений (само значение к типу значения) из
            // файла ViewLogic(сами значения) к файлу Buttons(тип значений)
            currentIndex = currentIndex,

            imageResources = imageResources,

            // newIndex является локальной переменной функции Buttons,
            // и она вычисляется внутри onClick блока кода.
            // Затем newIndex передается в функцию onIndexChange - onIndexChange(newIndex)
            // как аргумент. it в лямбда-выражении { currentIndex = it }
            // представляет значение, переданное в onIndexChange в функции Buttons
            onIndexChange = {
                currentIndex = it
                currentImageIndex = it
                currentTopDescriptionIndex = it
                currentBottomDescriptionIndex = it
            })
    }
}