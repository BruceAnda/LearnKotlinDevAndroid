package cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.component.ComponentActivity
import cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.dialog.DialogActivity
import cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.gridview.GridActivity
import cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.layout.LayoutActivity
import cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.listview.ListViewActivity
import cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.menu.MenuActivity
import cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.progress.ProgressActivity
import cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.styleandtheme.StyleAndThemeActivity

/* *
 * @descroption: 使用View
 * @author: zhaoliang
 * @date: 2019/4/20 10:29 AM
 * @version 1.0
 */
class UseViewActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        listAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayOf(
                "基本UI控件",
                "菜单",
                "进度条",
                "对话框",
                "布局",
                "列表",
                "样式和主题",
                "网格"
        ))
    }

    override fun onListItemClick(l: ListView?, v: View?, position: Int, id: Long) {
        when (position) {
            0 -> startActivity(Intent(this, ComponentActivity::class.java))
            1 -> startActivity(Intent(this, MenuActivity::class.java))
            2 -> startActivity(Intent(this, ProgressActivity::class.java))
            3 -> startActivity(Intent(this, DialogActivity::class.java))
            4 -> startActivity(Intent(this, LayoutActivity::class.java))
            5 -> startActivity(Intent(this, ListViewActivity::class.java))
            6 -> startActivity(Intent(this, StyleAndThemeActivity::class.java))
            7 -> startActivity(Intent(this, GridActivity::class.java))
            else -> Toast.makeText(this, "没有完成呢！", Toast.LENGTH_SHORT).show()
        }
    }
}
