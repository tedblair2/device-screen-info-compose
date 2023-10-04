package com.github.tedblair2.devicescreeninfo

import androidx.compose.ui.unit.Dp

sealed class ScreenType(val width: Dp, val height: Dp){
    class PhonePortrait(width: Dp, height: Dp): ScreenType(width, height)
    class PhoneLandscape(width: Dp, height: Dp): ScreenType(width, height)
    class TabletPortrait(width: Dp, height: Dp): ScreenType(width, height)
    class TabletLandscape(width: Dp, height: Dp): ScreenType(width, height)
}