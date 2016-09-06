import io.reactivex.Observable

fun main(vararg args: String) {
    val a = Observable.just(1, 2, 3)
    val b = Observable.just(1, 2, 3)
    Observable.zip<Int, List<Int>>(listOf(a, b)) {
        it.asList()
    }.blockingForEach(::println)
}
