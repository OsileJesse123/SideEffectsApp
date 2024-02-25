package com.jesse.sideeffectsapp.launched_effect

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jesse.sideeffectsapp.R
import com.jesse.sideeffectsapp.ui.theme.SideEffectsAppTheme
import kotlinx.coroutines.delay

@Composable
fun LaunchedEffectScreen(
    onTimeout: () -> Unit = {}
) {

    LaunchedEffect(Unit){
        delay(2_000L)
        onTimeout()
    }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.favorite_icon),
            contentDescription = "favorite icon",
            modifier = Modifier
                .wrapContentSize()
                .width(100.dp)
                .height(100.dp)
        )
    }

}

@Preview
@Composable
fun LaunchedEffectScreenPreview() {
    SideEffectsAppTheme {
        LaunchedEffectScreen()
    }
}