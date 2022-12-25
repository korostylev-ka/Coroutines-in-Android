package ru.netology.nmedia.model

//отвечает за состояние данных
data class FeedModelState(
    val loading: Boolean = false,
    val error: Boolean = false,
    val refreshing: Boolean = false,
)
