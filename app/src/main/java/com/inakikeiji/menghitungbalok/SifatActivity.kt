package com.inakikeiji.menghitungbalok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SifatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sifat)

        val actionbar=supportActionBar
        actionbar!!.title="Sifat-Sifat Balok"
    }
}
