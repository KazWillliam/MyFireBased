package com.example.myfirebased

import java.text.SimpleDateFormat

data class User (
    var name: String? = "",
    var phone: String? ="",
    val created_at: Long =  System.currentTimeMillis()
)