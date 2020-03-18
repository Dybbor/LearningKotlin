fun main(args : Array<String>) {
    val name = "Madrigal"
    var healthPoint = 89
    val isBlessed = true //Наличие легких ран
    val isImmortal = false //бессмертие
    val auraVision = isBlessed && healthPoint >= 50 || isImmortal
    val karma = (Math.pow(Math.random(), ((110 - healthPoint ) /100).toDouble()) * 20 ).toInt()
    // Аура
    var auraColor = when(karma){
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        else -> "green"
    }
    //if (auraVision )
    //    auraColor = "green"

    val healthStatus = when (healthPoint) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks  pretty hurt."
        else -> "is in awful condition!"
    }
    val statusFormatString = "(HP:%d)(A: %s) -> H%s"
    //Статус
    println("(HP:$healthPoint)(Aura: $auraColor) -> $healthStatus")
}