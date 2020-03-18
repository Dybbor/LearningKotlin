fun main(args : Array<String>) {
    val name = "Madrigal"
    var healthPoint = 89
    val isBlessed = true //Наличие легких ран
    val isImmortal = false //бессмертие
    //Aura
    var auraColor = auraColor(isBlessed, healthPoint, isImmortal)
    val healthStatus = formatHealthStatus(healthPoint, isBlessed)
    //Status player
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)
    castFireball();
    println(sum(b=2))
}
private fun sum (a:Int = 2, b:Int =3 ):Int =  a+b
private fun printPlayerStatus(auraColor: String, isBlessed: Boolean, name: String, healthStatus: String) {
    println("(Aura: $auraColor) " + "Blessed: ${if (isBlessed) "YES" else "NO"}")
    println("$name $healthStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoint: Int, isImmortal: Boolean): String {
    val auraVision = isBlessed && healthPoint >= 50 || isImmortal
    // Аура
    var auraColor = if (auraVision) {
        "GREEN"
    } else {
        "NONE"
    }
    return auraColor
}

private fun formatHealthStatus(healthPoint: Int, isBlessed: Boolean) = when (healthPoint) {
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

private fun castFireball(numFireballs: Int = 2 ) =
    println("A glass of Fireball springs existence. (x$numFireballs)")
