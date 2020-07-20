package consumo.api.kotlinapp.view

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import consumo.api.kotlinapp.HomeActivity
import consumo.api.kotlinapp.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
            validaCampos()
            trocaTela()
    }

    private fun validaCampos() {
        buttonEntrar.setOnClickListener {

            val email = email_input.text.toString()
            val senha = senha_input.text.toString()

            if (email.isEmpty() && senha.isEmpty()) {
                email_input.error = "Preencha os campos!"
                senha_input.error = "Preencha os campos!"
                false
            } else {
                startActivity(Intent(this, HomeActivity::class.java))
                finish()
                true
            }
        }
    }
    private fun trocaTela(){
        buttonCadastro.setOnClickListener() {
            startActivity(Intent(this, CadastroActivity::class.java))
            finish()
        }
    }
    private fun testeSpinner(){
        var generos = arrayOf("Feminino", "Masculino", "Não binário", "Outros")
    }
}