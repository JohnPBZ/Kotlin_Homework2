package com.example.kotlin_homework2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btn_send = findViewById<Button>(R.id.btn_send)
        var ed_drink=findViewById<EditText>(R.id.ed_drink)
        var radioGroup=findViewById<RadioGroup>(R.id.radioGroup)
        var radioGroup2=findViewById<RadioGroup>(R.id.radioGroup2)

        btn_send.setOnClickListener {
            if(ed_drink.length()<1)
                Toast.makeText(this, "請輸入飲料名稱", Toast.LENGTH_SHORT).show()
            else{
                val b = Bundle()
                b.putString("drink", ed_drink.text.toString())
                b.putString("sugar", radioGroup.findViewById<RadioButton>(radioGroup.checkedRadioButtonId).text.toString())
                b.putString("ice", radioGroup2.findViewById<RadioButton>(radioGroup2.checkedRadioButtonId).text.toString())
                setResult(Activity.RESULT_OK, Intent().putExtras(b))
                finish()
            }
        }
    }
}