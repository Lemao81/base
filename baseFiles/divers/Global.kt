package com.jueggs.babylock

import android.os.Build

fun isEclairOrAbove() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR
fun isLollipopOrAbove() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP
fun isMarshmallowOrAbove() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
fun isNougatOrAbove() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.N
fun isOreoOrAbove() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O