package ii_collections

fun example1(list: List<Int>) {

    // If a lambda has exactly one parameter, that parameter can be accessed as 'it'
    val positiveNumbers = list.filter { it > 0 }

    val squares = list.map { it * it }
}

// Return the set of cities the customers are from
fun Shop.getCitiesCustomersAreFrom() = this.customers.map { it.city }.toSet()

// Return a list of the customers who live in the given city
fun Shop.getCustomersFrom(city: City) = this.customers.filter { it.city.equals(city) }.toList()

