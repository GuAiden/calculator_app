package com.example.myfirstapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myfirstapplication.databinding.CalculatorBinding

//// TODO: Rename parameter arguments, choose names that match
//// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CalculatorFragment : Fragment() {
//    // TODO: Rename and change types of parameters
//    private var param1: String? = null
//    private var param2: String? = null
    private var _binding: CalculatorBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = CalculatorBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Return button direction
        binding.calculatorReturn.setOnClickListener {
            findNavController().navigate(R.id.action_calculatorFragment_to_FirstFragment)
        }

        // Calculator part
        val expression = binding.calcExpression

        binding.calcOne.setOnClickListener {
            initializeText()
            val text = expression.text.toString()
            expression.text = text + "1"
        }

        binding.calcTwo.setOnClickListener {
            initializeText()
            val text = expression.text.toString()
            expression.text = text + "2"
        }

        binding.calcThree.setOnClickListener {
            initializeText()
            val text = expression.text.toString()
            expression.text = text + "3"
        }

        binding.calcFour.setOnClickListener {
            initializeText()
            val text = expression.text.toString()
            expression.text = text + "4"
        }

        binding.calcFive.setOnClickListener {
            initializeText()
            val text = expression.text.toString()
            expression.text = text + "5"
        }

        binding.calcSix.setOnClickListener {
            initializeText()
            val text = expression.text.toString()
            expression.text = text + "6"
        }
        binding.calcSeven.setOnClickListener {
            initializeText()
            val text = expression.text.toString()
            expression.text = text + "7"
        }

        binding.calcEight.setOnClickListener {
            initializeText()
            val text = expression.text.toString()
            expression.text = text + "8"
        }

        binding.calcNine.setOnClickListener {
            initializeText()
            val text = expression.text.toString()
            expression.text = text + "9"
        }

        binding.calcZero.setOnClickListener {
            initializeText()
            val text = expression.text.toString()
            expression.text = text + "0"
        }
    }

//    private fun calculate() {
//    }

    private fun initializeText() {
        val expression = binding.calcExpression
        if (expression.text == "Enter Expression:") expression.text = ""
        return
    }

//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment BlankFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//                BlankFragment().apply {
//                    arguments = Bundle().apply {
//                        putString(ARG_PARAM1, param1)
//                        putString(ARG_PARAM2, param2)
//                    }
//                }
//    }
}