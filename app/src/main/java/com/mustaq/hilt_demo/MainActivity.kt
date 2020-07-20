package com.mustaq.hilt_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.mustaq.hilt_demo.ui.MainFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		val mainFragment=MainFragment()
		supportFragmentManager.findFragmentById(R.id.fmMainContainer)
		setFragment(mainFragment)
	}

	fun setFragment(fragment: Fragment?) {
		val fragmentManager:FragmentManager=supportFragmentManager
		val fragmentTransaction:FragmentTransaction=fragmentManager.beginTransaction()
		fragmentTransaction.replace(android.R.id.content,fragment!!)
		fragmentTransaction.commit()
	}
}