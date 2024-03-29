package ii_collections

fun example6() {
    val sum = listOf(1, 5, 3).sum()
}

// Return the sum of prices of all products that a customer has ordered.
// Note: a customer may order the same product for several times.
fun Customer.getTotalOrderPrice(): Double {
    return this.orderedProducts.sumByDouble { it.price }
}
