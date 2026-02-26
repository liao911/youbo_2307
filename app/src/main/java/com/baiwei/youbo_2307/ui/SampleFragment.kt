package com.baiwei.youbo_2307.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.baiwei.youbo_2307.base.BaseFragment
import com.baiwei.youbo_2307.databinding.FragmentSampleBinding
import com.baiwei.youbo_2307.viewmodel.SampleViewModel

class SampleFragment : BaseFragment<FragmentSampleBinding, SampleViewModel>() {
    override fun initBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentSampleBinding {
        return FragmentSampleBinding.inflate(inflater, container, false)
    }

    override fun viewModelClass(): Class<SampleViewModel> {
        return SampleViewModel::class.java
    }

    override fun onReady() {
        
    }
}
