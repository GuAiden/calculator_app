package com.example.myfirstapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myfirstapplication.databinding.CalculatorBinding
import java.util.*
import kotlin.collections.ArrayDeque


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

    @ExperimentalStdlibApi
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Calculator part
        setListeners()



    }

    @ExperimentalStdlibApi
    private fun setListeners() {
        val calcText = binding.calcExpression
        var stack = ArrayDeque<String>(initialCapacity=20)

        // Return button direction
        binding.calculatorReturn.setOnClickListener {
            findNavController().navigate(R.id.action_calculatorFragment_to_FirstFragment)
        }

        binding.calcOne.setOnClickListener {
            initializeText()
            val text = calcText.text.toString()
            calcText.text = text + "1"
        }

        binding.calcTwo.setOnClickListener {
            initializeText()
            val text = calcText.text.toString()
            calcText.text = text + "2"
        }

        binding.calcThree.setOnClickListener {
            initializeText()
            val text = calcText.text.toString()
            calcText.text = text + "3"
        }

        binding.calcFour.setOnClickListener {
            initializeText()
            val text = calcText.text.toString()
            calcText.text = text + "4"
        }

        binding.calcFive.setOnClickListener {
            initializeText()
            val text = calcText.text.toString()
            calcText.text = text + "5"
        }

        binding.calcSix.setOnClickListener {
            initializeText()
            val text = calcText.text.toString()
            calcText.text = text + "6"
        }
        binding.calcSeven.setOnClickListener {
            initializeText()
            val text = calcText.text.toString()
            calcText.text = text + "7"
        }

        binding.calcEight.setOnClickListener {
            initializeText()
            val text = calcText.text.toString()
            calcText.text = text + "8"
        }

        binding.calcNine.setOnClickListener {
            initializeText()
            val text = calcText.text.toString()
            calcText.text = text + "9"
        }

        binding.calcZero.setOnClickListener {
            initializeText()
            val text = calcText.text.toString()
            calcText.text = text + "0"
        }

        binding.calcAdd.setOnClickListener{
            initializeText()
            val text = calcText.text.toString()
            calcText.text = text + "+"
        }

        binding.calcSub.setOnClickListener{
            initializeText()
            val text = calcText.text.toString()
            calcText.text = text + "-"
        }

        binding.calcMul.setOnClickListener{
            initializeText()
            val text = calcText.text.toString()
            calcText.text = text + "x"
        }

        binding.calcDiv.setOnClickListener{
            initializeText()
            val text = calcText.text.toString()
            calcText.text = text + "/"
        }

        binding.calcEquals.setOnClickListener{
            initializeText()
            // Push whatever is answer from the stack
            val text = calcText.text.toString()
        }

        binding.calcClear.setOnClickListener {
            initializeText()
        }
    }

    private fun initializeText() {
        val expression = binding.calcExpression
        if (expression.text == "Enter Expression:") expression.text = ""
        return
    }
}

interface Convert {
    fun isOperator(c: Char): Boolean
    fun comparePrecedence(op1:Char, op2:Char): Boolean
    fun infixToPostfix(expression: String)
}

@ExperimentalStdlibApi
class Calculator: Convert {

    private val capacity = 20
    private var stack = ArrayDeque<String>(initialCapacity = capacity)
    private var output = ArrayDeque<String>(initialCapacity = capacity)
    private val precedence = mapOf('+' to 1, '-' to 1, 'x' to 2, '/' to 2)
    private val operators = "+-*/"

    override fun isOperator(c: Char): Boolean {
        if (operators.contains(c)) {
            return true
        }
        return false
    }

    // Function assumes arguments are operators,
    // Returns true if op1 > op2 or op1 == op2 in precedence
    // Returns false if op1 < op2 in precedence
    override fun comparePrecedence(op1: Char, op2: Char): Boolean {
        val valOp1 = if (precedence.get(key=op1) != null) precedence.get(key=op1) else -1
        val valOp2 = if (precedence.get(key=op2) != null) precedence.get(key=op2) else -1

        if (valOp1 != null && valOp2 != null) {
            return valOp1 >= valOp2
        }
        return false
    }

    override fun infixToPostfix(expression: String) {
        for (c in expression.indices) {
        }
    }
}