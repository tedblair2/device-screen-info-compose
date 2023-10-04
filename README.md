# device-screen-info-compose
This is an Android compose library that provides a convenient way to retrieve and categorize information about a device's screen size and orientation.

## Table of Contents
* [Installation](https://github.com/tedblair2/device-screen-info-compose/blob/main/README.md#installation)
* Usage
* Examples

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
