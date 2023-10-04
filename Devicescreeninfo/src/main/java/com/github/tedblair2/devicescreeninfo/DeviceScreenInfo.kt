package com.github.tedblair2.devicescreeninfo

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp

@Composable
fun rememberDeviceScreenInfo(): ScreenType {
    val configuration= LocalConfiguration.current
    val width=configuration.screenWidthDp.dp
    val height=configuration.screenHeightDp.dp

    return when{
        height<480.dp-> ScreenType.PhoneLandscape(width, height)
        width >=600.dp->{
            if (width<840.dp || height>=900.dp){
                ScreenType.TabletPortrait(width, height)
            }else{
                ScreenType.TabletLandscape(width, height)
            }
        }
        else->{
            if (height>=480.dp){
                ScreenType.PhonePortrait(width, height)
            }else{
                ScreenType.PhoneLandscape(width, height)
            }
        }
    }
}