package com.mustaq.hilt_demo.mainApp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//provide to hilt in android app
@HiltAndroidApp
class MainApp :Application()