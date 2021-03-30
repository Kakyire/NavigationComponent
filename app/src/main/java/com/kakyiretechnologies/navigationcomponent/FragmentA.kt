package com.kakyiretechnologies.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kakyiretechnologies.navigationcomponent.databinding.FragmentABinding

class FragmentA : Fragment(R.layout.fragment_a) {

    private lateinit var binding: FragmentABinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentABinding.bind(view)

        binding.openB.setOnClickListener {
           //navigate to FragmentB
            findNavController().navigate(FragmentADirections.actionFragmentAToFragmentB())
        }
    }
}