package com.example.b17spinnerfutbol

object TeamRepository {
    fun getTeams(): List<Team> {
        return listOf(
            Team("Racing Club", "Avellaneda", "Argentina", 1903, R.drawable.image6),
            Team("Club Nacional", "Montevideo", "Uruguay", 1899, R.drawable.image7),
            Team("SE Palmeiras", "Sao Paulo", "Brasil", 1914, R.drawable.image8),
            Team("Atlético Nacional", "Medellin", "Colombia", 1947, R.drawable.image10),
            Team("Club Olimpia", "Asuncion", "Paraguay", 1902, R.drawable.image9)
        )
    }
}