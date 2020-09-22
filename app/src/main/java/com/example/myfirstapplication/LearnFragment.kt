package com.example.myfirstapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController


class LearnFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_learn, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState:Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.return_button).setOnClickListener() {
            findNavController().navigate(R.id.action_learnFragment_to_FirstFragment)
        }

        val rollButton = view.findViewById<Button>(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice(view)
        }

    }
    
    private fun rollDice(view: View) {
        // Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()
        val resultText: TextView = view.findViewById<TextView>(R.id.learn_fragment_text)

        resultText.text = randomInt.toString()

    }


}