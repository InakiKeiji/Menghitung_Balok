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
//        val btnPanjang:Button=findViewById(R.id.btn_panjang)
//        val btnLebar:Button=findViewById(R.id.btn_lebar)
//        val btnTinggi:Button=findViewById(R.id.btn_tinggi)
//        val btnDiagonalBidangSisi:Button=findViewById(R.id.btn_diagonalBidangSisi)
//        val btnDiagonalRuang:Button=findViewById(R.id.btn_diagonalRuang)
//        val btnLuasBidangDiagonal:Button=findViewById(R.id.btn_luasBidangDiagonal)

        btnSifat.setOnClickListener(this)
        btnVolume.setOnClickListener(this)
        btnLuasPermukaan.setOnClickListener(this)
//        btnPanjang.setOnClickListener(this)
//        btnLebar.setOnClickListener(this)
//        btnTinggi.setOnClickListener(this)
//        btnDiagonalBidangSisi.setOnClickListener(this)
//        btnDiagonalRuang.setOnClickListener(this)
//        btnLuasBidangDiagonal.setOnClickListener(this)
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

//            R.id.btn_panjang->{
//                val pindahPanjangAct=Intent(this,PilPLTActivity::class.java)
//                pindahPanjangAct.putExtra(PilPLTActivity.EXTRA_PILP_VOL,true)
//                pindahPanjangAct.putExtra(PilPLTActivity.EXTRA_PILP_LUASPERM,true)
//                pindahPanjangAct.putExtra(PilPLTActivity.EXTRA_PILPANJANG,true)
//                startActivity(pindahPanjangAct)
//            }
//
//            R.id.btn_lebar->{
//                val pindahLebarAct=Intent(this,PilPLTActivity::class.java)
//                pindahLebarAct.putExtra(PilPLTActivity.EXTRA_PILL_VOL,true)
//                pindahLebarAct.putExtra(PilPLTActivity.EXTRA_PILL_LUASPERM,true)
//                pindahLebarAct.putExtra(PilPLTActivity.EXTRA_PILLEBAR,true)
//                startActivity(pindahLebarAct)
//            }
//
//            R.id.btn_tinggi->{
//                val pindahTinggiAct=Intent(this,PilPLTActivity::class.java)
//                pindahTinggiAct.putExtra(PilPLTActivity.EXTRA_PILT_VOL,true)
//                pindahTinggiAct.putExtra(PilPLTActivity.EXTRA_PILT_LUASPERM,true)
//                pindahTinggiAct.putExtra(PilPLTActivity.EXTRA_PILTINGGI,true)
//                startActivity(pindahTinggiAct)
//            }
//
//            R.id.btn_diagonalBidangSisi->{
//                val pindahDiagonalBidangSisiAct=Intent(this,DiagonalBidangSisiActivity::class.java)
//                startActivity(pindahDiagonalBidangSisiAct)
//            }
//
//            R.id.btn_diagonalRuang->{
//                val pindahDiagonalRuangAct=Intent(this,DiagonalRuangActivity::class.java)
//                startActivity(pindahDiagonalRuangAct)
//            }
//
//            R.id.btn_luasBidangDiagonal->{
//                val pindahLuasBidangDiagonalAct=Intent(this,LuasBidangDiagonalActivity::class.java)
//                startActivity(pindahLuasBidangDiagonalAct)
//            }
        }
    }
}