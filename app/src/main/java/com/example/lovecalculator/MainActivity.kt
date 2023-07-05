package com.example.lovecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.lovecalculator.databinding.ActivityMainBinding
import com.example.lovecalculator.remote.LoveModel
import com.example.lovecalculator.remote.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var viewModel : LoveViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            getBtn.setOnClickListener {
               viewModel.getLiveData(fNameEd.text.toString(), sNameEd.text.toString())
                   .observe(this@MainActivity,
                       Observer { loveModel ->
                       Log.e("ololo", "onCreate: $it")
                   })
            }
        }
    }
}
