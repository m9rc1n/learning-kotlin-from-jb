package ii_collections

fun example2(list: List<Int>) {

    val isZero: (Int) -> Boolean = { it == 0 }

    val hasZero: Boolean = list.any(isZero)

    val allZeros: Boolean = list.all(isZero)

    val numberOfZeros: Int = list.count(isZero)

    val firstPositiveNumber: Int? = list.firstOrNull { it > 0 }
}

// Return true if the customer is from the given city
fun Customer.isFrom(city: City) = this.city == city

// Return true if all customers are from the given city
fun Shop.checkAllCustomersAreFrom(city: City) = this.customers.all { it.isFrom(city) }

// Return true if there is at least one customer from the given city
fun Shop.hasCustomerFrom(city: City) = this.customers.any { it.isFrom(city) }

// Return the number of customers from the given city
fun Shop.countCustomersFrom(city: City) = this.customers.count { it.isFrom(city) }

// Return a customer who lives in the given city, or null if there is none
fun Shop.findAnyCustomerFrom(city: City) = this.customers.firstOrNull { it.isFrom(city) }
