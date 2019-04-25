package cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.progress

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import cn.zhaoliang5156.learnkotlindevandroid.R
import kotlinx.android.synthetic.main.activity_porgress.*

/* *
 * @descroption:    进度条的使用
 * @author: zhaoliang
 * @date: 2019/4/20 10:33 AM
 * @version 1.0
 */
class ProgressActivity : AppCompatActivity() {

    private var onSeekBarChangeListener = object : SeekBar.OnSeekBarChangeListener {
        override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
            pb_progress.max = seekBar!!.max
            pb_progress.secondaryProgress = progress
            if (progress == seekBar.max) {
                ll_progress.visibility = View.GONE
            } else {
                ll_progress.visibility = View.VISIBLE
            }
        }

        override fun onStartTrackingTouch(seekBar: SeekBar?) {

        }

        override fun onStopTrackingTouch(seekBar: SeekBar?) {

        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_porgress)

        sb_progress.setOnSeekBarChangeListener(onSeekBarChangeListener)
    }

}
