package cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.listview.baseadapter.bean

/**
 * Copyright (C), 2015-2019, 八维集团
 * Author: zhaoliang
 * Date: 2019/5/5 5:21 PM
 * Description:
 */
class ShopInfo {
    var icon: Int = 0
    var name: String? = null
    var content: String? = null

    constructor(icon: Int, name: String, content: String) {
        this.icon = icon
        this.name = name
        this.content = content
    }

    constructor()

    override fun toString(): String {
        return ("ShopInfo [icon=" + icon + ", name=" + name + ", content="
                + content + "]")
    }
}