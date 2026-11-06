package com.example.b17spinnerfutbol

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class SpinnerAdapter(
    context: Context,
    private val list: List<Team>
) : ArrayAdapter<Team>(context, 0, list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return createItemView(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return createItemView(position, convertView, parent)
    }

    private fun createItemView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.elemento, parent, false)

        val team = list[position]

        val name = view.findViewById<TextView>(R.id.name)
        val year = view.findViewById<TextView>(R.id.year)
        val country = view.findViewById<TextView>(R.id.country)
        val city = view.findViewById<TextView>(R.id.city)
        val crest = view.findViewById<ImageView>(R.id.escudo)

        name.text = team.name
        year.text = team.year.toString()
        country.text = team.country
        city.text = team.city
        crest.setImageResource(team.crest)

        return view
    }
}