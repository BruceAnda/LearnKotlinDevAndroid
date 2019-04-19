package cn.zhaoliang5156.learnkotlindevandroid.unit.uactivity.useactivity.launchmode

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import cn.zhaoliang5156.learnkotlindevandroid.R

/* *
 * @descroption: Activity 回退栈 与 启动模式
 * @author: zhaoliang
 * @date: 2019/4/19 11:19 AM
 * @version 1.0
 */
class LaunchModeSecondActivity : AppCompatActivity {

    val TAG = LaunchModeSecondActivity::class.java.simpleName

    constructor() {
        Log.i(TAG, "创建")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_mode_second)
        Log.i(TAG, "onCreate")
    }

    fun toThird(view: View) {
        startActivity(Intent(this, LaunchModeThirdActivity::class.java))
    }

    fun toOne(view: View) {
        startActivity(Intent(this, BackStackAndLunchModeActivity::class.java))
    }
}
