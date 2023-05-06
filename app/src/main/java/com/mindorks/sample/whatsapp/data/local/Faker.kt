package com.mindorks.sample.whatsapp.data.local

import com.mindorks.sample.whatsapp.R
import com.mindorks.sample.whatsapp.data.model.Call
import com.mindorks.sample.whatsapp.data.model.Chat
import com.mindorks.sample.whatsapp.data.model.Conversation
import com.mindorks.sample.whatsapp.data.model.Status

val calls = mutableListOf<Call>().apply {
    add(
        Call(
            "Magda",
            "https://www.xtrafondos.com/thumbs/1_11495.jpg",
            "Ayer",
            R.drawable.ic_down_missed
        )
    )
    add(
        Call(
            "Amilcar H.",
            "https://i.pinimg.com/736x/8d/dc/93/8ddc93f3bf31e8323313abd477c723e9.jpg",
            "Hoy",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Leonel",
            "https://media.sproutsocial.com/uploads/2022/06/profile-picture.jpeg",
            "22/04/20",
            R.drawable.ic_down_missed
        )
    )
    add(
        Call(
            "Ronaldo :)",
            "https://i.pinimg.com/originals/25/99/5a/25995a3e56511279f71ddfe531733abd.jpg",
            "18/04/20",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Martin Marques",
            "https://i.pinimg.com/736x/93/4d/a8/934da8e9a2c393665b4c7f417b9a6985.jpg",
            "10/04/20",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Analy :)",
            "https://i.pinimg.com/originals/46/a5/1d/46a51d6edb28bea15bc63412b5c34ecb.jpg",
            "9/04/20",
            R.drawable.ic_down_missed
        )
    )
    add(
        Call(
            "Elmer Mamani",
            "https://i.pinimg.com/736x/21/fd/00/21fd00d7f0ceb88678dc2c24ebede494.jpg",
            "19/03/20",
            R.drawable.ic_down_incoming
        )
    )

}

val chatsList = mutableListOf<Chat>().apply {

    add(
        Chat(
            "Alfredo Mescco",
            "https://pbs.twimg.com/profile_images/1272263441894555648/YZ26yEVj_400x400.jpg",
            "Hla Broo que ta \uD83D\uDE01 ",
            "11:45 AM",
            "12"
        )
    )
    add(
        Chat(
            "Martin Marques",
            "https://i.pinimg.com/736x/93/4d/a8/934da8e9a2c393665b4c7f417b9a6985.jpg",
            "Q tal mano, cuando salimos de paseo \uD83E\uDD23 \uD83D\uDE05",
            "12:30 AM",
            "2"
        )
    )
    add(
        Chat(
            "Analy :) ",
            "https://i.pinimg.com/originals/46/a5/1d/46a51d6edb28bea15bc63412b5c34ecb.jpg",
            "\uD83E\uDD13 \uD83D\uDE0E \uD83E\uDD78 ",
            "09:32 AM",
            "5"
        )
    )
    add(
        Chat(
            "Ronaldo :)",
            "https://i.pinimg.com/originals/25/99/5a/25995a3e56511279f71ddfe531733abd.jpg",
            "Mano cuando jugamos \uD83E\uDD71 \uD83E\uDD20  ",
            "08:30 PM",
            "6"
        )
    )
    add(
        Chat(
            "Elmer Mamani",
            "https://i.pinimg.com/736x/21/fd/00/21fd00d7f0ceb88678dc2c24ebede494.jpg",
            "Stas en casa  \uD83E\uDD33 \uD83D\uDCAA ",
            "18/04/20",
            "7"
        )
    )
    add(
        Chat(
            "Magda :) ",
            "https://www.xtrafondos.com/thumbs/1_11495.jpg",
            "Niño, ya cenaste \uD83D\uDC40  \uD83D\uDC7B",
            "18:30 PM",
            "1"
        )
    )
    add(
        Chat(
            "Leydi Prima",
            "https://profilepicture7.com/bao/bao_dongman/1/-1447231681.jpg",
            "Primito dnd estas \uD83E\uDEE3 \uD83E\uDD17",
            "11:20 AM",
            "2"
        )
    )
    add(
        Chat(
            "Amilcar H.",
            "https://i.pinimg.com/736x/8d/dc/93/8ddc93f3bf31e8323313abd477c723e9.jpg",
            "Abre mano, me hace frio \uD83E\uDD76 ",
            "09:30 AM",
            "5"
        )
    )
    add(
        Chat(
            "Proyecto Arduino :)",
            "https://www.nobbot.com/wp-content/uploads/2021/07/amigos.jpg",
            "luis: Que hora nos reunimos \uD83E\uDD14",
            "Hoy",
            "3"
        )
    )
    add(
        Chat(
            "Leonel",
            "https://media.sproutsocial.com/uploads/2022/06/profile-picture.jpeg",
            "Le dices que venga temprano \uD83D\uDE00 \uD83D\uDE03",
            "20/02/20",
            "9"
        )
    )


}.toList()

val statusList = mutableListOf<Status>().apply {
    add(
        Status(
            "Alfredo Mescco",
            "https://pbs.twimg.com/profile_images/1272263441894555648/YZ26yEVj_400x400.jpg",
            "Hoy, 4.50 pm"
        )
    )
    add(
        Status(
            "Martin Marques",
            "https://i.pinimg.com/736x/93/4d/a8/934da8e9a2c393665b4c7f417b9a6985.jpg",
            "Hoy, 10.00 am"
        )
    )
    add(
        Status(
            "Analy :)",
            "https://i.pinimg.com/originals/46/a5/1d/46a51d6edb28bea15bc63412b5c34ecb.jpg",
            "Lunes"
        )
    )
    add(
        Status(
            "Ronaldo :)",
            "https://i.pinimg.com/originals/25/99/5a/25995a3e56511279f71ddfe531733abd.jpg",
            "Martes"
        )
    )
    add(
        Status(
            "Elmer Mamani",
            "https://i.pinimg.com/736x/21/fd/00/21fd00d7f0ceb88678dc2c24ebede494.jpg",
            "22/04/20"
        )
    )
    add(
        Status(
            "Magda :)",
            "https://www.xtrafondos.com/thumbs/1_11495.jpg",
            "18/04/20"
        )
    )
    add(
        Status(
            "Leydi Prima",
            "https://profilepicture7.com/bao/bao_dongman/1/-1447231681.jpg",
            "10/04/20"
        )
    )
    add(
        Status(
            "Amilcar H.",
            "https://i.pinimg.com/736x/8d/dc/93/8ddc93f3bf31e8323313abd477c723e9.jpg",
            "9/04/20"
        )
    )
    add(
        Status(
            "Leonel",
            "https://media.sproutsocial.com/uploads/2022/06/profile-picture.jpeg",
            "19/03/20"
        )
    )

}.toList()


val chat = mutableListOf<Conversation>().apply {
    add(Conversation(1, "hola \uD83D\uDE43 "))
    add(Conversation(2, "hl \uD83E\uDD13"))
    add(Conversation(1, "ktal \uD83E\uDEE1"))
    add(Conversation(1, "todo bien ? \uD83D\uDE3A \uD83D\uDE38"))
    add(Conversation(2, "igual mano \uD83D\uDE3C"))
    add(Conversation(1, "Mano \uD83D\uDD90 ✋ "))
    add(Conversation(2, "Dime "))
    add(Conversation(1, "Ya hiciste el los labs \uD83D\uDC48 \uD83D\uDC49"))
    add(Conversation(1, "Solo es asta hoy \uD83E\uDD19 "))
    add(Conversation(2, "Estoy en eso mano ✍️"))
    add(Conversation(1, "ahh dale dale \uD83E\uDD32 \uD83E\uDD1D"))
    add(Conversation(2, "si mano y tu \uD83D\uDC40 \uD83D\uDC41 ???"))
    add(Conversation(1, "Igual mano \uD83D\uDCAA \uD83E\uDDBE"))
    add(Conversation(1, "Solo me falta de Web \uD83E\uDD13 \uD83D\uDE0E"))
    add(Conversation(2, "Piola manito \uD83D\uDE0E"))
}

fun addChat(text: String) = chat.add(Conversation(1, text))