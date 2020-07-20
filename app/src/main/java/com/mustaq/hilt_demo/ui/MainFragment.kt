package com.mustaq.hilt_demo.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.mustaq.hilt_demo.R
import com.mustaq.hilt_demo.adapter.AdapterFacts
import com.mustaq.hilt_demo.dataResult.ResultData
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main.*

@AndroidEntryPoint
class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val mainViewModel by viewModels<MainViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val adapterFactsList = AdapterFacts()
        rvFacts.adapter = adapterFactsList
        val responseFromFacts = mainViewModel.getPhotoFromViewModel()

        responseFromFacts.observe(viewLifecycleOwner, Observer { responseData ->
            when (responseData) {
                is ResultData.Success -> {
                    val factsData = responseData.data!!
                    adapterFactsList.submitList(factsData)
                }
                is ResultData.Failed -> {
                    Toast.makeText(requireContext(), "Something Went Wrong", Toast.LENGTH_SHORT)
                        .show()
                }
                is ResultData.Loading -> {
                    Toast.makeText(requireContext(), "Data Loading", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }
}