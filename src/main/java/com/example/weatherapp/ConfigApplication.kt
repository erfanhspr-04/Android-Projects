package com.example.weatherapp

import android.app.Application
import io.github.inflationx.calligraphy3.CalligraphyConfig
import io.github.inflationx.calligraphy3.CalligraphyInterceptor
import io.github.inflationx.viewpump.ViewPump

class ConfigApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        ViewPump.init(
            ViewPump.builder()
                .addInterceptor(
                    CalligraphyInterceptor(
                        CalligraphyConfig.Builder()
                            .setDefaultFontPath("fonts/vazirmedium.ttf")
                            .setFontAttrId(android.R.attr.fontFamily)
                            .build()
                    )
                )
                .build()
        )
    }
}
