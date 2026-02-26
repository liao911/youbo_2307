package com.baiwei.youbo_2307

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.fragment.app.commit
import com.baiwei.youbo_2307.base.BaseActivity
import com.baiwei.youbo_2307.databinding.ActivityMainBinding
import com.baiwei.youbo_2307.ui.CategoryFragment
import com.baiwei.youbo_2307.ui.HomeFragment
import com.baiwei.youbo_2307.ui.MineFragment
import com.baiwei.youbo_2307.viewmodel.SampleViewModel

class MainActivity : BaseActivity<ActivityMainBinding, SampleViewModel>() {
    override fun initBinding(inflater: android.view.LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater)
    }

    override fun viewModelClass(): Class<SampleViewModel> {
        return SampleViewModel::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
    }

    override fun onReady() {
        val home = HomeFragment()
        val category = CategoryFragment()
        val mine = MineFragment()
        supportFragmentManager.commit {
            replace(R.id.container, home, "home")
        }
        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    supportFragmentManager.commit {
                        replace(R.id.container, home, "home")
                    }
                    true
                }
                R.id.nav_category -> {
                    supportFragmentManager.commit {
                        replace(R.id.container, category, "category")
                    }
                    true
                }
                R.id.nav_mine -> {
                    supportFragmentManager.commit {
                        replace(R.id.container, mine, "mine")
                    }
                    true
                }
                else -> false
            }
        }
    }
}
