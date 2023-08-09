package com.example.menylar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.tv_name)

        // bu menu bir matoba bosilganda ishledi
        textView.setOnClickListener {
            val popupMenu = PopupMenu(this,textView)
            popupMenu.inflate(R.menu.my_menu)
            popupMenu.setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.delete->{
                        Toast.makeText(this, "delete", Toast.LENGTH_SHORT).show()
                    }
                    R.id.edit->{
                        Toast.makeText(this, "edit", Toast.LENGTH_SHORT).show()
                    }
                }
                true
            }
            popupMenu.show()
        }

        // registerForContextMenu(textView) bu kod oncreatecontextmenu ni ishlatib beradi
    }
// bu yerda option menu korinishi va listeneri bor
    /* // bu yerda option menu ni korsatish uchun
     override fun onCreateOptionsMenu(menu: Menu?): Boolean {
         menuInflater.inflate(R.menu.my_menu, menu)
         return super.onCreateOptionsMenu(menu)
     }

     // bu yerda option menu ishlatyapmiz listenerlari
     override fun onOptionsItemSelected(item: MenuItem): Boolean {
         when (item.itemId) {
             R.id.edit -> {
                 Toast.makeText(this, "tahrirlash", Toast.LENGTH_SHORT).show()
             }
             R.id.delete -> {
                 Toast.makeText(this, "ochirish", Toast.LENGTH_SHORT).show()
             }
         }
         return super.onOptionsItemSelected(item)
     }*/

    // bu yerdan bosib turganda ishledi menu
    /*override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.my_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        Toast.makeText(this, "bu yerga hohlagan narsangni yoz", Toast.LENGTH_SHORT).show()
        return super.onContextItemSelected(item)
    }*/




}