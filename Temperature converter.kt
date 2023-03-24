fun main() {
    printFinalTemperature(initialMeasurement = 27.0, initialUnit = "Celcius",
                          finalUnit = "Fahrenheit"
    ){
        (1.8 * it) + 32
    }
    printFinalTemperature(initialMeasurement = 350.0 , initialUnit = "Kelvin",
                          finalUnit = "Celcius"
    ){
        it - 273.15
    }
    printFinalTemperature(initialMeasurement = 10.0, initialUnit = "Fahrenheit ",
                          finalUnit = "Kelvin"
    ){
        (0.55555556 * (it - 32)) + 273.15
    }
    
}


fun printFinalTemperature(
    initialMeasurement: Double, 
    initialUnit: String, 
    finalUnit: String, 
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}