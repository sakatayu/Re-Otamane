package com.fefe.mystationalyaac.data.repository.search

data class CoursAnimeData(
        val id: Int,
        // タイトル
        val title: String,
        // タイトル略称1
        val title_short1: String,
        // タイトル略称2
        val title_short2: String,
        // タイトル略称3
        val title_short3: String,
        // 公式ページURL
        val public_url: String,
        // TwitterID
        val twitter_account: String,
        // TwitterHashTag
        val twitter_hashtag: String,
        // 春夏秋冬どの時期のアニメか
        val cours_id: Int,
        // 0:男性向け 1:女性向け
        val sex: Int,
        // 今何期か
        val sequel: Int,
        val city_code: Int,
        // 聖地の場所
        val city_name: String
)
