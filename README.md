# device-screen-info-compose
This is an Android compose library that provides a convenient way to retrieve and categorize information about a device's screen size and orientation.

## Table of Contents
* [Installation](https://github.com/tedblair2/device-screen-info-compose/blob/main/README.md#installation)
* [Usage](https://github.com/tedblair2/device-screen-info-compose/blob/main/README.md#usage)
* [Example](https://github.com/tedblair2/device-screen-info-compose/blob/main/README.md#example)

## Installation
In order to use this library in your application, follow these steps:
1. Open your project's build.gradle file. and add the following dependency:
  ```kotlin
  dependencies {
	implementation 'com.github.tedblair2:device-screen-info-compose:1.0'
}
```
2. Open your project's settings.gradle file and add the following:
```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```
3. Sync your project with the updated Gradle files.

## Usage
The core function provided by this library is `rememberDeviceScreenInfo()`, which returns an instance of `ScreenType`.
This object represents the current device's screen type based on its dimensions and orientation.
The ScreenType class has four possible subclasses:
* `PhonePortrait`: Represents a phone in portrait orientation.
* `PhoneLandscape`: Represents a phone in landscape orientation.
* `TabletPortrait`: Represents a tablet in portrait orientation.
* `TabletLandscape`: Represents a tablet in landscape orientation.

To use this library, simply call `rememberDeviceScreenInfo()` in your Composable function to obtain the current screen information.

```kotlin
@Composable
fun MyComposable() {
    val screenInfo = rememberDeviceScreenInfo()
    // ...
}
```
## Example
Here is an example of how you could use the library in your composable
```kotlin
@Composable
fun ExampleComposable() {
    val screenInfo = rememberDeviceScreenInfo()
    val width = screenInfo.width
    val height = screenInfo.height
    val text = when (screenInfo) {
        is ScreenType.PhoneLandscape -> "phone_landscape"
        is ScreenType.PhonePortrait -> "phone_portrait"
        is ScreenType.TabletPortrait -> "tablet_portrait"
        is ScreenType.TabletLandscape -> "tablet_landscape"
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = text, fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Text(text = "Width:${width.toString()}", fontSize = 25.sp)
        Text(text = "Height:${height.toString()}", fontSize = 25.sp)
    }
}
```
The width and height values are in `DP` value, a measuring unit used in Jetpack compose.

Here are the results in a Nexus 7 Tablet emulator.
* In Landscape Mode
  
![Screenshot_20231004_201715](https://github.com/tedblair2/device-screen-info-compose/assets/39332527/534d94ad-dd71-4e87-b8e6-b556e4f209b6)

 * In Portrait Mode

![Screenshot_20231004_201830](https://github.com/tedblair2/device-screen-info-compose/assets/39332527/b1a61466-0f52-456b-8de4-8a10a7e303e9)

And the screenshots below show the result in Samsung A23 phone
* In Landscape Mode
* In Portrait Mode
