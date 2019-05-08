package cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.gridview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import cn.zhaoliang5156.learnkotlindevandroid.R
import kotlinx.android.synthetic.main.activity_grid.*

/* *
 * @descroption: 九宫格
 * @author: zhaoliang
 * @date: 2019/5/8 9:14 AM
 * @version 1.0
 */
class GridActivity : AppCompatActivity() {

    var names = arrayOf("手机防盗", "通讯卫士", "软件管理", "流量管理", "进程管理",
            "手机杀毒", "缓存清理", "高级工具", "设置中心")
    var icons = intArrayOf(R.drawable.widget01, R.drawable.widget02,
            R.drawable.widget03, R.drawable.widget04, R.drawable.widget05,
            R.drawable.widget06, R.drawable.widget07, R.drawable.widget08,
            R.drawable.widget09)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)

        gv_grid.adapter = GridAdapter()

        gv_grid.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, names[position], Toast.LENGTH_SHORT).show()
        }
    }

    /**
     * 适配器
     */
    inner class GridAdapter : BaseAdapter() {
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var viewHolder: ViewHolder
            var view: View
            if (convertView == null) {
                view = View.inflate(this@GridActivity, R.layout.item_grid_layout, null);
                viewHolder = ViewHolder(view)
                view.tag = viewHolder
            } else {
                view = convertView
                viewHolder = view.tag as ViewHolder
            }
            viewHolder.ivIcon.setImageResource(icons[position])
            viewHolder.tvName.text = names[position]
            return view
        }

        override fun getItem(position: Int): Any {
            return names[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return names.size
        }

        inner class ViewHolder(itemView: View) {
            var ivIcon: ImageView = itemView.findViewById(R.id.iv_item_icon)
            var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        }
    }
}
