package cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.layout

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.layout.framelayout.FrameLayoutActivity
import cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.layout.linearlayout.LinearLayoutActivity
import cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.layout.relativelayout.RelativeLayoutActivity

/* *
 * @descroption: Android中布局的使用
 * @author: zhaoliang
 * @date: 2019/5/5 4:55 PM
 * @version 1.0
 */
class LayoutActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 设置布局适配器
        listAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayOf(
                "线性布局",
                "相对布局",
                "帧布局"
        ))
    }

    /**
     * 列表项点击事件
     */
    override fun onListItemClick(l: ListView?, v: View?, position: Int, id: Long) {
        when (position) {
            0 -> startActivity(Intent(this, LinearLayoutActivity::class.java))      // 跳转到线性布局
            1 -> startActivity(Intent(this, RelativeLayoutActivity::class.java))    // 跳转到相对布局
            2 -> startActivity(Intent(this, FrameLayoutActivity::class.java))       // 跳转到帧布局
            else -> Toast.makeText(this, "没有实现呢！", Toast.LENGTH_SHORT).show()    // 提示
        }
    }
}
