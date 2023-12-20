package com.example.pokedex

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.pokedex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {
            if (binding.inputTextLogin.text.toString().isNotEmpty()) {
                /*val usuario : String = binding.inputTextLogin.text.toString()
                binding.textUsuario.setTextColor(getColor(R.color.black))
                binding.textUsuario.text = usuario*/
                ProxTela()
            } else {
                binding.textUsuario.text = "Login inválido"
                binding.textUsuario.setTextColor(getColor(R.color.red))
            }
        }
    }
    private fun ProxTela() {

        val nextScreen = Intent(this, PokemonSearch::class.java)
        startActivity(nextScreen)
    }
}