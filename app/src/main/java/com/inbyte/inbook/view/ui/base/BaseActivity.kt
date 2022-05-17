package com.inbyte.inbook.view.ui.base

import android.content.DialogInterface
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.inbyte.inbook.R
import com.inbyte.inbook.databinding.DialogLoaderBinding

abstract class BaseActivity<B : ViewDataBinding, out VM : BaseViewModel> : AppCompatActivity() {

    protected lateinit var binding: B
    private lateinit var baseBinding: DialogLoaderBinding
    protected abstract val viewModel: VM

    override fun setContentView(layoutResID: Int) {
        baseBinding = DataBindingUtil.inflate(layoutInflater, R.layout.dialog_loader, null, false)
        binding =
            DataBindingUtil.inflate(layoutInflater, layoutResID, baseBinding.activityContent, true)
        super.setContentView(baseBinding.root)
        supportActionBar?.hide()
        baseBinding.lifecycleOwner = this
        binding.lifecycleOwner = this

        setUpView()
    }

    private fun setUpView() {
        baseBinding.baseViewModel = viewModel
        baseBinding.btBack.setOnClickListener {
            onBackPressed()
        }
    }

    open fun showToastMessage(message: String, isShortMessage: Boolean = true) {
        Toast.makeText(
            this,
            message,
            if (isShortMessage) Toast.LENGTH_SHORT else Toast.LENGTH_LONG
        ).show()
    }

    open fun showBasicAlert(message: String) {
        lateinit var dialog: AlertDialog
        val builder = AlertDialog.Builder(this)
        builder.setMessage(message)
        val dialogClickListner = DialogInterface.OnClickListener { _, which ->
            when (which) {
                DialogInterface.BUTTON_POSITIVE -> {

                }
            }
        }
        builder.setPositiveButton("OK", dialogClickListner)
        dialog = builder.create()
        dialog.setOnShowListener {
            // need to set colour
        }
        dialog.show()
    }

    open fun showBasicAlert(title: String, message: String) {
        lateinit var dialog: AlertDialog
        val builder = AlertDialog.Builder(this)
        builder.setTitle(title)
        builder.setMessage(message)
        val dialogClickListner = DialogInterface.OnClickListener { _, which ->
            when (which) {
                DialogInterface.BUTTON_POSITIVE -> {

                }
            }
        }
        builder.setPositiveButton("OK", dialogClickListner)
        dialog = builder.create()
        dialog.setOnShowListener {
            // need to set colour
        }
        dialog.show()
    }

    abstract fun observeViewModel()
    protected abstract fun initViewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewBinding()
        observeViewModel()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }


}