package com.bignerdranch.android.myimage.businessIogic

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ImageCompose(
    drawableResourceId: Int
) {

        Image(
            painter = painterResource(drawableResourceId),
            contentDescription = null,
            modifier = Modifier
                .padding(
                    top = 60.dp,
                    start = 50.dp,
                    end = 50.dp,
                    bottom = 70.dp
                )
                .clip(RoundedCornerShape(16.dp))
        )

}

