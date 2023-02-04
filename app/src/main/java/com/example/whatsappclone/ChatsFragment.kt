package com.example.whatsappclone

import android.os.Bundle
import android.view.View
import androidx.annotation.DrawableRes
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChatsFragment: Fragment(R.layout.fragment_chats) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = ChatRecyclerAdapter(getChatSampleData())
    }

    private fun getChatSampleData() = mutableListOf<Chats>().apply {

        add(
            Chats(
                name = "База",
                demoText = "всем привет!!!",
                avatar = R.drawable.ic_person,
                date = "02.02.2023"
            )
        )
        add(
            Chats(
                name = "Занга",
                demoText = "ДЭДЛАЙН!!!",
                avatar = R.drawable.ic_person,
                date = "06.05.2021"
            )
        )
        add(
            Chats(
                name = "Руся",
                demoText = "ЧЕ ТАМ!!!",
                avatar = R.drawable.ic_person,
                date = "02.01.2022"
            )
        )
        add(
            Chats(
                name = "ОЛЖИК",
                demoText = "Hello everyone!!!",
                avatar = R.drawable.ic_person,
                date = "01.02.2023"
            )
        )
    }
}

data class Chats(
    val name: String,
    val demoText: String,
    @DrawableRes val avatar: Int,
    val date: String
)