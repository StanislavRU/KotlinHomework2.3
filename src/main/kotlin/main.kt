fun main() {
    val currentPurchase = 12000.51
    val previousPurchase = 20000.0
    val discountOne = 100.0
    val discountTwo = 0.05
    val discountThree = 0.01
    val musicLover = true

    var totalPrice = currentPurchase
    if (previousPurchase > 1001 && previousPurchase <= 10000) {
        totalPrice -= discountOne
    }
    if (previousPurchase >= 10001) {
        totalPrice = ((totalPrice - totalPrice * discountTwo) * 100).toInt().toDouble() / 100
    }
    if (musicLover) {
        totalPrice = ((totalPrice - totalPrice * discountThree) * 100).toInt().toDouble() / 100
    }
    println("Стоимость покупки без скидок: $currentPurchase руб.\nСтоимость покупки со скидками: $totalPrice руб.")
}