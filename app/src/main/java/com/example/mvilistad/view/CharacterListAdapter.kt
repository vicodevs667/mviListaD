package com.example.mvilistad.view

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

//1) tienen que heredar de un adapter
// para RecyclerView.
//2) El patron ViewHolder para mapear
// la info de tus Vistas dibujadas ya no es
// opcional se tiene que usar si o si
class CharacterListAdapter(
    characters: List<com.example.mvilistad.model.Character>
): RecyclerView.Adapter<CharacterListAdapter.DataViewHolder>() {

    //clase se comporte como un ViewHolder
    // debe heredar del ViewHolder de RecyclerView
    class DataViewHolder(
        itemView: View): RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}