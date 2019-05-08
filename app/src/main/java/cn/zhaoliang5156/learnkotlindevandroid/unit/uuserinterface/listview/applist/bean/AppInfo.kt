package cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.listview.applist.bean

import android.graphics.drawable.Drawable

/**
 * Copyright (C), 2015-2019, 八维集团
 * Author: zhaoliang
 * Date: 2019/5/6 8:53 AM
 * Description:
 */
class AppInfo {
    var icon: Drawable? = null
    var appName: String? = null
    var packageName: String? = null

    constructor(icon: Drawable?, appName: String?, packageName: String?) {
        this.icon = icon
        this.appName = appName
        this.packageName = packageName
    }

    constructor()

    override fun toString(): String {
        return "AppInfo(icon=$icon, appName=$appName, packageName=$packageName)"
    }

}