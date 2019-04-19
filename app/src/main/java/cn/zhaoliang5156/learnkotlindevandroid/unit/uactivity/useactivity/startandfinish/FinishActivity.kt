package cn.zhaoliang5156.learnkotlindevandroid.unit.uactivity.useactivity.startandfinish

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import cn.zhaoliang5156.learnkotlindevandroid.R
import kotlinx.android.synthetic.main.activity_finish.*

/* *
 * @descroption: Activity的关闭api 测试
 * @author: zhaoliang
 * @date: 2019/4/18 9:18 AM
 * @version 1.0
 */
class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        et_input.setText(intent.getStringExtra("data"))
    }

    /**
     * 一般返回点击调用
     */
    fun finish(view: View) {
        // 销毁当前界面
        finish()
    }

    /**
     * 带结果按钮点击调用
     */
    fun finishForResult(view: View) {
        // 设置结果 并销毁当前界面
        var intent = Intent()
        intent.putExtra("data", et_input.text.toString())
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}
