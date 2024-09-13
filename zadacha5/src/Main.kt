import kotlin.math.pow

fun main() {
    println("Введите целое число n:")
    val n = readlnOrNull()?.toIntOrNull()

    println("Введите основание степени x:")
    val x = readlnOrNull()?.toIntOrNull()

    // Проверка корректности ввода
    if (n == null || x == null || x <= 1) {
        println("Ошибка: Введите корректные значения для n и x (x должно быть > 1).")
        return
    }

    var y = 0
    var degree = 1 // Начальное значение x^0

    // Ищем подходящее значение y
    while (degree < n) {
        y++
        degree = x.toDouble().pow(y.toDouble()).toInt()
    }

    // Проверяем, нашли ли мы нужное значение
    if (degree == n) {
        println("Существует целочисленный показатель степени: y = $y")
    } else {
        println("Целочисленный показатель не существует.")
    }
}