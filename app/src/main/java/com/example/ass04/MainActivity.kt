package com.example.ass04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDate(v: View){
        val newDateFragment = DatePickerFragment()
        newDateFragment.show(supportFragmentManager,"Date Picker")
    }
    fun show(view :View){
        text_show.text = "Name:${editUser.text}\nPassword:${editPass.text}\nGender:$radio\nE-mail:${editEmail.text}\nBirthday ${text_birthday.text}"
    }
    fun reset(v: View){
        editUser.text.clear()
        editPass.text.clear()
        editEmail.text.clear()
        text_show.text="Show Infomation"

    }
}
