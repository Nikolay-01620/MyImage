package com.bignerdranch.android.myimage.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.bignerdranch.android.myimage.ui.theme.MyImageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyImageTheme {
                ViewLogic()
            }
        }
    }
}


