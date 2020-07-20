package consumo.api.kotlinapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import consumo.api.kotlinapp.HomeActivity
import consumo.api.kotlinapp.R
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_login.*

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        buttonCadastr.setOnClickListener{
            validarCampos()
        }


    }
    private fun validarCampos (){
        val nome = input_nome.text.toString().trim()
        val telefone = input_telefone.text.toString().trim()
        val email = input_email.text.toString().trim()
        val senha = input_senha.text.toString().trim()

        if(nome.isEmpty() && telefone.isEmpty() && email.isEmpty() && senha.isEmpty()) {
            input_nome.error = "Preencha os campos!"
            input_telefone.error = "Preencha os campos!"
            input_email.error = "Preencha os campos!"
            input_senha.error = "Preencha os campos!"
            false
        }else{
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
            true
        }

    }
}