package ilyasov.loginaction

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val arguments = intent.extras
        val email : String = arguments?.get("Email").toString()
        val password : String = arguments?.get("Password").toString()

        val dataTextView : TextView = findViewById(R.id.dataTextView)
        dataTextView.text = "$email - $password"
    }
}