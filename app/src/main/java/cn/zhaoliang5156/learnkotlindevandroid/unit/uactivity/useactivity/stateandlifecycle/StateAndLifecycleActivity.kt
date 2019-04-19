package cn.zhaoliang5156.learnkotlindevandroid.unit.uactivity.useactivity.stateandlifecycle

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import cn.zhaoliang5156.learnkotlindevandroid.R

/* *
 * @descroption: Activity  的四种状态 与 生命周期
 * 四种状态：
 * 死亡
 * 运行
 * 暂停
 * 停止
 * （1）死亡--》运行   如：按启动图标，调用StartActivity等
 *      onCreate()-->onStart()-->onResume()
 * （2）运行--》死亡   如：按返回键，调用finish方法等
 *      onPause()-->onStop-->onDestroy()
 * （3）运行--》暂停   如：弹出Dialog
 *      onPause()
 * （4）暂停--》运行   如：关闭对话框
 *      onResume()
 * （5）运行--》停止   如：按下home键，接到电话
 *      onPause()-->onStop()
 * （6）停止--》运行   如：回到页面
 *      onStart()-->onResume()
 * @author: zhaoliang
 * @date: 2019/4/19 10:45 AM
 * @version 1.0
 */
class StateAndLifecycleActivity : AppCompatActivity {

    val TAG = StateAndLifecycleActivity::class.java.simpleName

    constructor() {
        Log.i(TAG, "StateAndLifecycleActivity创建")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state_and_lifecycle)
        Log.i(TAG, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }

    /**
     * 跳转到界面2的按钮点击的时候会调用这个方法
     */
    fun toSecond(view: View) {
        startActivity(Intent(this, LifecycleSecondActivity::class.java))
    }
}
