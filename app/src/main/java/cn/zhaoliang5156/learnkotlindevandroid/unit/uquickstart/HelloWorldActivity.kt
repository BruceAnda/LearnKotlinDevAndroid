package cn.zhaoliang5156.learnkotlindevandroid.unit.uquickstart

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import cn.zhaoliang5156.learnkotlindevandroid.R
import kotlinx.android.synthetic.main.activity_hello_world.*

/* *
 * @descroption: 快速入门HelloWorld Activity 在界面上显示I Love Kotlin And Android
 * @author: zhaoliang
 * @date: 2019/4/17 9:23 AM
 * @version 1.0
 */
class HelloWorldActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)

        // 给界面上的控件设置点击事件
        tv_hello.setOnClickListener {
            // 改变控件的内容
            tv_hello.text = "I Love Kotlin And Android!"
        }
    }
}
