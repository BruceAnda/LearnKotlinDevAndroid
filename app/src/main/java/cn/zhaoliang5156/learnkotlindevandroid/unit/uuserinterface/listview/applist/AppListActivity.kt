package cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.listview.applist

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import cn.zhaoliang5156.learnkotlindevandroid.R
import cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.listview.applist.bean.AppInfo
import kotlinx.android.synthetic.main.activity_app_list.*

/* *
 * @descroption: 手机中的app列表
 * @author: zhaoliang
 * @date: 2019/5/6 8:52 AM
 * @version 1.0
 */
class AppListActivity : AppCompatActivity() {

    var data: ArrayList<AppInfo>? = null

    private var myAdapter: MyAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_list)

        myAdapter = MyAdapter(this)
        lv_app_list.adapter = myAdapter

        lv_app_list.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, data!![position].appName, Toast.LENGTH_SHORT).show()
        }

        lv_app_list.setOnItemLongClickListener { parent, view, position, id ->
            data!!.remove(data!![position])
            myAdapter!!.notifyDataSetChanged()
            return@setOnItemLongClickListener true
        }
    }

    /**
     * 获取手机中app列表
     */
    fun getAllAppInfos(): ArrayList<AppInfo>? {
        var appInfos = ArrayList<AppInfo>()

        // 要查询的Intent对象
        val intent = Intent()
        intent.action = Intent.ACTION_MAIN
        intent.addCategory(Intent.CATEGORY_LAUNCHER)

        // 通过packageManager查询Intent
        val activities = packageManager.queryIntentActivities(intent, 0)

        // 编辑结果转换成集合
        for (activity in activities) {
            val appInfo = AppInfo(activity.loadIcon(packageManager), activity.loadLabel(packageManager) as String, activity.activityInfo.packageName)

            appInfos.add(appInfo)
        }
        return appInfos
    }

    inner class MyAdapter : BaseAdapter {

        var context: Context? = null

        constructor(context: Context?) : super() {
            this.context = context
            data = getAllAppInfos()
        }


        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var viewHolder: ViewHolder
            var view: View
            if (convertView == null) {
                view = View.inflate(context, R.layout.item_app_list, null)
                viewHolder = ViewHolder(view)
                view.tag = viewHolder
            } else {
                view = convertView
                viewHolder = view.tag as ViewHolder
            }
            val appInfo = data!![position]
            viewHolder.ivIcon.setImageDrawable(appInfo.icon)
            viewHolder.tvName.text = appInfo.appName
            return view
        }

        override fun getItem(position: Int): AppInfo? {
            return data?.get(position)
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return data!!.size
        }

        inner class ViewHolder(itemView: View) {
            var ivIcon: ImageView = itemView.findViewById(R.id.iv_item_icon)
            var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        }
    }
}
