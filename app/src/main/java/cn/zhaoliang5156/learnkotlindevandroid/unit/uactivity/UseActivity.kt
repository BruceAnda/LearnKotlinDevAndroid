package cn.zhaoliang5156.learnkotlindevandroid.unit.uactivity

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import cn.zhaoliang5156.learnkotlindevandroid.unit.uactivity.useactivity.launchmode.BackStackAndLunchModeActivity
import cn.zhaoliang5156.learnkotlindevandroid.unit.uactivity.useactivity.phoneandsms.PhoneAndSmsActivity
import cn.zhaoliang5156.learnkotlindevandroid.unit.uactivity.useactivity.startandfinish.StartActivity
import cn.zhaoliang5156.learnkotlindevandroid.unit.uactivity.useactivity.stateandlifecycle.StateAndLifecycleActivity

/* *
 * @descroption: Activity 相关的知识点
 * @author: zhaoliang
 * @date: 2019/4/17 10:33 AM
 * @version 1.0
 */
class UseActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 设置列表适配器
        listAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayOf(
                "启动和关闭",
                "四种状态与生命周期",
                "回退栈与启动模式",
                "打电话和发短信"
        ))
    }

    // 列表项点击事件
    override fun onListItemClick(l: ListView?, v: View?, position: Int, id: Long) {
        when (position) {
            0 -> startActivity(Intent(this, StartActivity::class.java))
            1 -> startActivity(Intent(this, StateAndLifecycleActivity::class.java))
            2 -> startActivity(Intent(this, BackStackAndLunchModeActivity::class.java))
            3 -> startActivity(Intent(this, PhoneAndSmsActivity::class.java))
            else -> Toast.makeText(this, "暂时没有实现呢！", Toast.LENGTH_SHORT).show()
        }
    }
}
