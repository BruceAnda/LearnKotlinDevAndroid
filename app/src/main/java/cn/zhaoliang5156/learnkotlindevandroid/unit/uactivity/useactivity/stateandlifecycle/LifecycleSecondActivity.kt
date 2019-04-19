package cn.zhaoliang5156.learnkotlindevandroid.unit.uactivity.useactivity.stateandlifecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import cn.zhaoliang5156.learnkotlindevandroid.R

class LifecycleSecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}
