package com.example.whatsappclone

import android.os.Bundle
import android.view.View
import androidx.annotation.DrawableRes
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CallsFragment: Fragment(R.layout.fragment_calls) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = CallsRecyclerAdapter(getCallsSampleData())
    }
    private fun getCallsSampleData() = mutableListOf<Calls>().apply {
        add(
            Calls(
                name = "База",
                demoText = "исходящий",
                avatar = com.google.android.material.R.drawable.material_ic_menu_arrow_up_black_24dp,
                date = "02.02.2023"
            )
        )
        add(
            Calls(
                name = "База",
                demoText = "исходящий",
                avatar = com.google.android.material.R.drawable.material_ic_menu_arrow_up_black_24dp,
                date = "02.02.2023"
            )
        )
        add(
            Calls(
                name = "Руся",
                demoText = "входящий",
                avatar = com.google.android.material.R.drawable.material_ic_menu_arrow_down_black_24dp,
                date = "02.01.2022"
            )
        )
        add(
            Calls(
                name = "База",
                demoText = "исходящий",
                avatar = com.google.android.material.R.drawable.material_ic_menu_arrow_up_black_24dp,
                date = "02.02.2023"
            )
        )


        add(
            Calls(
                name = "Занга",
                demoText = "входящий",
                avatar = com.google.android.material.R.drawable.material_ic_menu_arrow_down_black_24dp,
                date = "06.05.2021"
            )
        )
        add(
            Calls(
                name = "Руся",
                demoText = "входящий",
                avatar = com.google.android.material.R.drawable.material_ic_menu_arrow_down_black_24dp,
                date = "02.01.2022"
            )
        )
        add(
            Calls(
                name = "ОЛЖИК",
                demoText = "входящий",
                avatar = com.google.android.material.R.drawable.material_ic_menu_arrow_down_black_24dp,
                date = "01.02.2023"
            )
        )
    }
}
data class Calls(
    val name: String,
    val demoText: String,
    @DrawableRes val avatar: Int,
    val date: String
)