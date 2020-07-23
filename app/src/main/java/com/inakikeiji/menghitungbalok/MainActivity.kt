package com.inakikeiji.menghitungbalok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSifat:Button=findViewById(R.id.btn_sifat)
        val btnVolume:Button=findViewById(R.id.btn_volume)
        val btnLuasPermukaan:Button=findViewById(R.id.btn_luasPermukaan)

        btnSifat.setOnClickListener(this)
        btnVolume.setOnClickListener(this)
        btnLuasPermukaan.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_sifat->{
                val pindahSifatAct=Intent(this,SifatActivity::class.java)
                startActivity(pindahSifatAct)
            }

            R.id.btn_volume->{
                val pindahHitungVolAct=Intent(this,HitungActivity::class.java)
                pindahHitungVolAct.putExtra(HitungActivity.EXTRA_RUMUS,"V = p × l × t")
                pindahHitungVolAct.putExtra(HitungActivity.EXTRA_HITUNG_VOL,true)
                startActivity(pindahHitungVolAct)
            }

            R.id.btn_luasPermukaan->{
                val pindahHitungLuasPermAct=Intent(this,HitungActivity::class.java)
                pindahHitungLuasPermAct.putExtra(HitungActivity.EXTRA_RUMUS,"L = 2 × (p.l + p.t + l.t)")
                pindahHitungLuasPermAct.putExtra(HitungActivity.EXTRA_HITUNG_LUASPERM,true)
                startActivity(pindahHitungLuasPermAct)
            }
        }
    }
}