package com.example.practice_app

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.practice_app.RetrofitInstance
import com.example.practice_app.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        getData()

    }

    private fun getData() {
//        RetrofitInstance().apiInterface.getUsers().enqueue(object : Callback<UserDataClass?> {
//            override fun onResponse(
//                call: Call<UserDataClass?>,
//                response: Response<UserDataClass?>
//            ) {
//                var studentLists = response.body()
//                if (studentLists != null) {
//                    for(student in studentLists){
//                        val name = student.name
//                        val roll = student.roll
//                        val created_at = student.created_at
//                        val updated_at = student.updated_at
//
//                        binding.textView.text = name
//                        binding.textView2.text = roll
//
//                        println("Name: $name, Roll: $roll, Created At: $created_at, Updated At: $updated_at")
//                    }
//                } else {
//                    Toast.makeText(this@MainActivity, "No data found", Toast.LENGTH_LONG).show()
//                }
//            }
//
//            override fun onFailure(call: Call<UserDataClass?>, t: Throwable) {
//                Toast.makeText(this@MainActivity, t.localizedMessage, Toast.LENGTH_LONG).show()
//                println(t.localizedMessage)
//            }
//        })

    }
}