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
