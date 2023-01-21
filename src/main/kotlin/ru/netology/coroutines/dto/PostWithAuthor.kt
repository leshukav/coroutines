package ru.netology.coroutines.dto

data class PostWithAuthorAndComments(
    val post: Post,
    val author: Author,
    val comments: List<Comment>,
)
