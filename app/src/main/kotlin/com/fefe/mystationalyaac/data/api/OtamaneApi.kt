package com.fefe.mystationalyaac.data.api

import com.fefe.mystationalyaac.data.OtamaneConst
import com.fefe.mystationalyaac.data.repository.search.Cours
import com.fefe.mystationalyaac.data.repository.search.CoursAnimeData
import com.fefe.mystationalyaac.data.repository.search.YearAnimeData
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface OtamaneApi {
    @GET(OtamaneConst.Urls.ANIME_COURS)
    fun getCoursInfo() : Single<Cours>

    @GET(OtamaneConst.Urls.ANIME_YEAR)
    fun getYearAnime(@Path("year") year: Int) : Single<List<YearAnimeData>>

    @GET(OtamaneConst.Urls.ANIME_YEAR_COURS)
    fun getYearCoursAnime(@Path("year") year: Int, @Path("cours") cours: Int) : Single<List<CoursAnimeData>>
}
