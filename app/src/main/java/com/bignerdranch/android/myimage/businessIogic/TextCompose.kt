package com.bignerdranch.android.myimage.businessIogic

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.android.myimage.data.descriptions

@Composable
fun TextCompose(
    topDescription: String, bottomDescription: String
) {

    Text(
        text = topDescription,
        modifier = Modifier

            // Поднятие текста наверх
            .offset(y = (-35).dp)
            .padding(start = 82.dp)
            .fillMaxWidth(),

        // Увеличение размера текста
        fontSize = 24.sp,
        fontFamily = FontFamily.Serif,
        fontStyle = FontStyle.Italic


    )

    Text(
        text = bottomDescription,
        modifier = Modifier
            .offset(y = (-32).dp)
            .padding(start = 82.dp)
            .fillMaxWidth(),
        fontSize = 24.sp,
        fontFamily = FontFamily.Serif,
        fontStyle = FontStyle.Italic,
    )
}
