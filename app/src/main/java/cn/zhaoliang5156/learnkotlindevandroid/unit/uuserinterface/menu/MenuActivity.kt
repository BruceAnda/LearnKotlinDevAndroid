package cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.menu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import cn.zhaoliang5156.learnkotlindevandroid.R
import kotlinx.android.synthetic.main.activity_menu.*

/* *
 * @descroption:    菜单的使用
 * @author: zhaoliang
 * @date: 2019/4/20 10:33 AM
 * @version 1.0
 */
class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        /* 内容菜单 */
        btn_content_menu.setOnCreateContextMenuListener { menu, v, menuInfo ->
            menuInflater.inflate(R.menu.menu, menu)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.menu_add -> Toast.makeText(this, "添加", Toast.LENGTH_SHORT).show()
            R.id.menu_delete -> Toast.makeText(this, "删除", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }

    /**
     * 内容菜单点击
     */
    override fun onContextItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.menu_add -> Toast.makeText(this, "添加", Toast.LENGTH_SHORT).show()
            R.id.menu_delete -> Toast.makeText(this, "删除", Toast.LENGTH_SHORT).show()
        }
        return super.onContextItemSelected(item)
    }
}
