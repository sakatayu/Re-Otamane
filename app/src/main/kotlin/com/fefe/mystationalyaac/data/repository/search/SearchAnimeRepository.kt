package com.fefe.mystationalyaac.data.repository.search

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.dmm.banusy.data.api.model.Resource
import com.fefe.mystationalyaac.data.api.OtamaneApi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class SearchAnimeRepository @Inject constructor(private val api: OtamaneApi) {

    // どのクールのアニメ情報があるか
    fun getCours() : LiveData<Resource<Cours>>{
        val resource = MutableLiveData<Resource<Cours>>()
        api.getCoursInfo()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .doOnSubscribe { resource.postValue(Resource.loading(null)) }
                .subscribe({
                    resource.postValue(Resource.success(it))
                },{
                    resource.postValue(Resource.error(it))
                })

        return resource
    }

    // 年単位でのアニメ一覧の取得
    fun getYearAnimeList(year: Int) : LiveData<Resource<List<YearAnimeData>>> {
        val resource = MutableLiveData<Resource<List<YearAnimeData>>>()
        api.getYearAnime(year)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .doOnSubscribe { resource.postValue(Resource.loading(null)) }
                .subscribe({
                    resource.postValue(Resource.success(it))
                },{
                    resource.postValue(Resource.error(it))
                })

        return resource
    }

    // クール単位でのアニメ一覧の取得
    fun getCoursAnimeList(year: Int, cours: Int) : LiveData<Resource<List<CoursAnimeData>>> {
        val resource = MutableLiveData<Resource<List<CoursAnimeData>>>()
        api.getYearCoursAnime(year, cours)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .doOnSubscribe { resource.postValue(Resource.loading(null)) }
                .subscribe({
                    resource.postValue(Resource.success(it))
                }, {
                    resource.postValue(Resource.error(it))
                })

        return resource
    }
}
