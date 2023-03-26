package kz.kuz.dialogfragment

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class DialogWindow : DialogFragment() {
//    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
//        return AlertDialog.Builder(activity!!)
//                .setTitle("Window title")
//                .setMessage("Yohoho and rum bottle!!!")
//                .setPositiveButton(android.R.string.ok) { dialog, which -> Toast.makeText(
//                        context, "OK", Toast.LENGTH_SHORT).show() }
//                .setNegativeButton(android.R.string.cancel) { dialog, which -> Toast.makeText(
//                        context, "CANCEL", Toast.LENGTH_SHORT).show() }
//                .create()
//    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.dialog_window, container, false)
        val submitBtn = view.findViewById<Button>(R.id.submit_btn)
        submitBtn.setOnClickListener { dialog!!.dismiss() }
        return view
    }
}