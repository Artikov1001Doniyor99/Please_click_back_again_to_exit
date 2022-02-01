package uz.artikov.modul_6_lesson_8_1

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import uz.artikov.modul_6_lesson_8_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private lateinit var handler: Handler

    private var isBack = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

    }

    override fun onBackPressed() {
        if (isBack) {
            super.onBackPressed()
            return
        }
        isBack = true
        handler = Handler(Looper.getMainLooper())
        Toast.makeText(this, "Please click back again to exit", Toast.LENGTH_SHORT).show()
        handler.postDelayed({
            isBack = false
        },2000)

    }

}