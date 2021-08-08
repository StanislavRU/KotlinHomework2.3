import kotlin.math.roundToInt

fun main() {
    val currentPurchase = 12000.51
    val previousPurchase = 20000.0
    val discountOne = 100.0
    val discountTwo = 0.05
    val discountThree = 0.01
    val musicLover = true


    println("Стоимость покупки без скидки: $currentPurchase рублей")
    var totalPrice = currentPurchase

    while (true) {
        if (previousPurchase > 1001 && previousPurchase <= 10000) {
            totalPrice -= discountOne
            println("Стоимость покупки со скидкой 100 руб: $totalPrice рублей")
            break
        }
        if (previousPurchase >= 10000) {
            totalPrice = ((totalPrice - totalPrice * discountTwo) * 100).toInt().toDouble() / 100
            println("Стоимость покупки со скидкой 5%: $totalPrice рублей")
            break
        }
        break
    }

    if (musicLover) {
        totalPrice = ((totalPrice - totalPrice * discountThree) * 100).toInt().toDouble() / 100
        println("Стоимость покупки с дополнительной скидкой 1% для меломанов: $totalPrice рублей")
    }
}