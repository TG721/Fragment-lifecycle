package com.ibsu.fragment_lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class HomeFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Function call, onAttach", "Fragment onAttach called")

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Function call, onCreate", "Fragment onCreate called")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        Log.d("Function call, onCreateView", "Fragment onCreateView called")
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Function call, onViewCreated", "Fragment onViewCreated called")

        val button = requireActivity().findViewById<Button>(R.id.button)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_secondFragment)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Function call, onStart", "Fragment onStart called")

    }

    override fun onResume() {
        super.onResume()
        Log.d("Function call, onResume", "Fragment onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Function call, onPause", "Fragment onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Function call, onStop", "Fragment onStop called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Function call, onDestroyView", "Fragment onDestroyView called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Function call, onDestroy", "Fragment onDestroy called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Function call, onDetach", "Fragment onDetach called")

    }



}