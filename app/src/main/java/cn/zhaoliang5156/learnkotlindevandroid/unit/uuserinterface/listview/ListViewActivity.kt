package cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.listview

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.listview.applist.AppListActivity
import cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.listview.arrayadapter.ArrayAdapterActivity
import cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.listview.baseadapter.BaseAdapterActivity
import cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.listview.simpleadapter.SimpleAdapterActivity

/* *
 * @descroption: ListView的使用
 * @author: zhaoliang
 * @date: 2019/5/5 5:12 PM
 * @version 1.0
 */
class ListViewActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        listAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayOf(
                "ArrayAdapter",
                "SimpleAdapter",
                "BaseAdapter",
                "AppList"
        ))
    }

    override fun onListItemClick(l: ListView?, v: View?, position: Int, id: Long) {
        when (position) {
            0 -> startActivity(Intent(this, ArrayAdapterActivity::class.java))
            1 -> startActivity(Intent(this, SimpleAdapterActivity::class.java))
            2 -> startActivity(Intent(this, BaseAdapterActivity::class.java))
            3 -> startActivity(Intent(this, AppListActivity::class.java))
            else -> Toast.makeText(this, "没有完成呢！", Toast.LENGTH_SHORT).show()
        }
    }
}
