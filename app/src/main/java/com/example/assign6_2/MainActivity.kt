package com.example.assign6_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miss = Toast.makeText(applicationContext,"Some field is blank.", Toast.LENGTH_LONG)
        val clear = Toast.makeText(applicationContext,"All fields are cleared.",Toast.LENGTH_LONG)
        var cred:Double
        var grade:Double
        var gpa:Double

        bcal.setOnClickListener(){
            if (this.s1.text.toString() == "" || this.s2.text.toString() == "" || this.s3.text.toString() == "" || this.s4.text.toString() == ""
                    || this.s5.text.toString() == "" || this.c1.text.toString() == "" || this.c2.text.toString() == "" || this.c3.text.toString() == "" ||
                    this.c4.text.toString() == "" || this.c5.text.toString() == "" || this.g1.text.toString() == "" || this.g2.text.toString() == "" ||
                    this.g3.text.toString() == "" || this.g4.text.toString() == "" || this.g5.text.toString() == ""){
                miss.show()
            }else{
                val cre1 = c1.getText().toString().toDouble()
                val cre2 = c2.getText().toString().toDouble()
                val cre3 = c3.getText().toString().toDouble()
                val cre4 = c4.getText().toString().toDouble()
                val cre5 = c5.getText().toString().toDouble()
                val gra1 = g1.getText().toString().toDouble()
                val gra2 = g2.getText().toString().toDouble()
                val gra3 = g3.getText().toString().toDouble()
                val gra4 = g4.getText().toString().toDouble()
                val gra5 = g5.getText().toString().toDouble()
                cred = cre1 + cre2 + cre3 + cre4 + cre5
                grade = (gra1 * cre1) + (gra2 * cre2) + (gra3 * cre3) + (gra4 * cre4) + (gra5 * cre5)
                gpa = grade / cred
                val gpa2dec = String.format("%.2f", gpa) ;
                credit.setText("$cred")
                tgpa.setText("$gpa2dec")
            }
        }
        bclear.setOnClickListener(){
            s1.setText(null)
            s2.setText(null)
            s3.setText(null)
            s4.setText(null)
            s5.setText(null)
            c1.setText(null)
            c2.setText(null)
            c3.setText(null)
            c4.setText(null)
            c5.setText(null)
            g1.setText(null)
            g2.setText(null)
            g3.setText(null)
            g4.setText(null)
            g5.setText(null)
            credit.setText(null)
            tgpa.setText(null)
            clear.show()
        }
    }
}