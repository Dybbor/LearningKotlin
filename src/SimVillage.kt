fun main() {
    runSimulation("Robert",::printConstructionCost){ playerName, numBuildings->
        var currentYear = 2020
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}

private inline fun runSimulation(playerName : String,
                                 costPrinter : (Int)-> Unit,
                                 greetingFunction : (String, Int) -> String)
{
    val numBuilding = (1..3).shuffled().last()
    costPrinter(numBuilding)
    println(greetingFunction(playerName,numBuilding))
}
private fun printConstructionCost(numBuildings: Int): Unit
{
    val cost = 500
    println("construction cost: ${cost*numBuildings}")
}