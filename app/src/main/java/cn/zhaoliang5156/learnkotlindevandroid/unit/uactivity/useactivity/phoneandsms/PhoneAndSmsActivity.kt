package cn.zhaoliang5156.learnkotlindevandroid.unit.uactivity.useactivity.phoneandsms

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import cn.zhaoliang5156.learnkotlindevandroid.R
import kotlinx.android.synthetic.main.activity_phone_and_sms.*

/* *
 * @descroption: 拨打电话和发送短信
 * @author: zhaoliang
 * @date: 2019/4/19 11:50 AM
 * @version 1.0
 */
class PhoneAndSmsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_and_sms)

        /* 动态请求权限 */
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(arrayOf(Manifest.permission.CALL_PHONE, Manifest.permission.SEND_SMS), 0x00)
        }

        /* 拨打电话点击事件 */
        btn_call.setOnClickListener {
            // 跳转到拨号界面
            var intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + et_phone.text.toString());
            startActivity(intent)
        }

        /* 拨打电话长按事件 */
        btn_call.setOnLongClickListener {
            // 拨打电话
            var intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:" + et_phone.text.toString())
            startActivity(intent)
            true
        }

        /* 发送短信点击事件 */
        btn_sms.setOnClickListener {
            // 跳转到发送短信界面
            var intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("smsto:" + et_phone.text.toString())
            intent.putExtra("sms_body", et_sms.text.toString())
            startActivity(intent)
        }

        /* 发送短信长按事件 */
        btn_sms.setOnLongClickListener {
            // 发送短信
            var sm = SmsManager.getDefault()
            sm.sendTextMessage(et_phone.text.toString(), null, et_sms.text.toString(), null, null)
            true
        }
    }
}
