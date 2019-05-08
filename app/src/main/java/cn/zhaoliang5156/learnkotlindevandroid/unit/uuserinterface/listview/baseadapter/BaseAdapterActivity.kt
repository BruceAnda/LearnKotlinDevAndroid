package cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.listview.baseadapter

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import cn.zhaoliang5156.learnkotlindevandroid.R
import cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.listview.baseadapter.bean.ShopInfo
import kotlinx.android.synthetic.main.activity_base_adapter.*

class BaseAdapterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_adapter)

        lv_base_adapter.adapter = MyAdapter(this)
    }

    class MyAdapter : BaseAdapter {
        var data = ArrayList<ShopInfo>()
        var context: Context? = null

        constructor(context: Context) : super() {
            this.context = context
            data.add(ShopInfo(R.drawable.f1, "name--1", "content--1"))
            data.add(ShopInfo(R.drawable.f2, "name--2", "content--2"))
            data.add(ShopInfo(R.drawable.f3, "name--3", "content--3"))
            data.add(ShopInfo(R.drawable.f4, "name--4", "content--4"))
            data.add(ShopInfo(R.drawable.f5, "name--5", "content--5"))
            data.add(ShopInfo(R.drawable.f6, "name--6", "content--6"))
            data.add(ShopInfo(R.drawable.f7, "name--7", "content--7"))
            data.add(ShopInfo(R.drawable.f8, "name--8", "content--8"))
            data.add(ShopInfo(R.drawable.f9, "name--9", "content--9"))
            data.add(ShopInfo(R.drawable.f10, "name--10", "content--10"))
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var viewHolder: ViewHolder
            var view: View
            if (convertView == null) {
                view = View.inflate(context, R.layout.item_simple_adapter, null)
                viewHolder = ViewHolder(view)
                view.tag = viewHolder
            } else {
                view = convertView
                viewHolder = view.tag as ViewHolder
            }

            val shopInfo = data[position]
            viewHolder.ivIcon.setImageResource(shopInfo.icon)
            viewHolder.tvName.text = shopInfo.name
            viewHolder.tvContent.text = shopInfo.content

            return view
        }

        override fun getItem(position: Int): Any {
            return data[position]
        }

        override fun getItemId(position: Int): Long {
            return 0
        }

        override fun getCount(): Int {
            return data.size
        }

        class ViewHolder(itemView: View) {
            var ivIcon: ImageView = itemView.findViewById(R.id.iv_item_icon)
            var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
            var tvContent: TextView = itemView.findViewById(R.id.tv_item_content)
        }
    }
}
