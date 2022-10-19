package kr.ac.kumoh.s20170187com.example.w0701implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20170187com.example.w0701implicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHomepage.setOnClickListener{
            val uri = Uri.parse("http://www.instagram.com")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)

        }
        binding.btnMap.setOnClickListener {
            val uri = Uri.parse("geo:0,0?z=17&q= 경북 구미시 거의동")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        binding.btnTeleghone.setOnClickListener {
            val uri = Uri.parse("sms:010-3115-1042")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}