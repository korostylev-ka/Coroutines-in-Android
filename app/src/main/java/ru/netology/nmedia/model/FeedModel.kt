package ru.netology.nmedia.model

import ru.netology.nmedia.dto.Post
//отвечает за данные
data class FeedModel(
    //список постов
    val posts: List<Post> = emptyList(),
    //флаг, пустой или нет
    val empty: Boolean = false,
)
