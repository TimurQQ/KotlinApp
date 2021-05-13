package ilyasov.loginaction

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var emailEditText : EditText
    lateinit var passwordEditText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailEditText = findViewById(R.id.editTextEmailAddress)
        passwordEditText = findViewById(R.id.editTextPassword)

        val button: Button = findViewById(R.id.button)
        val buttonClick: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View) {
                val intent = Intent(v.context, SecondActivity::class.java)
                intent.putExtra("Email", emailEditText.text)
                intent.putExtra("Password", passwordEditText.text)
                startActivity(intent)
            }
        }
        button.setOnClickListener(buttonClick)
    }
}