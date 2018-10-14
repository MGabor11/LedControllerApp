package com.apppoweron.ledstripcontrol

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.apppoweron.ledstripcontrol.viewmodel.WalkthroughViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class WalkthroughFragment : DaggerFragment(){

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var viewModel: WalkthroughViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this, viewModelFactory)[WalkthroughViewModel::class.java]
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_walkthrough, container, false)
    }

}
