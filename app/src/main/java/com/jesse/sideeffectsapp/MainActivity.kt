package com.jesse.sideeffectsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jesse.sideeffectsapp.launched_effect.LaunchedEffectScreen
import com.jesse.sideeffectsapp.ui.theme.SideEffectsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SideEffectsAppTheme {
                // A surface container using the 'background' color from the theme
                MainScreen(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.background),
                )
            }
        }
    }
}

@Composable
fun MainScreen(
    modifier: Modifier = Modifier
){
    var showLaunchedEffectScreen by remember {
        mutableStateOf(true)
    }

    if(showLaunchedEffectScreen){
        LaunchedEffectScreen(onTimeout = {showLaunchedEffectScreen = false})
    } else{
        Surface(
            modifier = modifier.fillMaxSize()
        ) {

            Text(text = "Home Screen")

        }
    }
}