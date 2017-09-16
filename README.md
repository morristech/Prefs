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
        Prefs.put(this, "name", "Trump"); //string
        Prefs.put(this, "age",71f); //float
        Prefs.put(this, "isPresident", true); //boolean
```
Retrieve above variables:
```java
        String name = Prefs.getString(this, "name", "default");
        float age = Prefs.getFloat(this, "age", 0f);
        boolean isPresident = Prefs.getBoolean(this, "isPresident", false);
```
Save double data type:
```java
        double a = 123123.123;
        Prefs.put(this, "someDouble", a); //double
        double someDouble = Prefs.getDouble(this, "someDouble", 0);
```

[License](/LICENSE)
