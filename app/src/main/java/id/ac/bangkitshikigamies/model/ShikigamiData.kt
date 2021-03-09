package id.ac.bangkitshikigamies.model

import id.ac.bangkitshikigamies.R

object ShikigamiData {
    private val shikigamiName = arrayOf(
        "Yoto Hime",
        "Ibaraki Doji",
        "Satori",
        "Tamamo no mae",
        "Momo",
        "Yamausagi",
        "Kusa",
        "Ichimokuren",
        "Kaguya",
        "Ebisu",
        "Inugami",
        "Shuten Doji",
        "Lord Arakawa",
        "Youko",
        "Itsumade"
    )

    private val shikigamiRole = arrayOf(
        "Samurai/Ninja",
        "Samurai",
        "Samurai",
        "Mage",
        "Support",
        "Support",
        "Support",
        "Support",
        "Support",
        "Support",
        "Samurai/Ninja",
        "Samurai",
        "Mage",
        "Marksman",
        "Ninja"
    )

    private val shikigamiSpeciality = arrayOf(
        "Burst",
        "Burst/Control",
        "DPS/Rush",
        "Burst",
        "Assist/Revive",
        "Control/Speed",
        "Recovery/Carry",
        "Control/Shield",
        "Support/Control",
        "Regen/Control",
        "DPS/Charge",
        "Burst/Control",
        "DPS",
        "Burst/Harass",
        "Burst/Charge"
    )

    private val shikigamiDifficulty = arrayOf(
        "Extreme",
        "Easy",
        "Normal",
        "Hard",
        "Normal",
        "Easy",
        "Normal",
        "Hard",
        "Easy",
        "Easy",
        "Normal",
        "Normal",
        "Hard",
        "Normal",
        "Easy"
    )

    private val shikigamiIntro = arrayOf(
        "A girl holding a massive cursed blade. Originally human, but for some reason became one with the demon sword.\n" +
                "Usually looks a bit melancholic, and doesn't speak with others.\n" +
                "But during battle she becomes someone else, cruel and bloodthirsty, no one can avoid her sword, many died under it, and once she calms, she becomes wracked by guilt for the pain she's caused.\n" +
                "Sometimes might is not a good thing, you must also have the ability to withstand and control this might.\n",
        "An extremely strong youkai, with one arm cut off by Onikiri.\n" +
                "Always following Shutendouji. To him, Shutendouji is his only friend, and also the man he admires the most.\n" +
                "But Shutendouji cares not for his advances, who knows when he can be with Shutendouji again, in that forest, drinking, as in the past.\n",
        "This girl carries a spiked club on her shoulder. Her bright pink hair makes her stand out in a crowd. Her foul mouth also leaves a lasting impression. However, her cutting remarks are not necessarily meant to be malicious. For people who do not mean what they say, insults can be a form of affection. It can sometimes be an endearing trait.",
        "The unfathomable great youkai Tamamo no Mae,\n" +
                "possessing incomparable beauty and formidable demonic power.\n" +
                "Has a deep friendship with Kuzunoha who is also a fox demon, they seemed to have made some kind of agreement.\n" +
                "Although frequently appearing in the form of a elaborately dressed woman,the true appearance is not actually so.\n",
        "Momo is a spirit formed from peach blossoms. She is cheerful and kind.\n" +
                "Her closest and dearest friend is Sakura. Momo witnessed the intensity of Sakura's love and was worried that she would get hurt. Since Sakura lost her beloved, Momo has lived with her and supported her in her grief.Anyone would be lucky to have a friend like Momo.And as for Momo, she is just happy that she can be there to protect Sakura.\n",
        "This cute rabbit spirit uses her appearance to her advantage. She usually sits on a magical frog, which she likes to tease. Because she is so cute she knows she can get away with anything. Be careful not to let her make fun of you! Though it's hard to stay mad at something so cute.",
        "A timid girl carrying a piece of luminous grass. She is extremely delicate, both in looks and personality. She works tirelessly to support her companions and hopes not to be a burden. She also cares greatly for her smaller comrades. Her desire to help usually means far more to people than whether she succeeds in actually helping.",
        "Silent and reserved, a youth with hair covering an injured eye.\n" +
                "His sole companion the dragon behind him.Once a wind god protecting a region of his own.Now fallen to a demon.Just what caused him to abandon the dignity of a god?Or, did the gods abandon him?\n",
        "A girl asleep in bamboo.\n" +
                "Only discovered by chance, everyone came to love and care for her due to her elegant visage and gentle temperament. Usually a bit quiet, and often staying in her room alone.\n",
        "Legend has it that Ebisu is the bringer of wealth. But is wealth really that important? If he really does bring wealth, will he fill the world with happiness or just with greed? This is something that weighs heavily on his mind.",
        "You would be lucky to have this spirit on your side. He is upstanding, courageous and is willing to put his life on the line for his comrades.\n" +
                "After becoming a shikigami, he has been extremely loyal to his master.\n" +
                "He was once a vicious dog, feared for attacking humans, but he changed his ways for a friend.\n" +
                "The most powerful thing in the world is not violence, but kindness.\n",
        "The demon of legends who stands at the uppermost echelons of the oni.\n" +
                "He was once cruel and ruthless, with a regal bearing and the respect - and fear - of those around him.\n" +
                "But now he spends his days drowning his sorrows. Other than wine, nothing can arouse his interest. The reason?\n" +
                "His beloved Momoji does not think highly of him. But he can't run forever.\n" +
                "The old Shuten Doji will surely return one day.\n",
        "The guardian and ruler of the Arakawa River in the far east. Much has changed over the years, but the flow of the Arakawa River remains true. An autocrat and tyrant, he has strength and power enough to become a king if he so desires. He rarely smiles. Perhaps absolute power does not bring absolute happiness.",
        "A male fox spirit who wears a mask and carries a fan. Refined and polite, he always conducts himself with noble bearing. He is a fountain of knowledge on many topics and likes to talk to anyone who will listen. He is not exactly how he seems, however. Whether you're a human or a spirit, it is best to be on your guard around him.",
        "A demon living deep in the mountains, with a huge pair of wings.\n" +
                "Legends say that Itsumade grows a golden feather every year, and many people would use any cost to attain it.\n" +
                "To avoid the pursuit of humans, Itsumade tends to wander from place to place with no place to call home.\n"
    )

//    private val img = intArrayOf(
//        R.drawable.yotohime,
//        R.drawable.ibaraki,
//        R.drawable.satori,
//        R.drawable.tamamonomae,
//        R.drawable.momo,
//        R.drawable.yamausagi,
//        R.drawable.kusa,
//        R.drawable.ichimokuren,
//        R.drawable.kaguya,
//        R.drawable.ebisu,
//        R.drawable.inugami,
//        R.drawable.shuten_doji,
//        R.drawable.arakawa,
//        R.drawable.youko,
//        R.drawable.itsumade
//    )

    private val img = arrayOf(
        intArrayOf(
            R.drawable.yotohime,
            R.drawable.ibaraki_skin_1,
            R.drawable.ibaraki_skin_2
        ),
        intArrayOf(
            R.drawable.ibaraki,
            R.drawable.ibaraki_skin_1,
            R.drawable.ibaraki_skin_2
        ),
        intArrayOf(
            R.drawable.satori,
            R.drawable.ibaraki_skin_1,
            R.drawable.ibaraki_skin_2
        ),
        intArrayOf(
            R.drawable.tamamonomae,
            R.drawable.ibaraki_skin_1,
            R.drawable.ibaraki_skin_2
        ),
        intArrayOf(
            R.drawable.momo,
            R.drawable.ibaraki_skin_1,
            R.drawable.ibaraki_skin_2
        ),
        intArrayOf(
            R.drawable.yamausagi,
            R.drawable.ibaraki_skin_1,
            R.drawable.ibaraki_skin_2
        ),
        intArrayOf(
            R.drawable.kusa,
            R.drawable.ibaraki_skin_1,
            R.drawable.ibaraki_skin_2
        ),
        intArrayOf(
            R.drawable.ichimokuren,
            R.drawable.ibaraki_skin_1,
            R.drawable.ibaraki_skin_2
        ),
        intArrayOf(
            R.drawable.kaguya,
            R.drawable.ibaraki_skin_1,
            R.drawable.ibaraki_skin_2
        ),
        intArrayOf(
            R.drawable.ebisu,
            R.drawable.ibaraki_skin_1,
            R.drawable.ibaraki_skin_2
        ),
        intArrayOf(
            R.drawable.inugami,
            R.drawable.ibaraki_skin_1,
            R.drawable.ibaraki_skin_2
        ),
        intArrayOf(
            R.drawable.shuten_doji,
            R.drawable.ibaraki_skin_1,
            R.drawable.ibaraki_skin_2
        ),
        intArrayOf(
            R.drawable.arakawa,
            R.drawable.ibaraki_skin_1,
            R.drawable.ibaraki_skin_2
        ),
        intArrayOf(
            R.drawable.youko,
            R.drawable.ibaraki_skin_1,
            R.drawable.ibaraki_skin_2
        ),
        intArrayOf(
            R.drawable.itsumade,
            R.drawable.ibaraki_skin_1,
            R.drawable.ibaraki_skin_2
        )
    )

    private val icon = intArrayOf(
        R.drawable.yoto_icon,
        R.drawable.ibaraki_icon,
        R.drawable.satori_icon,
        R.drawable.tamamo_icon,
        R.drawable.momo_icon,
        R.drawable.yamausagi_icon,
        R.drawable.kusa_icon,
        R.drawable.ichimokuren_icon,
        R.drawable.kaguya_icon,
        R.drawable.ebisu_icon,
        R.drawable.inugami_icon,
        R.drawable.shuten_doji_icon,
        R.drawable.arakawa_icon,
        R.drawable.youko_icon,
        R.drawable.itsumade_icon
    )

    val listShikigami: ArrayList<Shikigami>
        get() {
            val list = arrayListOf<Shikigami>()
            for (position in shikigamiName.indices){
                val shikigami = Shikigami()
                shikigami.name = shikigamiName[position]
                shikigami.role = shikigamiRole[position]
                shikigami.speciality = shikigamiSpeciality[position]
                shikigami.difficulty = shikigamiDifficulty[position]
                shikigami.intro = shikigamiIntro[position]
                shikigami.img = img[position]
                shikigami.icon = icon[position]
                list.add(shikigami)
            }
            return list
        }
}