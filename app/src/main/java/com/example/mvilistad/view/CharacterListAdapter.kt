package com.example.mvilistad.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvilistad.R
import com.example.mvilistad.api.CharacterService
import kotlinx.android.synthetic.main.character_item.view.*

//1) tienen que heredar de un adapter
// para RecyclerView.
//2) El patron ViewHolder para mapear
// la info de tus Vistas dibujadas ya no es
// opcional se tiene que usar si o si
class CharacterListAdapter(
    val characters: List<com.example.mvilistad.model.Character>
): RecyclerView.Adapter<CharacterListAdapter.DataViewHolder>() {

    //clase se comporte como un ViewHolder
    // debe heredar del ViewHolder de RecyclerView
    class DataViewHolder(
        itemView: View): RecyclerView.ViewHolder(itemView) {
            //Asignar a cada objeto que van a crear valores
        // a los diferentes atributos de la vista
        // ejemplo al text de un TEXTVIEW
        // al src de una IMAGEVIEW
            fun bind(character: com.example.mvilistad.model.Character) {
                itemView.txtName.text = character.name
                itemView.txtLocation.text = character.location
                //Gestionar el tratamiento de la imagen desde internet
                //val url = CharacterService.BASE_URL + character.image
                Glide.with(itemView.ivCharacter.context)
                    .load(character.image)
                    .circleCrop()//la imagen va a ser redondeada
                    .into(itemView.ivCharacter)
            }

    }

    //crea una instancia de ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.character_item, parent, false)
            )

    //Esta funcion recibe el ViewHolder creado en la anterior funcion
    // en el parametro holder y aca es donde te encargas de que
    //cada componente mapeado registre valores especificos para que layout
    // que va a ser dibujado
    //position = posicion del layout dibujado puesto en la lista
    //      empieza en 0 y generalmente coincide con el indice de un array
    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(characters[position])
    }

    override fun getItemCount(): Int = characters.size
}






