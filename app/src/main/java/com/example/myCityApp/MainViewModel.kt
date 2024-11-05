package com.example.myCityApp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mycityapp.R

class MainViewModel : ViewModel() {
    private val _places = MutableLiveData<List<Place>>()
    val places: LiveData<List<Place>> get() = _places

    private val placeData = mapOf(
        "Must Visit" to listOf(
            Place("Baguio Botanical Garden", R.drawable.ic_launcher_foreground, "Kid-Friendly Places", "Great for kids to explore nature, with walking trails, sculptures, and native huts.", "Location: Leonard Wood Road, Baguio City"),
            Place("Burnham Park", R.drawable.burnham, "Kid-Friendly Places", "Perfect for family outings, featuring a lake for boat rides, bike rentals, and playgrounds.", "Location: Jose Abad Santos Drive, Baguio City"),
            Place("Children's Park", R.drawable.ic_launcher_foreground, "Kid-Friendly Places", "Fun playground and picnic area, with swings, slides, and spacious grounds.", "Location: Burnham Park, Baguio City"),
            Place("Camp John Hay", R.drawable.ic_launcher_foreground, "Kid-Friendly Places", "A nature and recreation site with picnic spots, hiking trails, and scenic views.", "Location: Loakan Road, Baguio City"),
            Place("Lion's Head", R.drawable.ic_launcher_foreground, "Kid-Friendly Places", "Popular for family photos, featuring a large lion sculpture on a scenic mountain road.", "Location: Kennon Road, Baguio City")
        ),

        "Parks" to listOf(
            Place("Burnham Park", R.drawable.burnham, "Parks", "Ideal for relaxation and leisure activities.", "Location: Burnham Park, Baguio City"),
            Place("Wright Park", R.drawable.ic_launcher_foreground, "Parks", "Great for horseback riding.", "Location: wright Park Horse Stables, Baguio City"),
            Place("Mines View Park", R.drawable.ic_launcher_foreground, "Parks", "Offers breathtaking mountain views.", "Popular for scenic overlooks."),
            Place("Botanical Garden", R.drawable.ic_launcher_foreground, "Parks", "Lush garden with walking paths.", "Features local flora and fauna."),
            Place("Eco Park", R.drawable.ic_launcher_foreground, "Parks", "Focus on sustainable recreation.", "Great for eco-friendly activities.")
        ),
        "Restaurants" to listOf(
            Place("Good Taste", R.drawable.goodtaste, "Restaurants", "Known for affordable prices and good food.", "tryt"),
            Place("Oh My Gulay", R.drawable.ic_launcher_foreground, "Restaurants", "Famous for its creative dishes.", "rhytr"),
            Place("Cafe by the Ruins", R.drawable.ic_launcher_foreground, "Restaurants", "Offers local-inspired cuisine.", "Unique cultural experience."),
            Place("Hill Station", R.drawable.ic_launcher_foreground, "Restaurants", "Renowned for its cozy ambiance.", "International and local dishes."),
            Place("Arca's Yard", R.drawable.ic_launcher_foreground, "Restaurants", "Known for its mountain views.", "Combines art gallery and cafe.")
        ),
        "Shopping Centers" to listOf(
            Place("SM City Baguio", R.drawable.smbg, "Shopping Centers", "SM Baguio is a vibrant shopping destination with stores, dining, and entertainment in a cool, open-air setting.", "Located on Luneta Hill, Upper Session Road."),
            Place("Porta Vaga Mall", R.drawable.ic_launcher_foreground, "Shopping Centers", "Porta Vaga Mall in Baguio offers themed buildings, a department store, food lane, and boutiques, with a focus on social and environmental responsibility.", "Located at Upper Session Road."),
            Place("Baguio Center Mall", R.drawable.ic_launcher_foreground, "Shopping Centers", "Baguio Center Mall is a bustling shopping spot with diverse stores, dining, and entertainment, popular with locals and tourists. ", "Located Magsaysay Ave, Baguio City."),
            Place("Abanao Square", R.drawable.ic_launcher_foreground, "Shopping Centers", " Abanao Square is a smaller mall known for its affordable goods and services, including apparel, personal care, electronics, banks, pawn shops, and a fitness gym. It's conveniently located near major streets and landmarks.", "Located in Abanao corner Zandu Eta Street."),
            Place("Mabini Shopping Center", R.drawable.ic_launcher_foreground, "Shopping Centers", "Mabini Shopping Center in Baguio offers diverse shops, dining, and services, showcasing local culture in a vibrant atmosphere. ", "Located in Mabini St.")
        ),
    )


    fun loadPlaces(category: String) {
        // Load places based on the provided category
        _places.value = placeData[category] ?: emptyList()
    }
}