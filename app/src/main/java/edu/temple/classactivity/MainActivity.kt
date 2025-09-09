package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.button)
        val myMessageTextView = findViewById<TextView>(R.id.messageTextView)
        val myEditTextView = findViewById<EditText>(R.id.editTextText)
        myButton.setOnClickListener{
            if(myEditTextView.text.isNotEmpty()){
                myMessageTextView.text = "Hello ${myEditTextView.text}, Welcome!"
            }
            else {
                myMessageTextView.text = "Enter your name please"

            }
        }
    }

}
