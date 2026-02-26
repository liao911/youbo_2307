package com.baiwei.youbo_2307.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding, VM : ViewModel> : AppCompatActivity() {
    protected lateinit var binding: VB
    protected lateinit var viewModel: VM

    abstract fun initBinding(inflater: LayoutInflater): VB
    abstract fun viewModelClass(): Class<VM>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = initBinding(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[viewModelClass()]
        onReady()
    }

    open fun onReady() {}
}
