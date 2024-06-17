package com.example.importdatareceipt

import android.os.Bundle
import android.util.Log
import android.widget.EditText
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

    data class Line(val item: String, val qtd: String, val valor: String)


    val lines = listOf(
        Line("Item 1", "1", "Valor 1"),
        Line("Item 2", "2", "Valor 2"),
        Line("Item 3", "3", "Valor 3"),
    )

        for (line in lines) {
            val row = TableRow(this)

            val itemText = EditText(this)
            itemText.setText(line.item)
            itemText.setPadding(10, 10, 10, 10)
            row.addView(itemText)

            val qtdText = EditText(this)
            qtdText.setText(line.qtd)
            qtdText.setPadding(10, 10, 10, 10)
            row.addView(qtdText)

            val valorText = EditText(this)
            valorText.setText(line.valor)
            valorText.setPadding(10, 10, 10, 10)
            row.addView(valorText)

            tabela.addView(row)
        }

    }
}