package com.example.checkme.fragment

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.example.checkme.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button : AppCompatButton by lazy { view.findViewById(R.id.button) }
        button.setOnClickListener {
            Toast.makeText(context,"눌려짐",Toast.LENGTH_SHORT).show()
        }
    }

}