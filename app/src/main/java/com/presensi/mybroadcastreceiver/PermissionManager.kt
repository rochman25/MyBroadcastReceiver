package com.presensi.mybroadcastreceiver

import android.app.Activity
import android.content.pm.PackageManager
import android.util.Log
import androidx.core.app.ActivityCompat

object PermissionManager {
    fun check(activity: Activity, permission: String, requestCode: Int) {
        Log.d("LOG Permission",permission)
        if (ActivityCompat.checkSelfPermission(activity, permission) != PackageManager.PERMISSION_GRANTED){
            Log.d("LOG Permission", "should request here");
            ActivityCompat.requestPermissions(activity, arrayOf(permission), requestCode)
        }
    }
}