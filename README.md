AppOps Launcher
===============

![License](https://img.shields.io/badge/license-MIT-blue.svg "License")
![Release](https://img.shields.io/badge/release-1.0-blue.svg "Release")

This is just a launcher for App Ops that is present in Android 4.3 and 4.4.x, and this doesn't work on all devices, and for some devices it will require root for some it will work without root.

App Ops is a new feature introduced by Android 4.3 to manage permissions of apps. It can help you to secure your android device and protect your privacy.

If you find a device that this works on, tell me so I can add it to the list.

|    API    	| 18 (Jelly Bean 4.3)                                                     |  19 (KitKat 4.4–4.4.4)                                              | 21 (Lollipop 5.0)                                                  | 22 (Lollipop 5.1)                                                  |
|:---------:	|:-----------------------------------------------------------------------:|:------------------------------------------------------------------:	|:-----------------------------------------------------------------: |:-----------------------------------------------------------------: |
|   One+   	    | ![Root](https://img.shields.io/badge/ROOT-not%20required-blue.svg)      |  ![Root](https://img.shields.io/badge/ROOT-not%20required-blue.svg)	| ![Root](https://img.shields.io/badge/ROOT-unknown-yellowgreen.svg) | ![Root](https://img.shields.io/badge/ROOT-unknown-yellowgreen.svg) |
|   Galaxy S4 	| ![Root](https://img.shields.io/badge/ROOT-not%20required-blue.svg)      |  ![Root](https://img.shields.io/badge/ROOT-not%20required-blue.svg) | ![Root](https://img.shields.io/badge/ROOT-not%20required-blue.svg) | ![Root](https://img.shields.io/badge/ROOT-unknown-yellowgreen.svg) |
|   Note 4      | ![Root](https://img.shields.io/badge/ROOT-required-red.svg)             |  ![Root](https://img.shields.io/badge/ROOT-required-red.svg)        | ![Root](https://img.shields.io/badge/ROOT-required-red.svg)        | ![Root](https://img.shields.io/badge/ROOT-unknown-yellowgreen.svg) |
|   Nexus 7   	| ![Root](https://img.shields.io/badge/ROOT-required-red.svg)             |  ![Root](https://img.shields.io/badge/ROOT-required-red.svg)        | ![Root](https://img.shields.io/badge/ROOT-required-red.svg)        | ![Root](https://img.shields.io/badge/ROOT-unknown-yellowgreen.svg) |


Shell
-----
```
am start -n com.android.settings/com.android.settings.SubSettings -e :android:show_fragment "com.android.settings.applications.AppOpsSummary"
```

Devices
-------

If it works on your device without root just run the following command
```
adb logcat -s "AppOps"
```

And you will see a line similar to the one bellow, send it to me and I will add it to the list of working ones.

```
Manufacturer: samsung, Board: universal5410, Brand: samsung, Model: GT-I9500
Manufacturer: samsung, Board: universal5410, Brand: samsung, Model: GT-I9505
Manufacturer: asus, Board: grouper, Brand: google, Model: Nexus 7
```
      
Archive Versions
----------------
* [1.0.0](http://files.matoski.com/appopslauncher/releases/appopslauncher-1.0.0-release.apk)

License
-------

The MIT License (MIT)

Copyright (c) 2015 Ilija Matoski

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.