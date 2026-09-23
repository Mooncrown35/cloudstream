package com.lagradost.cloudstream3.utils

import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.MovieSearchResponse
import com.lagradost.cloudstream3.TvSeriesSearchResponse
import com.lagradost.cloudstream3.AnimeSearchResponse

val SearchResponse.year: Int?
    get() = when (this) {
        is MovieSearchResponse -> this.year
        is TvSeriesSearchResponse -> this.year
        is AnimeSearchResponse -> this.year
        else -> null
    }

val SearchResponse.genres: List<String>?
    get() = when (this) {
        else -> null
    }

val SearchResponse.originalLanguage: String?
    get() = when (this) {
        else -> null
    }
