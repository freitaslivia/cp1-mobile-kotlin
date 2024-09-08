package com.example.cp1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

class TaskFragment : Fragment() {

    private var isFirstImage = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_task, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageView = view.findViewById<ImageView>(R.id.imageView8)

        imageView.setOnClickListener {
            if (isFirstImage) {
                imageView.setImageResource(R.drawable.ic_check)
            } else {
                imageView.setImageResource(R.drawable.quadrado)
            }
            isFirstImage = !isFirstImage
        }
    }
}
