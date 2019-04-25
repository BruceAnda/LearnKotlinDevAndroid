package cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.component

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import cn.zhaoliang5156.learnkotlindevandroid.R
import kotlinx.android.synthetic.main.activity_component.*

/* *
 * @descroption:    基本控件的使用 TextView EditText Button ImageView CheckBox RadioButton
 * @author: zhaoliang
 * @date: 2019/4/20 10:32 AM
 * @version 1.0
 */
class ComponentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_component)

        tv_welcome.text = "Welcome"
        btn_submit.setOnClickListener {
            Toast.makeText(this, et_phone_num.text.toString(), Toast.LENGTH_SHORT).show()
        }

        var isPaly = false
        iv_play.setOnClickListener {
            isPaly = !isPaly
            if (isPaly) {
                iv_play.setBackgroundResource(android.R.drawable.alert_dark_frame)
                iv_play.setImageResource(android.R.drawable.ic_media_pause)
            } else {
                iv_play.setBackgroundResource(android.R.drawable.alert_dark_frame)
                iv_play.setImageResource(android.R.drawable.ic_media_play)
            }
        }

        cb_foot.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "选中了足球", Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this, "没有选则足球", Toast.LENGTH_SHORT).show()
            }
        }

        rg_sex.setOnCheckedChangeListener { group, checkedId ->
            val radioButton = group.findViewById<RadioButton>(checkedId)
            Toast.makeText(this, radioButton.text.toString(), Toast.LENGTH_SHORT).show()
        }

    }

    fun confirm(view: View) {
        var stringBuffer = StringBuffer()
        if (cb_basket.isChecked) {
            stringBuffer.append(cb_basket.text.toString()).append(" ")
        }
        if (cb_foot.isChecked) {
            stringBuffer.append(cb_foot.text.toString()).append(" ")
        }
        if (cb_pingpang.isChecked) {
            stringBuffer.append(cb_pingpang.text.toString()).append(" ")
        }
        Toast.makeText(this, stringBuffer.toString(), Toast.LENGTH_SHORT).show()
    }
}
