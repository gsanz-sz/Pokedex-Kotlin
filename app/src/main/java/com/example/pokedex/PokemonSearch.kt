package com.example.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.pokedex.databinding.ActivityPokemonSearchBinding

class PokemonSearch : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityPokemonSearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPokemonSearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonCalculate.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_calculate) calculate()
    }

    private fun validade(valitade_text: String) {
        if
    }

    private fun calculate() {
        val distance = binding.editDistance.text.toString().toFloat()
        val price = binding.editPrice.text.toString().toFloat()
        val autonomy = binding.editAutonomy.text.toString().toFloat()
        val total = (distance * price) / autonomy

        binding.textTotal.text = "R$ ${"%.2f".format(total)}"
        Toast.makeText(this, "Deu certo!!", Toast.LENGTH_SHORT).show()
    }
}