package com.example.importdatareceipt

import android.os.Bundle
import android.util.Log
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_verify_results : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_verify_results)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    var tabela: TableLayout = findViewById(R.id.tableResults);

    data class Line(val column: String, val valor: String)


    val lines = listOf(
        Line("Item 1", "Valor 1"),
        Line("Item 2", "Valor 2"),
        Line("Item 3", "Valor 3")
    )

        for (line in lines) {
            val row = TableRow(this)
                val tv: TextView = TextView(this)
                tv.setText("${line.column}")
                tv.setPadding(10,10,10,10)
                row.addView(tv)

            tabela.addView(row)
        }

    }
}