[![forthebadge](https://forthebadge.com/images/badges/built-with-love.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/powered-by-water.svg)](https://forthebadge.com)
# AnyNum
You can convert all numbers between English, Persian, and Arabic using this library.
It's simple and reliable and you are able to use it for any platform using Java/Kotlin.

## Getting started
### Dependency
#### Step 1
Add the **JitPack** repository in your root `build.gradle` at the end of repositories:
```groovy
allprojects {
	repositories {
		//Other repositories...
		maven { url 'https://jitpack.io' }
	}
}
```
#### Step 2
Add the **dependency**:
```groovy
dependencies {
  implementation 'com.github.ALI-KH-Y:AnyNum:v2.0'
}
```

### **Usage** - Convert to Persian
#### English Number to Persian
Simple and clean, just using below line:
```java
String faStr = AnyNum.enToFa("This is 0123456789");
// This is ۰۱۲٣۴۵۶۷۸٩
```
#### English/Arabic Number to Persian
This converts both English and Arabic numbers to Persian:
```java
String faStr = AnyNum.anyToFa("This is 0123456789 and ٠١٢٣٤٥٦٧٨٩");
// This is ۰۱۲٣۴۵۶۷۸٩ and ۰۱۲٣۴۵۶۷۸٩
```
#### English Number to Persian (ONLY NUMBER)
If you care about ultra high speed, then you can use this method:
```java
// input string must ONLY have numbers
String faNumStr = AnyNum.enNumToFa("0123456789");
// ۰۱۲٣۴۵۶۷۸٩
```


### **Usage** - Convert to Arabic
#### English Number to Arabic
Simple and clean, just using below line:
```java
String arStr = AnyNum.enToAr("This is 0123456789");
// This is ٠١٢٣٤٥٦٧٨٩
```
#### English/Persian Number to Arabic
This converts both English and Persian numbers to Arabic:
```java
String arStr = AnyNum.anyToAr("This is 0123456789 and ۰۱۲٣۴۵۶۷۸٩");
// This is ٠١٢٣٤٥٦٧٨٩ and ٠١٢٣٤٥٦٧٨٩
```
#### English Number to Arabic (ONLY NUMBER)
If you care about ultra high speed, then you can use this method: 
```java
// input string must ONLY have numbers
String arNumStr = AnyNum.enNumToAr("0123456789");
// ٠١٢٣٤٥٦٧٨٩
```


## Licence
    MIT License

    Copyright (c) 2019 Ali Khaleqi Yekta

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
