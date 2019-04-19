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
class BackStackAndLunchModeActivity : AppCompatActivity {

    val TAG = BackStackAndLunchModeActivity::class.java.simpleName

    constructor() {
        Log.i(TAG, "界面1创建")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_back_stack_and_lunch_mode)
        Log.i(TAG, "onCreate()")
    }

    /**
     * 启动界面2
     */
    fun toSecond(view: View) {
        startActivity(Intent(this, LaunchModeSecondActivity::class.java));
    }

    /**
     * 启动界面1
     */
    fun toOne(view: View) {
        startActivity(Intent(this, BackStackAndLunchModeActivity::class.java))
    }
}
