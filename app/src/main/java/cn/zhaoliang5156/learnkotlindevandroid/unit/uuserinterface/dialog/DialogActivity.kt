package cn.zhaoliang5156.learnkotlindevandroid.unit.uuserinterface.dialog

import android.app.DatePickerDialog
import android.app.ProgressDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.EditText
import android.widget.Toast
import cn.zhaoliang5156.learnkotlindevandroid.R
import java.util.*

/* *
 * @descroption:    对话框的使用
 * @author: zhaoliang
 * @date: 2019/4/20 10:33 AM
 * @version 1.0
 */
class DialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)
    }

    fun showAD(view: View) {
        AlertDialog
                .Builder(this)
                .setTitle("删除数据")
                .setMessage("你确定删除数据吗？")
                .setPositiveButton("确定") { _: DialogInterface, _: Int ->
                    Toast.makeText(this, "确定", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("取消") { _: DialogInterface, _: Int ->
                    Toast.makeText(this, "取消", Toast.LENGTH_SHORT).show()
                }
                .show()
    }

    fun showLD(view: View) {
        val item = arrayOf("红", "蓝", "绿", "灰")
        AlertDialog
                .Builder(this)
                .setTitle("指定背景颜色")
                .setSingleChoiceItems(item, 2) { dialog: DialogInterface, witch: Int ->
                    // 提示颜色
                    Toast.makeText(this, item[witch], Toast.LENGTH_SHORT).show()
                    // 移除Dialog
                    dialog.dismiss()
                }
                .show()
    }

    fun showCD(view: View) {
        val inflate = View.inflate(this, R.layout.dialog_view, null)
        val etUsername = inflate.findViewById<EditText>(R.id.et_dialog_name)
        val etPwd = inflate.findViewById<EditText>(R.id.et_dialog_pwd)

        AlertDialog
                .Builder(this)
                .setView(inflate)
                .setNegativeButton("取消", null)
                .setPositiveButton("确定") { _: DialogInterface, _: Int ->
                    // 提示用户名和密码
                    Toast.makeText(this, "${etUsername.text}:${etPwd.text}", Toast.LENGTH_LONG).show()
                }
                .show()
    }

    fun showPD(view: View) {
        var progressDialog = ProgressDialog.show(this, "数据加载", "数据加载中")
        Thread(Runnable {
            for (i in 1..20) {
                Thread.sleep(100)
            }
            progressDialog.dismiss()
            runOnUiThread {
                Toast.makeText(this, "加载完成了！！！", Toast.LENGTH_SHORT).show()
            }
        }).start()
    }

    fun showPD2(view: View) {
        var progressDialog = ProgressDialog(this)
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL)
        progressDialog.show()
        Thread(Runnable {
            for (i in 1..100) {
                Thread.sleep(100)
                progressDialog.progress = progressDialog.progress + 1
            }
            progressDialog.dismiss()
        }).start()
    }

    fun showDateAD(view: View) {
        val calendar = Calendar.getInstance()
        // 得到年月日
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            Toast.makeText(this, "$year/${month + 1}/$dayOfMonth", Toast.LENGTH_SHORT).show()
        }, year, month, day).show()
    }

    fun showTimeAD(view: View) {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)
        TimePickerDialog(this, TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
            Toast.makeText(this, "$hourOfDay:$minute", Toast.LENGTH_SHORT).show()
        }, hour, minute, true).show()
    }
}
