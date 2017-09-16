[![](https://jitpack.io/v/AbduazizKayumov/Prefs.svg)](https://jitpack.io/#AbduazizKayumov/Prefs)

# Prefs
Easy to use [Android SharedPreferences](https://developer.android.com/reference/android/content/SharedPreferences.html) wrapper library with double data type saving.

## Setup
**Step 1.** Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
**Step 2.** Add the dependency
```
	dependencies {
	        compile 'com.github.AbduazizKayumov:Prefs:v1.0'
	}
```
## Usage
Save primitive data types:
```java
        Prefs.put(context, "name", "Trump"); //string
        Prefs.put(context, "age",71f); //float
        Prefs.put(context, "isPresident", true); //boolean
```
Retrieve above variables:
```java
        String name = Prefs.getString(context, "name", "default");
        float age = Prefs.getFloat(context, "age", 0f);
        boolean isPresident = Prefs.getBoolean(context, "isPresident", false);
```
Save double data type:
```java
        double a = 123123.123;
        Prefs.put(context, "someDouble", a); //double
        double someDouble = Prefs.getDouble(context, "someDouble", 0);
```
See more [here](https://github.com/AbduazizKayumov/Prefs/blob/master/app/src/main/java/com/abduaziz/sample/MainActivity.java) 

[License](/LICENSE)
