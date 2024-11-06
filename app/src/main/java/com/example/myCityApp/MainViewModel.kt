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
            Place("Mines View Park", R.drawable.mines, "Scenic Spots", "Offers stunning views of the mountains and valleys, and features souvenir stalls and cafes.", "Location: Outlook Drive, Baguio City"),
            Place("The Mansion", R.drawable.mansion, "Historical Sites", "A grand estate and official summer residence of the President of the Philippines, with beautiful gardens.", "Location: Leonard Wood Road, Baguio City"),
            Place("Baguio Cathedral", R.drawable.cathedral, "Cultural Landmarks", "A beautiful pink cathedral with intricate architecture and panoramic views of the city.", "Location: North Drive, Baguio City"),
            Place("Baguio Public Market", R.drawable.market, "Shopping & Food", "A bustling market where you can buy fresh produce, local goods, and popular Baguio delicacies.", "Location: Magsaysay Avenue, Baguio City"),
            Place("Tam-awan Village", R.drawable.tamawan, "Cultural Sites", "An artist's village showcasing Baguio’s heritage, traditional huts, and a gallery for local artists.", "Location: Longlong, Baguio City")    ),

        "Parks" to listOf(
            Place("Burnham Park", R.drawable.burnham, "Parks", "Ideal for relaxation and leisure activities.", "Location: Burnham Park, Baguio City"),
            Place("Wright Park", R.drawable.wright, "Parks", "Great for horseback riding.", "Location: wright Park Horse Stables, Baguio City"),
            Place("Mines View Park", R.drawable.mines, "Parks", "Offers breathtaking mountain views.", "Popular for scenic overlooks."),
            Place("Botanical Garden", R.drawable.botanical, "Parks", "Lush garden with walking paths.", "Features local flora and fauna."),
            Place("Eco Park", R.drawable.ecopark, "Parks", "Focus on sustainable recreation.", "Great for eco-friendly activities.")
        ),
        "Restaurants" to listOf(
            Place("Good Taste", R.drawable.goodtaste, "Restaurants", "Known for affordable prices and good food.", "tryt"),
            Place("Amare La Cucina", R.drawable.amare, "Restaurants", "Famous for its wood-fired pizza and Italian dishes.", "authentic Italian flavors"),
            Place("Bistro Lokal", R.drawable.bistro, "Restaurants", "A cozy spot for local and international comfort food.", "a mix of Filipino and Western cuisine"),
            Place("Hill Station", R.drawable.hills, "Restaurants", "Renowned for its cozy ambiance and scenic views.", "fusion of local and international dishes"),
            Place("Grumpy Joe", R.drawable.grumpy, "Restaurants", "Popular for its delicious burgers and laid-back vibe.", "casual dining with hearty meals")
        ),
        "Shopping Centers" to listOf(
            Place("SM City Baguio", R.drawable.smbg, "Shopping Centers", "SM Baguio is a vibrant shopping destination with stores, dining, and entertainment in a cool, open-air setting.", "Located on Luneta Hill, Upper Session Road."),
            Place("Porta Vaga Mall", R.drawable.porta, "Shopping Centers", "Porta Vaga Mall in Baguio offers themed buildings, a department store, food lane, and boutiques, with a focus on social and environmental responsibility.", "Located at Upper Session Road."),
            Place("Baguio Center Mall", R.drawable.center, "Shopping Centers", "Baguio Center Mall is a bustling shopping spot with diverse stores, dining, and entertainment, popular with locals and tourists. ", "Located Magsaysay Ave, Baguio City."),
            Place("Abanao Square", R.drawable.abanao, "Shopping Centers", " Abanao Square is a smaller mall known for its affordable goods and services, including apparel, personal care, electronics, banks, pawn shops, and a fitness gym. It's conveniently located near major streets and landmarks.", "Located in Abanao corner Zandu Eta Street."),
            Place("Mabini Shopping Center", R.drawable.mabini, "Shopping Centers", "Mabini Shopping Center in Baguio offers diverse shops, dining, and services, showcasing local culture in a vibrant atmosphere. ", "Located in Mabini St.")
        ),
    )


    fun loadPlaces(category: String) {
        // Load places based on the provided category
        _places.value = placeData[category] ?: emptyList()
    }
}