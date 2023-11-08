package com.bignerdranch.android.myimage.businessIogic

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Buttons(
    currentIndex: Int,
    imageResources: List<Int>,

    /* этот параметр в функции Buttons служит
    не только для связи файлов,
    но и для определения действия,
    которое должно выполняться при
    нажатии на кнопки "Previous" и "Next".
    Этот параметр представляет функцию,
    которая изменяет состояние вашего приложения,
    а именно currentImageIndex */
    onIndexChange: (Int) -> Unit,

    modifier: Modifier = Modifier

) {

    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {

        Button(
            onClick = {

                /* currentIndex по умолчанию = 0.
                Тоесть 0 - 1 = -1
                Дальше : -1 + imageResources.size(тоесть 6) = 5
                Дальше : 5 % imageResources.size(тоесть 6) = 5
                Результат onIndexChange(newIndex (тоесть 5))
                5 - это индекс последнего изображения,тоесть шестого */
                val newIndex = (currentIndex - 1 + imageResources.size) % imageResources.size
                onIndexChange(newIndex)
            }
        ) {
            Text("Previous")
        }

        Button(
            onClick = {

                // currentIndex этого файла приравнивается к
                // currentIndex функции ViewLogic,таким
                // образом задается значение(0 по умолчанию)

                // затем newIndex передается как агрумент в onIndexChange в
                // функции ViewLogic в виде it,чтобы присвоить значение newIndex
                // к currentIndex функции ViewLogic,таким
                // образом выражение  (currentIndex + 1) % imageResources.size передается в
                // ViewLogic и происходит вычисление
                val newIndex = (currentIndex + 1) % imageResources.size
                onIndexChange(newIndex)
            }
        ) {
            Text("Next")
        }
    }
}
