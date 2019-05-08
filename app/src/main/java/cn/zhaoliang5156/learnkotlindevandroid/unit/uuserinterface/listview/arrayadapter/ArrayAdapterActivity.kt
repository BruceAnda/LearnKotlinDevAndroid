package cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.listview.arrayadapter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import cn.zhaoliang5156.learnkotlindevandroid.R
import kotlinx.android.synthetic.main.activity_array_adapter.*

class ArrayAdapterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_array_adapter)

        array_adapter_list.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayOf(
                "A",
                "B",
                "C",
                "D",
                "E",
                "F",
                "G",
                "H",
                "I",
                "J",
                "K",
                "L",
                "M",
                "N",
                "O",
                "P",
                "Q",
                "R",
                "S",
                "T",
                "U",
                "V",
                "W",
                "X",
                "Y",
                "Z"
        ))
    }
}
