package kz.kuz.dialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kz.kuz.dialogfragment.R
import kz.kuz.dialogfragment.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, MainFragment())
                    .commitNow()
        }
    }
}