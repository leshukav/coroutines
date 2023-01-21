package ru.netology.coroutines.dto

import ru.netology.coroutines.enumeration.AttachmentType

class Attachment {
    data class Attachment(
        val url: String,
        val description: String,
        val type: AttachmentType,
    )
}