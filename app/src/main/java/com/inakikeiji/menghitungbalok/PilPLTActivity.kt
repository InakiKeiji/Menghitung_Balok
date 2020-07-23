package com.inakikeiji.menghitungbalok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class PilPLTActivity : AppCompatActivity(), View.OnClickListener {

    companion object{
        const val EXTRA_PILP_VOL="extra_pilPVol"
        const val EXTRA_PILL_VOL="extra_pilLVol"
        const val EXTRA_PILT_VOL="extra_pilTVol"
        const val EXTRA_PILP_LUASPERM="extra_pilPLuasPerm"
        const val EXTRA_PILL_LUASPERM="extra_pilLLuasPerm"
        const val EXTRA_PILT_LUASPERM="extra_pilTLuasPerm"

        const val EXTRA_PILPANJANG="extra_pilPanjang"
        const val EXTRA_PILLEBAR="extra_pilLebar"
        const val EXTRA_PILTINGGI="extra_pilTinggi"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pil_p_l_t)

        val btnVolDiket=findViewById<Button>(R.id.btn_volumeDiket)
        val btnLuasPermDiket=findViewById<Button>(R.id.btn_luasPermukaanDiket)

        btnVolDiket.setOnClickListener(this)
        btnLuasPermDiket.setOnClickListener(this)

        val actionbar=supportActionBar
        actionbar!!.title="Volume (V)/Luas Permukaan (L)"
    }

    override fun onClick(v: View) {
//        val pilPanjang=intent.getBooleanExtra(EXTRA_PILPANJANG,false)
//        val pilLebar=intent.getBooleanExtra(EXTRA_PILLEBAR,false)
//        val pilTinggi=intent.getBooleanExtra(EXTRA_PILTINGGI,false)

        when(v.id){
            R.id.btn_volumeDiket->{
                val pilPVol=intent.getBooleanExtra(EXTRA_PILP_VOL,false)
                val pilLVol=intent.getBooleanExtra(EXTRA_PILL_VOL,false)
                val pilTVol=intent.getBooleanExtra(EXTRA_PILT_VOL,false)
                if(pilPVol){
                    val pindahHitungPVolAct=Intent(this,HitungActivity::class.java)
                    pindahHitungPVolAct.putExtra(HitungActivity.EXTRA_RUMUS,"p = V ÷ (l × t)")
//                    pindahHitungPVolAct.putExtra(HitungActivity.EXTRA_HITUNGP_VOL,true)
//                    pindahHitungPVolAct.putExtra(HitungActivity.EXTRA_HITUNGL_VOL,true)
//                    pindahHitungPVolAct.putExtra(HitungActivity.EXTRA_HITUNGT_VOL,true)
//
//                    if(pilPanjang){
//                        pindahHitungPVolAct.putExtra(HitungActivity.EXTRA_PANJANG,true)
//                    }
//                    if(pilLebar){
//                        pindahHitungPVolAct.putExtra(HitungActivity.EXTRA_LEBAR,true)
//                    }
//                    if(pilTinggi){
//                        pindahHitungPVolAct.putExtra(HitungActivity.EXTRA_TINGGI,true)
//                    }

                    startActivity(pindahHitungPVolAct)
                }
                if(pilLVol){
                    val pindahHitungLVolAct=Intent(this,HitungActivity::class.java)
                    pindahHitungLVolAct.putExtra(HitungActivity.EXTRA_RUMUS,"l = V ÷ (p × t)")
//                    pindahHitungLVolAct.putExtra(HitungActivity.EXTRA_HITUNGP_VOL,true)
//                    pindahHitungLVolAct.putExtra(HitungActivity.EXTRA_HITUNGL_VOL,true)
//                    pindahHitungLVolAct.putExtra(HitungActivity.EXTRA_HITUNGT_VOL,true)
//
//                    if(pilPanjang){
//                        pindahHitungLVolAct.putExtra(HitungActivity.EXTRA_PANJANG,true)
//                    }
//                    if(pilLebar){
//                        pindahHitungLVolAct.putExtra(HitungActivity.EXTRA_LEBAR,true)
//                    }
//                    if(pilTinggi){
//                        pindahHitungLVolAct.putExtra(HitungActivity.EXTRA_TINGGI,true)
//                    }

                    startActivity(pindahHitungLVolAct)
                }
                if(pilTVol){
                    val pindahHitungTVolAct=Intent(this,HitungActivity::class.java)
                    pindahHitungTVolAct.putExtra(HitungActivity.EXTRA_RUMUS,"t = V ÷ (p × l)")
//                    pindahHitungTVolAct.putExtra(HitungActivity.EXTRA_HITUNGP_VOL,true)
//                    pindahHitungTVolAct.putExtra(HitungActivity.EXTRA_HITUNGL_VOL,true)
//                    pindahHitungTVolAct.putExtra(HitungActivity.EXTRA_HITUNGT_VOL,true)
//
//                    if(pilPanjang){
//                        pindahHitungTVolAct.putExtra(HitungActivity.EXTRA_PANJANG,true)
//                    }
//                    if(pilLebar){
//                        pindahHitungTVolAct.putExtra(HitungActivity.EXTRA_LEBAR,true)
//                    }
//                    if(pilTinggi){
//                        pindahHitungTVolAct.putExtra(HitungActivity.EXTRA_TINGGI,true)
//                    }

                    startActivity(pindahHitungTVolAct)
                }
            }
            R.id.btn_luasPermukaanDiket->{
                val pilPLuasPerm=intent.getBooleanExtra(EXTRA_PILP_LUASPERM,false)
                val pilLLuasPerm=intent.getBooleanExtra(EXTRA_PILL_LUASPERM,false)
                val pilTLuasPerm=intent.getBooleanExtra(EXTRA_PILT_LUASPERM,false)
                if(pilPLuasPerm){
                    val pindahHitungPLuasPermAct=Intent(this,HitungActivity::class.java)
                    pindahHitungPLuasPermAct.putExtra(HitungActivity.EXTRA_RUMUS,"p = (L / 2 - l.t) / (l + t)")
//                    pindahHitungPLuasPermAct.putExtra(HitungActivity.EXTRA_HITUNGP_LUASPERM,true)
//                    pindahHitungPLuasPermAct.putExtra(HitungActivity.EXTRA_HITUNGL_LUASPERM,true)
//                    pindahHitungPLuasPermAct.putExtra(HitungActivity.EXTRA_HITUNGT_LUASPERM,true)
//
//                    if(pilPanjang){
//                        pindahHitungPLuasPermAct.putExtra(HitungActivity.EXTRA_PANJANG,true)
//                    }
//                    if(pilLebar){
//                        pindahHitungPLuasPermAct.putExtra(HitungActivity.EXTRA_LEBAR,true)
//                    }
//                    if(pilTinggi){
//                        pindahHitungPLuasPermAct.putExtra(HitungActivity.EXTRA_TINGGI,true)
//                    }

                    startActivity(pindahHitungPLuasPermAct)
                }
                if(pilLLuasPerm){
                    val pindahHitungLLuasPermAct=Intent(this,HitungActivity::class.java)
                    pindahHitungLLuasPermAct.putExtra(HitungActivity.EXTRA_RUMUS,"l = (L / 2 - p.t) / (p + t)")
//                    pindahHitungLLuasPermAct.putExtra(HitungActivity.EXTRA_HITUNGP_LUASPERM,true)
//                    pindahHitungLLuasPermAct.putExtra(HitungActivity.EXTRA_HITUNGL_LUASPERM,true)
//                    pindahHitungLLuasPermAct.putExtra(HitungActivity.EXTRA_HITUNGT_LUASPERM,true)
//
//                    if(pilPanjang){
//                        pindahHitungLLuasPermAct.putExtra(HitungActivity.EXTRA_PANJANG,true)
//                    }
//                    if(pilLebar){
//                        pindahHitungLLuasPermAct.putExtra(HitungActivity.EXTRA_LEBAR,true)
//                    }
//                    if(pilTinggi){
//                        pindahHitungLLuasPermAct.putExtra(HitungActivity.EXTRA_TINGGI,true)
//                    }

                    startActivity(pindahHitungLLuasPermAct)
                }
                if(pilTLuasPerm){
                    val pindahHitungTLuasPermAct=Intent(this,HitungActivity::class.java)
                    pindahHitungTLuasPermAct.putExtra(HitungActivity.EXTRA_RUMUS,"t = (L / 2 - p.l) / (p + l)")
//                    pindahHitungTLuasPermAct.putExtra(HitungActivity.EXTRA_HITUNGP_LUASPERM,true)
//                    pindahHitungTLuasPermAct.putExtra(HitungActivity.EXTRA_HITUNGL_LUASPERM,true)
//                    pindahHitungTLuasPermAct.putExtra(HitungActivity.EXTRA_HITUNGT_LUASPERM,true)
//
//                    if(pilPanjang){
//                        pindahHitungTLuasPermAct.putExtra(HitungActivity.EXTRA_PANJANG,true)
//                    }
//                    if(pilLebar){
//                        pindahHitungTLuasPermAct.putExtra(HitungActivity.EXTRA_LEBAR,true)
//                    }
//                    if(pilTinggi){
//                        pindahHitungTLuasPermAct.putExtra(HitungActivity.EXTRA_TINGGI,true)
//                    }

                    startActivity(pindahHitungTLuasPermAct)
                }
            }
        }
    }
}
