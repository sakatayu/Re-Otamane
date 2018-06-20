package com.dmm.banusy.data.api.model

/**
 * A generic class that holds a value with its loading status.
 * @param <T>
 * </T>
 */
data class Resource<out T>(val status: Status, val data: T?, val error: Throwable?) {
    companion object {
        fun <T> success(data: T?): Resource<T> {
            return Resource(Status.SUCCESS, data, null)
        }

        fun <T> error(error: Throwable?): Resource<T> {
            return Resource(Status.ERROR, null, error)
        }

        fun <T> loading(data: T?): Resource<T> {
            return Resource(Status.LOADING, data, null)
        }
    }
}
