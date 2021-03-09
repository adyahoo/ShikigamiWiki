package id.ac.bangkitshikigamies.model

data class Shikigami(
    var name: String = "",
    var role: String = "",
    var speciality: String = "",
    var difficulty: String = "",
    var intro: String = "",
    var icon: Int = 0,
    var img: IntArray = intArrayOf()
)