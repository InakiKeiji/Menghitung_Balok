package com.inakikeiji.menghitungbalok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.NumberFormatException

class HitungActivity : AppCompatActivity(), View.OnClickListener {

//    private lateinit var edtVolume: EditText
//    private lateinit var edtLuasPermukaan: EditText
    private lateinit var edtPanjang: EditText
    private lateinit var edtLebar: EditText
    private lateinit var edtTinggi: EditText
    private lateinit var btnHitung: Button
    private lateinit var tvHasil: TextView

//    private var hitungP_Vol:Boolean = true
//    private var hitungL_Vol:Boolean = true
//    private var hitungT_Vol:Boolean = true
//
//    private var hitungP_LuasPerm:Boolean = true
//    private var hitungL_LuasPerm:Boolean = true
//    private var hitungT_LuasPerm:Boolean = true

//    private var panjangVL:Boolean=true
//    private var lebarVL:Boolean=true
//    private var tinggiVL:Boolean=true

    companion object{
        const val EXTRA_RUMUS="extra_rumus"

        const val EXTRA_HITUNG_VOL="extra_hitungVol"
        const val EXTRA_HITUNG_LUASPERM="extra_hitungLuasPerm"

//        const val EXTRA_HITUNGP_VOL="extra_hitungPVol"
//        const val EXTRA_HITUNGL_VOL="extra_hitungLVol"
//        const val EXTRA_HITUNGT_VOL="extra_hitungTVol"
//
//        const val EXTRA_HITUNGP_LUASPERM="extra_hitungPLuasPerm"
//        const val EXTRA_HITUNGL_LUASPERM="extra_hitungLLuasPerm"
//        const val EXTRA_HITUNGT_LUASPERM="extra_hitungTLuasPerm"

//        const val EXTRA_PANJANG="extra_panjang"
//        const val EXTRA_LEBAR="extra_lebar"
//        const val EXTRA_TINGGI="extra_tinggi"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung)

        val actionbar=supportActionBar
        actionbar!!.title="Hitung"

//        edtVolume=findViewById(R.id.edt_volume)
//        edtLuasPermukaan=findViewById(R.id.edt_luasPermukaan)
        edtPanjang=findViewById(R.id.edt_panjang)
        edtLebar=findViewById(R.id.edt_lebar)
        edtTinggi=findViewById(R.id.edt_tinggi)
        btnHitung=findViewById(R.id.btn_hitung)
        tvHasil=findViewById(R.id.tv_hasil)

        btnHitung.setOnClickListener(this)

        val tvRumus=findViewById<TextView>(R.id.tv_rumus)
        val rumus=intent.getStringExtra(EXTRA_RUMUS)
        tvRumus.text=rumus

//        hitungP_Vol=intent.getBooleanExtra(EXTRA_HITUNGP_VOL,false)
//        hitungL_Vol=intent.getBooleanExtra(EXTRA_HITUNGL_VOL,false)
//        hitungT_Vol=intent.getBooleanExtra(EXTRA_HITUNGT_VOL,false)
//
//        hitungP_LuasPerm=intent.getBooleanExtra(EXTRA_HITUNGP_LUASPERM,false)
//        hitungL_LuasPerm=intent.getBooleanExtra(EXTRA_HITUNGL_LUASPERM,false)
//        hitungT_LuasPerm=intent.getBooleanExtra(EXTRA_HITUNGT_LUASPERM,false)

//        panjangVL=intent.getBooleanExtra(EXTRA_PANJANG,false)
//        lebarVL=intent.getBooleanExtra(EXTRA_LEBAR,false)
//        tinggiVL=intent.getBooleanExtra(EXTRA_TINGGI,false)

//        if(!hitungP_Vol){
//            edtVolume.error="Field ini tidak boleh diisi"
//        }
//        if(!hitungL_Vol){
//            edtVolume.error="Field ini tidak boleh diisi"
//        }
//        if(!hitungT_Vol){
//            edtVolume.error="Field ini tidak boleh diisi"
//        }
//
//        if(!hitungP_LuasPerm){
//            edtLuasPermukaan.error="Field ini tidak boleh diisi"
//        }
//        if(!hitungL_LuasPerm){
//            edtLuasPermukaan.error="Field ini tidak boleh diisi"
//        }
//        if(!hitungT_LuasPerm){
//            edtLuasPermukaan.error="Field ini tidak boleh diisi"
//        }

//        if(panjangVL){
//            edtPanjang.error="Field ini tidak boleh diisi"
//        }
//        if(lebarVL){
//            edtLebar.error="Field ini tidak boleh diisi"
//        }
//        if(tinggiVL){
//            edtTinggi.error="Field ini tidak boleh diisi"
//        }
    }

    override fun onClick(v: View) {
        if(v.id==R.id.btn_hitung){
//            val inputVolume=edtVolume.text.toString().trim()
//            val inputLuasPermukaan=edtLuasPermukaan.text.toString().trim()
            val inputPanjang=edtPanjang.text.toString().trim()
            val inputLebar=edtLebar.text.toString().trim()
            val inputTinggi=edtTinggi.text.toString().trim()

            val hitungVol=intent.getBooleanExtra(EXTRA_HITUNG_VOL,false)
            val hitungLuasPerm=intent.getBooleanExtra(EXTRA_HITUNG_LUASPERM,false)

            var fieldKosong=false
            var doubleInvalid=false

//            val volume=toDouble(inputVolume)
//            val luasPermukaan=toDouble(inputLuasPermukaan)
            val panjang=toDouble(inputPanjang)
            val lebar=toDouble(inputLebar)
            val tinggi=toDouble(inputTinggi)

//            if(inputVolume.isEmpty()&&(hitungP_Vol||hitungL_Vol||hitungT_Vol)){
//                fieldKosong=true
//                edtVolume.error="Field ini tidak boleh kosong"
//            }
//            if(inputLuasPermukaan.isEmpty()&&(hitungP_LuasPerm||hitungL_LuasPerm||hitungT_LuasPerm)){
//                fieldKosong=true
//                edtLuasPermukaan.error="Field ini tidak boleh kosong"
//            }
            if(inputPanjang.isEmpty()){
                fieldKosong=true
                edtPanjang.error="Field ini tidak boleh kosong"
            }
            if(inputLebar.isEmpty()){
                fieldKosong=true
                edtLebar.error="Field ini tidak boleh kosong"
            }
            if(inputTinggi.isEmpty()){
                fieldKosong=true
                edtTinggi.error="Field ini tidak boleh kosong"
            }



//            if(volume==null&&inputVolume.isNotEmpty()&&(hitungP_Vol||hitungL_Vol||hitungT_Vol)){
//                doubleInvalid=true
//                edtVolume.error="Field ini harus berupa nomer yang valid"
//            }
//            if(luasPermukaan==null&&inputLuasPermukaan.isNotEmpty()&&(hitungP_LuasPerm||hitungL_LuasPerm||hitungT_LuasPerm)){
//                doubleInvalid=true
//                edtLuasPermukaan.error="Field ini harus berupa nomer yang valid"
//            }
            if(panjang==null&&inputPanjang.isNotEmpty()
//                &&!panjangVL
            ){
                doubleInvalid=true
                edtPanjang.error="Field ini harus berupa nomer yang valid"
            }
            if(lebar==null&&inputLebar.isNotEmpty()
//                &&!lebarVL
            ){
                doubleInvalid=true
                edtLebar.error="Field ini harus berupa nomer yang valid"
            }
            if(tinggi==null&&inputTinggi.isNotEmpty()
//                &&!tinggiVL
            ){
                doubleInvalid=true
                edtTinggi.error="Field ini harus berupa nomer yang valid"
            }


//            if(inputVolume.isNotEmpty()&&!hitungP_Vol&&!hitungL_Vol&&!hitungT_Vol){
//                edtVolume.error="Field ini seharusnya kosong (tidak dihitung)"
//            }
//            if(inputLuasPermukaan.isNotEmpty()&&!hitungP_LuasPerm&&!hitungL_LuasPerm&&!hitungT_LuasPerm){
//                edtLuasPermukaan.error="Field ini seharusnya kosong (tidak dihitung)"
//            }
//            if(inputPanjang.isNotEmpty()
////                &&panjangVL
//            ){
//                edtPanjang.error="Field ini seharusnya kosong (tidak dihitung)"
//            }
//            if(inputLebar.isNotEmpty()
////                &&lebarVL
//            ){
//                edtLebar.error="Field ini seharusnya kosong (tidak dihitung)"
//            }
//            if(inputTinggi.isNotEmpty()
////                &&tinggiVL
//            ){
//                edtTinggi.error="Field ini seharusnya kosong (tidak dihitung)"
//            }

            if(!fieldKosong&&!doubleInvalid){
                if(hitungVol){
                    val volume=panjang as Double*lebar as Double*tinggi as Double
                    tvHasil.text=volume.toString()
                }
                if(hitungLuasPerm) {
                    val luasPermukaan =
                        2 * (panjang as Double * lebar as Double + panjang * tinggi as Double + lebar * tinggi)
                    tvHasil.text = luasPermukaan.toString()
                }

//                if(hitungP_Vol){
//                    val panjang=volume as Double/(lebar as Double*tinggi as Double)
//                    tvHasil.text=panjang.toString()
//                }
//                if(hitungL_Vol){
//                    val lebar=volume as Double/(panjang as Double*tinggi as Double)
//                    tvHasil.text=lebar.toString()
//                }
//                if(hitungT_Vol){
//                    val tinggi=volume as Double/(panjang as Double*lebar as Double)
//                    tvHasil.text=tinggi.toString()
//                }
//
//                if(hitungP_LuasPerm){
//                    val panjang=(luasPermukaan as Double/2-lebar as Double*tinggi as Double)/(lebar+tinggi)
//                    tvHasil.text=panjang.toString()
//                }
//                if(hitungL_LuasPerm){
//                    val lebar=(luasPermukaan as Double/2-panjang as Double*tinggi as Double)/(panjang+tinggi)
//                    tvHasil.text=lebar.toString()
//                }
//                if(hitungT_LuasPerm){
//                    val tinggi=(luasPermukaan as Double/2-panjang as Double*lebar as Double)/(panjang+lebar)
//                    tvHasil.text=tinggi.toString()
//                }
            }
        }
    }

    private fun toDouble(str: String): Double? {
        return try{
            str.toDouble()
        }catch (e: NumberFormatException){
            null
        }
    }
}
