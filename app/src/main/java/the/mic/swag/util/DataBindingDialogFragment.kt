package com.android.dutchman.util

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.DialogFragment

abstract class DataBindingDialogFragment<T : ViewDataBinding> : DialogFragment() {

    lateinit var rootView: View
    lateinit var binding: T

    abstract val layoutId: Int

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        binding.setLifecycleOwner(this)
        rootView = binding.root
        return rootView
    }
}