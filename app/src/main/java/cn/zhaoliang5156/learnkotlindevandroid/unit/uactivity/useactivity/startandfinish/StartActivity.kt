package cn.zhaoliang5156.learnkotlindevandroid.unit.uactivity.useactivity.startandfinish

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import cn.zhaoliang5156.learnkotlindevandroid.R
import kotlinx.android.synthetic.main.activity_start.*

/* *
 * @descroption: Activity的启动api测试
 * @author: zhaoliang
 * @date: 2019/4/17 10:37 AM
 * @version 1.0
 */
class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }

    /**
     * 一般启动按钮点击调用的方法
     */
    fun start(view: View) {
        // 跳转到finishActivity
        // 1. 创建Intent对象
        var intent = Intent(this, FinishActivity::class.java);
        // 2. 传递参数
        intent.putExtra("data", et_input.text.toString())
        // 3. 调用startActivity跳转
        startActivity(intent)
    }

    // 请求码
    private val CODE_FORRESULT: Int = 0x00

    /**
     * 带返回按钮点击调用这个方法
     */
    fun startForResult(view: View) {
        // 跳转到finishActivity
        // 1. 创建Intent对象
        var intent = Intent(this, FinishActivity::class.java)
        // 2. 传递参数
        intent.putExtra("data", et_input.text.toString())
        // 3. 调用startActivityForResult跳转
        startActivityForResult(intent, CODE_FORRESULT)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == CODE_FORRESULT && resultCode == Activity.RESULT_OK) {
            et_input.setText(data?.getStringExtra("data"))
        }
    }
}
