package com.inakikeiji.menghitungbalok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.NumberFormatException

class HitungActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edtPanjang: EditText
    private lateinit var edtLebar: EditText
    private lateinit var edtTinggi: EditText
    private lateinit var btnHitung: Button
    private lateinit var tvHasil: TextView

    companion object{
        const val EXTRA_RUMUS="extra_rumus"

        const val EXTRA_HITUNG_VOL="extra_hitungVol"
        const val EXTRA_HITUNG_LUASPERM="extra_hitungLuasPerm"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung)

        val actionbar=supportActionBar
        actionbar!!.title="Hitung"

        edtPanjang=findViewById(R.id.edt_panjang)
        edtLebar=findViewById(R.id.edt_lebar)
        edtTinggi=findViewById(R.id.edt_tinggi)
        btnHitung=findViewById(R.id.btn_hitung)
        tvHasil=findViewById(R.id.tv_hasil)

        btnHitung.setOnClickListener(this)

        val tvRumus=findViewById<TextView>(R.id.tv_rumus)
        val rumus=intent.getStringExtra(EXTRA_RUMUS)
        tvRumus.text=rumus
    }

    override fun onClick(v: View) {
        if(v.id==R.id.btn_hitung){
            val inputPanjang=edtPanjang.text.toString().trim()
            val inputLebar=edtLebar.text.toString().trim()
            val inputTinggi=edtTinggi.text.toString().trim()

            val hitungVol=intent.getBooleanExtra(EXTRA_HITUNG_VOL,false)
            val hitungLuasPerm=intent.getBooleanExtra(EXTRA_HITUNG_LUASPERM,false)

            var fieldKosong=false
            var doubleInvalid=false

            val panjang=toDouble(inputPanjang)
            val lebar=toDouble(inputLebar)
            val tinggi=toDouble(inputTinggi)

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


            if(panjang==null&&inputPanjang.isNotEmpty()){
                doubleInvalid=true
                edtPanjang.error="Field ini harus berupa nomer yang valid"
            }
            if(lebar==null&&inputLebar.isNotEmpty()){
                doubleInvalid=true
                edtLebar.error="Field ini harus berupa nomer yang valid"
            }
            if(tinggi==null&&inputTinggi.isNotEmpty()){
                doubleInvalid=true
                edtTinggi.error="Field ini harus berupa nomer yang valid"
            }


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
