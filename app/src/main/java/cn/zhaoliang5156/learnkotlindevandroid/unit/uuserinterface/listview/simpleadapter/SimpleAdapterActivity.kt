package cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.listview.simpleadapter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SimpleAdapter
import cn.zhaoliang5156.learnkotlindevandroid.R
import kotlinx.android.synthetic.main.activity_simple_adapter.*

class SimpleAdapterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_adapter)

        val data = ArrayList<Map<String, Any>>()
        var map = HashMap<String, Any>()
        map["icon"] = R.drawable.f1
        map["name"] = "name--1"
        map["content"] = "content--1"
        data.add(map)
        map = HashMap()
        map["icon"] = R.drawable.f2
        map["name"] = "name--2"
        map["content"] = "content--2"
        data.add(map)
        map = HashMap()
        map["icon"] = R.drawable.f3
        map["name"] = "name--3"
        map["content"] = "content--3"
        data.add(map)
        map = HashMap()
        map["icon"] = R.drawable.f4
        map["name"] = "name--4"
        map["content"] = "content--4"
        data.add(map)
        map = HashMap()
        map["icon"] = R.drawable.f5
        map["name"] = "name--5"
        map["content"] = "content--5"
        data.add(map)
        map = HashMap()
        map["icon"] = R.drawable.f6
        map["name"] = "name--6"
        map["content"] = "content--6"
        data.add(map)
        map = HashMap()
        map["icon"] = R.drawable.f7
        map["name"] = "name--7"
        map["content"] = "content--7"
        data.add(map)
        map = HashMap()
        map["icon"] = R.drawable.f8
        map["name"] = "name--8"
        map["content"] = "content--8"
        data.add(map)
        map = HashMap()
        map["icon"] = R.drawable.f9
        map["name"] = "name--9"
        map["content"] = "content--9"
        data.add(map)
        map = HashMap()
        map["icon"] = R.drawable.f10
        map["name"] = "name--10"
        map["content"] = "content--10"
        data.add(map)

        val from = arrayOf("icon", "name", "content")
        val to = intArrayOf(R.id.iv_item_icon, R.id.tv_item_name, R.id.tv_item_content)

        lv_simple_adapter.adapter = SimpleAdapter(this, data, R.layout.item_simple_adapter, from, to)
    }
}
