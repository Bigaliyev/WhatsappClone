package com.example.whatsappclone

import android.os.Bundle
import android.view.View
import androidx.annotation.DrawableRes
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StatusFragment: Fragment(R.layout.fragment_status) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = StatusRecyclerAdapter(getStatusSampleData())
    }

    private fun getStatusSampleData() = mutableListOf<Status>().apply {
        add(
            Status(
                name = "База",
                demoText = "все хорошо !!!",
                avatar = R.drawable.ic_person,
                date = "02.02.2023"
            )
        )
        add(
            Status(
                name = "Занга",
                demoText = "бари керемет!!!",
                avatar = R.drawable.ic_person,
                date = "06.05.2021"
            )
        )
        add(
            Status(
                name = "Руся",
                demoText = "ищемизба!",
                avatar = R.drawable.ic_person,
                date = "02.01.2022"
            )
        )
        add(
            Status(
                name = "ОЛЖИК",
                demoText = "Чалю!",
                avatar = R.drawable.ic_person,
                date = "01.02.2023"
            )
        )
    }
}
data class Status(
    val name: String,
    val demoText: String,
    @DrawableRes val avatar: Int,
    val date: String
)