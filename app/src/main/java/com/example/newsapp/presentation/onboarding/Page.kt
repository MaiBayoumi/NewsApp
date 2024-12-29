package com.example.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
    )

val pages = listOf(
    Page(
        title = "Your News, Your Way",
        description = "Get the latest news tailored to your interests. " +
                "Select topics and stay updated with what matters most to you.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Curated for You",
        description = "Dive into a personalized feed designed around your preferences. " +
                "Explore categories, local updates, and trending stories seamlessly.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Stay Connected, Always",
        description = "Access news on the go. " +
                "Bookmark articles to read later and never miss a story.",
        image = R.drawable.onboarding3
    )
)