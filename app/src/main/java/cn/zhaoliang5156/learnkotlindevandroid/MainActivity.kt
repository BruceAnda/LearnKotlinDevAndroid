package cn.zhaoliang5156.learnkotlindevandroid

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import cn.zhaoliang5156.learnkotlindevandroid.unit.uactivity.UseActivity
import cn.zhaoliang5156.learnkotlindevandroid.unit.uquickstart.HelloWorldActivity
import cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.UseViewActivity

/* *
 * @descroption: 程序主界面
 * @author: zhaoliang
 * @date: 2019/4/17 9:22 AM
 * @version 1.0
 */
class MainActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 设置列表适配器
        listAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayOf(
                "快速入门",
                "Activity",
                "用户界面",
                "数据存储",
                "消息机制与异步任务",
                "事件机制",
                "Service",
                "BroadcastReceiver",
                "ContentProvider",
                "动画",
                "图像处理",
                "Fragment",
                "MVC/MVP/MVVM"
        ))
    }

    /**
     * 列表项点击事件
     */
    override fun onListItemClick(l: ListView?, v: View?, position: Int, id: Long) {
        // 跳转到对应的Activity界面
        when (position) {
            0 -> startActivity(Intent(this, HelloWorldActivity::class.java))
            1 -> startActivity(Intent(this, UseActivity::class.java))
            2 -> startActivity(Intent(this, UseViewActivity::class.java))
            else -> Toast.makeText(this, "没有开发完成呢！", Toast.LENGTH_SHORT).show()
        }
    }
}
