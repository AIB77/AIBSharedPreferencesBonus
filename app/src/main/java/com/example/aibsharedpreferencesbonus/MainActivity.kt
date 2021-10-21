package com.example.aibsharedpreferencesbonus

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var EDTname:EditText
    lateinit var EDTnumber:EditText
    lateinit var BTNshow: Button
    lateinit var TVname: TextView
    lateinit var TVnumber:TextView
    lateinit var BTNsave:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EDTname=findViewById(R.id.edtname)
        EDTnumber=findViewById(R.id.edtnum)
        BTNshow=findViewById(R.id.btnshow)
        TVname=findViewById(R.id.tvname)
        TVnumber=findViewById(R.id.tvnum)
        BTNsave=findViewById(R.id.btnsave)

        var userinputname=EDTname.text//.toString()
        var uerinputnumber=EDTnumber.text//.toString().toInt()

        BTNshow.setOnClickListener {
            TVname.text=userinputname
            TVnumber.text=uerinputnumber
        }


        val pref= getPreferences(Context.MODE_PRIVATE)
        val toto=pref.getString("name","")
        TVname.setText(toto)
        val pop=pref.getString("number","")
        TVnumber.setText(pop)

        BTNsave.setOnClickListener {
            SharedPreferences()
        }





    }
    fun SharedPreferences()
    {
        val pref = getPreferences(Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString("name", TVname.text.toString())
        editor.putString("number", TVnumber.text.toString())

        editor.commit()

    }


}